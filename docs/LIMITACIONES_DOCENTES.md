# Estado docente de los ejemplos

Se conservan versiones de clase, incluidos métodos comentados o pendientes. No son aplicaciones de producción ni una colección de soluciones evaluables.

- **Pokémon**: la entrada `pokemon.Principal` demuestra los saludos polimórficos. Captura, defensa y algunos ataques contienen métodos vacíos o respuestas provisionales. El bloque comentado que instancia la clase base abstracta es histórico y no debe activarse sin adaptarlo.
- **recap**: menú de eventos parcial; algunas opciones no tienen implementación, la lectura de líneas tras `nextInt` requiere revisión y la validación de contraseña no coincide con todas las condiciones del comentario. `App.java`, vacío, no se incorpora.
- **Tres en raya**, ambas variantes: falta resolver correctamente el final en empate. La variante procedural no valida los límites antes de acceder a la matriz y se inicia llamando a `TresEnRaya.inicializarTablero()` (no tiene `main`).
- **HundirFlota1D**: el historial de torpedos inicializado a cero impide disparar a esa posición; puede agotar las posiciones disponibles y quedarse en el bucle de selección. Falta validar el límite inferior al colocar el barco. Se conserva para trabajar arrays, con estas incidencias explícitas.
- **Colecciones / PostOfficeApp**: el menú exterior es continuo; salir de una sesión vuelve al login. Los usuarios de ejemplo están en memoria.
- **PasswordChecker**: el orden de comprobaciones y la expresión regular de longitud requieren revisión; compila, pero no se certifica su validación funcional.
- **Utilidades**: varias funciones de primalidad no contemplan números menores que 2; el factorial recursivo no trata cero/negativos y usa `int`. Algunos métodos crean repetidamente `Scanner` sobre `System.in`, por lo que las entradas redirigidas pueden comportarse de forma distinta a la entrada manual.
- **NotaDeExamen**: el caso 6 no incluye `break` y continúa al caso siguiente. Se conserva para revisión docente.
- **Principal de POO**: se corrige la creación de cada `Granja`; conserva métodos auxiliares de repaso y bloques comentados, algunos incompletos.

Estas limitaciones ya estaban en los originales. Se documentan sin rediseñar los ejercicios durante la migración. Las pruebas ejecutan solo los casos concretos indicados en el verificador.
