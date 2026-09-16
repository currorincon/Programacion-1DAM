# Programación — 1º DAM

Material docente de Java reorganizado desde `currorincon/programacionDAM` y `currorincon/Ejericios`.

La migración está preparada para revisión en `importacion-material`: **143 archivos Java incorporados y 6 ejemplos anteriores conservados**. Los repositorios originales permanecen intactos.

## Organización

- [01-fundamentos](01-fundamentos/README.md): Hola Mundo, tipos, String inicial, Scanner, JOptionPane, operadores aritméticos y de bits, ecuación de segundo grado.
- [02-condicionales](02-condicionales/README.md): Mayor/menor, paridad, categorías, notas, calculadoras y devolución de monedas. Se conservan los bloques originales.
- [03-bucles](03-bucles/README.md): For/while/do-while, acumuladores, centinelas, medias, límites, tablas de multiplicar y suma de primos. Iteradores.java trata bucles.
- [04-arrays-strings](04-arrays-strings/README.md): Arrays, matrices, búsqueda, desplazamientos cíclicos, ordenación, cadenas, palíndromos, cifrado César, pangramas y sorteo de repaso.
- [05-poo](05-poo/README.md): Persona y variantes static/no static; Animal, Persona, Granja y Principal del repositorio Ejericios.
- [06-herencia-polimorfismo](06-herencia-polimorfismo/README.md): Jerarquía Animal/Perro/Gato/Burro, animales voladores/terrestres, interfaces y empleados por horas/a tiempo completo.
- [07-colecciones](07-colecciones/README.md): Oficina de paquetes: ArrayList, Map, Queue, usuarios, altas y retiradas. Entrada: modulo5.coleccionDatos.Principal.
- [08-excepciones](08-excepciones/README.md): Try/catch, excepciones checked y propias, validación de contraseñas y recap de eventos con interfaces y colecciones.
- [09-proyectos](09-proyectos/README.md): Pokémon, Space Invader, colección de antigüedades, Hundir la Flota 1D y dos variantes de Tres en Raya.
- [10-utilidades](10-utilidades/README.md): Paquetes utils y utilidades, conservados por separado para respetar las dependencias; ejemplos de Date y Calendar.

## Compilar y ejecutar

Requiere JDK 17 o posterior. Desde la raíz, en macOS/Linux:

```sh
mkdir -p build/classes
find 0* 10-utilidades -name '*.java' -print > build/fuentes.txt
javac --release 17 -encoding UTF-8 -d build/classes @build/fuentes.txt
java -cp build/classes pokemon.Principal
java -cp build/classes modulo4Objetos.ejemplo2.Principal
```

Cada carpeta `src` es una raíz de fuentes. Se mantienen los paquetes originales para conservar los imports entre ejemplos; añade las raíces `src` y `10-utilidades/src` en tu IDE. Los seis ejemplos iniciales quedan sin paquete para ser coherentes con sus rutas actuales y también se compilan con el comando anterior (por ejemplo, `java -cp build/classes Palindromo`). No hay dependencias externas ni descriptor modular.

Para comprobar compilación, paquetes, exclusiones y casos representativos (requiere Python 3):

```sh
python3 herramientas/verificar.py
```

## Revisión de la migración

- [Inventario completo, orígenes, exclusiones y cambios](docs/MIGRACION.md).
- [Limitaciones y borradores de clase conservados](docs/LIMITACIONES_DOCENTES.md).
- [Criterio de selección](PLAN_MIGRACION.md).

Hay programas interactivos, ejemplos Swing y métodos auxiliares sin `main`. Compilar todos los archivos no implica que todos los ejercicios estén terminados; consulta las limitaciones antes de usarlos en clase.
