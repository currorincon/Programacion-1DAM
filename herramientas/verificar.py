#!/usr/bin/env python3
"""Comprueba la selección, compila todo y ejecuta casos representativos."""
import hashlib
import json
import re
import subprocess
import tempfile
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
rows = json.loads((ROOT / 'docs/inventario-migracion.json').read_text())
files = sorted((ROOT / '00-ejercicios').rglob('*.java'))
assert len(files) == 149, f'Se esperaban 149 fuentes, hay {len(files)}'
classes = set()
for p in files:
    text = p.read_text(encoding='utf-8')
    package = re.search(r'^package\s+([\w.]+);', text, re.M)
    qualified = (package[1] + '.' if package else '') + p.stem
    assert qualified not in classes, f'Clase duplicada: {qualified}'
    classes.add(qualified)
    if 'src' in p.parts:
        relative = p.relative_to(next(a for a in p.parents if a.name == 'src'))
        expected = Path(*package[1].split('.'), p.name) if package else Path(p.name)
        assert relative == expected, f'Paquete/ruta incoherente: {p}'
    else:
        assert package is None, f'Ejemplo independiente con paquete: {p}'
    assert '\ufffd' not in text, f'Codificación dañada: {p}'
    assert not re.search(r'java\.sql|jdbc:|aucorsa', text, re.I), f'Dependencia excluida: {p}'
for r in rows:
    if r['destination']:
        assert (ROOT / r['destination']).is_file(), r
        assert r['reason'] == '', r
    else:
        assert r['reason'], r
for p in ROOT.rglob('*'):
    if '.git' in p.parts or 'build' in p.parts:
        continue
    assert p.name not in {'.DS_Store', '.idea', '.project', '.classpath', '.settings'}, p
    assert p.suffix not in {'.iml', '.class'}, p
    assert not any(s.lower() == 'accesodatos' for s in p.parts), p

exams = sorted((ROOT / '11-examenes').rglob('*.java'))
assert len(exams) == 4
for entry in json.loads((ROOT / '11-examenes/inventario.json').read_text()):
    assert hashlib.sha256((ROOT / entry['path']).read_bytes()).hexdigest() == entry['sha256'], entry

cases = [
    ('bienvenida.ejercicios.Ejemplo01_HolaMundo', '', ['Hola Mundo4']),
    ('ComprobarNumeroPar', '4\n', ['El número es par']),
    ('ComprobarNumeroPar', '3\n', ['El número es impar']),
    ('MultiplosHasta100', '25\n', ['25\n50\n75']),
    ('MultiplosHasta100', '0\n', ['mayor que cero']),
    ('Palindromo', 'Anita lava la tina\n', ['Es palíndromo']),
    ('Palindromo', 'Java\n', ['No es palíndromo']),
    ('modulo4Objetos.ejemplo2.Principal', '', ['75.0', 'Juan']),
    ('pokemon.Principal', '', ['soy pokemon fuego', 'Soy Pokemon Agua', 'soy pokemon de Tierra']),
    ('modulo6.dateExceptions.EjemploExcepcionesBasico', '', ['Terminando']),
]
with tempfile.TemporaryDirectory(prefix='programacion-1dam-') as temp:
    subprocess.run(['javac', '--release', '17', '-encoding', 'UTF-8', '-d', temp,
                    *map(str, files + exams)], check=True)
    for classname, stdin, expected in cases:
        result = subprocess.run(['java', '-cp', temp, classname], input=stdin,
                                capture_output=True, text=True, timeout=10, check=True)
        assert all(s in result.stdout for s in expected), (classname, result.stdout)
print(f'OK: {len(files)} ejercicios y {len(exams)} archivos de exámenes compilados; paquetes, exclusiones y {len(cases)} casos verificados.')
