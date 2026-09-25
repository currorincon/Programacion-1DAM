# 11-examenes

Exámenes recuperados de los repositorios originales, sin alterar su código ni comentarios.

- [Examen general](programacionDAM/DAM_PROGRAMACION/src/examen/Examen.java): ejercicios y variantes de resolución.
- [Final del 27/04/2025](programacionDAM/DAM_PROGRAMACION/src/examenes/final27042025/): `Ejercicio1.java` y `Unfichero.java`.
- [Examen de Primitivas](Ejericios/src/ExamenPrimitivas.java).

Son 4 archivos Java. Se conservan sus enunciados y soluciones tal como estaban; hay métodos incompletos y variantes comentadas. `Ejercicio01_NotaDeExamen.java` continúa en condicionales porque es un ejercicio sobre notas, no un examen.

Los imports `utils` y `utilidades` usan las clases de `00-ejercicios/10-utilidades/src`. Los exámenes se compilan junto con los ejercicios con:

```sh
mkdir -p build/classes
find 00-ejercicios 11-examenes -name '*.java' -print > build/fuentes.txt
javac --release 17 -encoding UTF-8 -d build/classes @build/fuentes.txt
```

El [inventario](inventario.json) registra las huellas SHA-256 para verificar la conservación exacta de los exámenes.
