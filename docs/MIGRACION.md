# Migración del material histórico

Material consolidado en `00-ejercicios` y exámenes recuperados en `11-examenes`. Los repositorios originales permanecen intactos. La selección inicial excluía exámenes; esta exclusión queda revocada por petición del docente.

## Orígenes fijados

- `currorincon/programacionDAM` en `e95fae8d7e78ae9358301aac161152531f7a0dcd`: 110 Java incorporados.
- `currorincon/Ejericios` en `61255a12abfec0272fbe8a9cb8597a992728f7de`: 33 Java incorporados.

## Contenido incorporado

| Bloque | Java nuevos |
|---|---:|
| 01-fundamentos | 9 |
| 02-condicionales | 13 |
| 03-bucles | 17 |
| 04-arrays-strings | 35 |
| 05-poo | 7 |
| 06-herencia-polimorfismo | 12 |
| 07-colecciones | 4 |
| 08-excepciones | 15 |
| 09-proyectos | 26 |
| 10-utilidades | 5 |

143 archivos Java nuevos; se conservan los 6 ejemplos anteriores (149 en total). Las versiones históricas conservan sus paquetes y las versiones iniciales simplificadas siguen en su ubicación anterior. No se ha borrado ningún archivo preexistente. A los seis ejemplos anteriores se les retira la declaración de paquete, ya que sus carpetas no reflejaban esos paquetes; siguen siendo ejecutables independientes en las mismas rutas.

## Criterios y limpieza

- Se conservan nombres, paquetes, comentarios docentes, algoritmos y variantes históricas. Cada paquete coincide con su ruta relativa a `src`; las clases sin paquete están directamente en `src`.
- Normalización de saltos de línea, espacios finales y líneas vacías repetidas; reparación de tildes dañadas; retirada de imports SQL/JDK internos no utilizados y del comentario automático del IDE.
- Declaración `package bienvenida` en `bienvenida/Ejercicio.java`, ausente en origen.
- Inicialización de los objetos de `Granja` antes de acceder a ellos y corrección de la ruta de reflexión de `Persona`, con constructor explícito.
- `Iteradores.java` se clasifica en bucles: enseña `for/while/do-while`, no Iterator de colecciones.
- `Ejercicio01_NotaDeExamen.java` se conserva: es un ejemplo de switch que clasifica notas, no una solución de una prueba evaluable.
- `recap` se mantiene unido en excepciones por sus referencias entre interfaces, eventos, usuarios y excepciones; también practica colecciones.
- El esqueleto vacío `recap/App.java` no se copia. El descriptor modular original tampoco, para no arrastrar dependencias del proyecto monolítico.

## Verificación

- Compilación conjunta de los 149 Java con `javac --release 17 -encoding UTF-8` (JDK instalado: 25.0.2).
- Revisión automática de paquetes/rutas, clases duplicadas, archivos no permitidos y dependencias SQL.
- Pruebas de ejecución representativas disponibles con `python3 herramientas/verificar.py`.
- La compilación no acredita todos los caminos interactivos ni convierte los borradores en aplicaciones terminadas. Consulta [las limitaciones conocidas](LIMITACIONES_DOCENTES.md).

## Inventario exacto

Cada archivo versionado de ambos orígenes figura a continuación. [Versión JSON](inventario-migracion.json).

| Origen | Destino o motivo de exclusión |
|---|---|
| `programacionDAM/.gitignore` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `programacionDAM/DAM_PROGRAMACION/.DS_Store` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `programacionDAM/DAM_PROGRAMACION/.classpath` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `programacionDAM/DAM_PROGRAMACION/.gitignore` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `programacionDAM/DAM_PROGRAMACION/.project` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `programacionDAM/DAM_PROGRAMACION/.settings/org.eclipse.core.resources.prefs` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `programacionDAM/DAM_PROGRAMACION/.settings/org.eclipse.jdt.core.prefs` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `programacionDAM/DAM_PROGRAMACION/src/.DS_Store` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `programacionDAM/DAM_PROGRAMACION/src/bienvenida/.DS_Store` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `programacionDAM/DAM_PROGRAMACION/src/bienvenida/Ejercicio.java` | [01-fundamentos/src/bienvenida/Ejercicio.java](../00-ejercicios/01-fundamentos/src/bienvenida/Ejercicio.java) |
| `programacionDAM/DAM_PROGRAMACION/src/bienvenida/ejercicios/Ejemplo01_HolaMundo.java` | [01-fundamentos/src/bienvenida/ejercicios/Ejemplo01_HolaMundo.java](../00-ejercicios/01-fundamentos/src/bienvenida/ejercicios/Ejemplo01_HolaMundo.java) |
| `programacionDAM/DAM_PROGRAMACION/src/bienvenida/ejercicios/Ejemplo02_TiposPrimitivos.java` | [01-fundamentos/src/bienvenida/ejercicios/Ejemplo02_TiposPrimitivos.java](../00-ejercicios/01-fundamentos/src/bienvenida/ejercicios/Ejemplo02_TiposPrimitivos.java) |
| `programacionDAM/DAM_PROGRAMACION/src/bienvenida/ejercicios/Ejemplo03_IntroduccionString.java` | [01-fundamentos/src/bienvenida/ejercicios/Ejemplo03_IntroduccionString.java](../00-ejercicios/01-fundamentos/src/bienvenida/ejercicios/Ejemplo03_IntroduccionString.java) |
| `programacionDAM/DAM_PROGRAMACION/src/bienvenida/ejercicios/Ejemplo04_LecturaDeDatosDelUsuarioConJOptionPane.java` | [01-fundamentos/src/bienvenida/ejercicios/Ejemplo04_LecturaDeDatosDelUsuarioConJOptionPane.java](../00-ejercicios/01-fundamentos/src/bienvenida/ejercicios/Ejemplo04_LecturaDeDatosDelUsuarioConJOptionPane.java) |
| `programacionDAM/DAM_PROGRAMACION/src/bienvenida/ejercicios/Ejemplo05_LecturaDeDatosDelUsuarioConScanner.java` | [01-fundamentos/src/bienvenida/ejercicios/Ejemplo05_LecturaDeDatosDelUsuarioConScanner.java](../00-ejercicios/01-fundamentos/src/bienvenida/ejercicios/Ejemplo05_LecturaDeDatosDelUsuarioConScanner.java) |
| `programacionDAM/DAM_PROGRAMACION/src/bienvenida/ejercicios/Ejemplo06_OperacionesAritmeticasBasicas.java` | [01-fundamentos/src/bienvenida/ejercicios/Ejemplo06_OperacionesAritmeticasBasicas.java](../00-ejercicios/01-fundamentos/src/bienvenida/ejercicios/Ejemplo06_OperacionesAritmeticasBasicas.java) |
| `programacionDAM/DAM_PROGRAMACION/src/bienvenida/ejercicios/Ejemplo07_OperadoresANivelDeBits.java` | [01-fundamentos/src/bienvenida/ejercicios/Ejemplo07_OperadoresANivelDeBits.java](../00-ejercicios/01-fundamentos/src/bienvenida/ejercicios/Ejemplo07_OperadoresANivelDeBits.java) |
| `programacionDAM/DAM_PROGRAMACION/src/bienvenida/ejercicios/Ejemplo08_CalculoSolucionesEcuacionSegundoGrado.java` | [01-fundamentos/src/bienvenida/ejercicios/Ejemplo08_CalculoSolucionesEcuacionSegundoGrado.java](../00-ejercicios/01-fundamentos/src/bienvenida/ejercicios/Ejemplo08_CalculoSolucionesEcuacionSegundoGrado.java) |
| `programacionDAM/DAM_PROGRAMACION/src/examen/Examen.java` | [11-examenes/programacionDAM/DAM_PROGRAMACION/src/examen/Examen.java](../11-examenes/programacionDAM/DAM_PROGRAMACION/src/examen/Examen.java) |
| `programacionDAM/DAM_PROGRAMACION/src/examenes/final27042025/Ejercicio1.java` | [11-examenes/programacionDAM/DAM_PROGRAMACION/src/examenes/final27042025/Ejercicio1.java](../11-examenes/programacionDAM/DAM_PROGRAMACION/src/examenes/final27042025/Ejercicio1.java) |
| `programacionDAM/DAM_PROGRAMACION/src/examenes/final27042025/Unfichero.java` | [11-examenes/programacionDAM/DAM_PROGRAMACION/src/examenes/final27042025/Unfichero.java](../11-examenes/programacionDAM/DAM_PROGRAMACION/src/examenes/final27042025/Unfichero.java) |
| `programacionDAM/DAM_PROGRAMACION/src/module-info.java` | **Excluido:** Descriptor del proyecto monolítico con dependencias ajenas a esta selección |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejemplos/Ejercicio1.java` | [02-condicionales/src/modulo1Condicionales/ejemplos/Ejercicio1.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejemplos/Ejercicio1.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio01_MayorDeDosNumerosIntroducidos.java` | [02-condicionales/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio01_MayorDeDosNumerosIntroducidos.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio01_MayorDeDosNumerosIntroducidos.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio02_MenorDeDosNumerosIntroducidos.java` | [02-condicionales/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio02_MenorDeDosNumerosIntroducidos.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio02_MenorDeDosNumerosIntroducidos.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio03_MayorDeCincoVariables.java` | [02-condicionales/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio03_MayorDeCincoVariables.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio03_MayorDeCincoVariables.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio05_MayorYMenorDeCincoVariables.java` | [02-condicionales/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio05_MayorYMenorDeCincoVariables.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio05_MayorYMenorDeCincoVariables.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio06_ComprobarNumeroPar.java` | [02-condicionales/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio06_ComprobarNumeroPar.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio06_ComprobarNumeroPar.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio07_ComprobarNumeroParANivelDeBits.java` | [02-condicionales/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio07_ComprobarNumeroParANivelDeBits.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejercicios/bloque01/Ejercicio07_ComprobarNumeroParANivelDeBits.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejercicios/bloque02/Ejercicio01_SumaDeNumerosPorCategorias.java` | [02-condicionales/src/modulo1Condicionales/ejercicios/bloque02/Ejercicio01_SumaDeNumerosPorCategorias.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejercicios/bloque02/Ejercicio01_SumaDeNumerosPorCategorias.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejercicios/bloque02/Ejercicio02_ContadoresDeNumerosPorCategorias.java` | [02-condicionales/src/modulo1Condicionales/ejercicios/bloque02/Ejercicio02_ContadoresDeNumerosPorCategorias.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejercicios/bloque02/Ejercicio02_ContadoresDeNumerosPorCategorias.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejercicios/bloque03/Ejercicio01_NotaDeExamen.java` | [02-condicionales/src/modulo1Condicionales/ejercicios/bloque03/Ejercicio01_NotaDeExamen.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejercicios/bloque03/Ejercicio01_NotaDeExamen.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejercicios/bloque03/Ejercicio02_CalculadoraAvanzada.java` | [02-condicionales/src/modulo1Condicionales/ejercicios/bloque03/Ejercicio02_CalculadoraAvanzada.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejercicios/bloque03/Ejercicio02_CalculadoraAvanzada.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejercicios/bloque03/Ejercicio03_CalculadoraGeometria.java` | [02-condicionales/src/modulo1Condicionales/ejercicios/bloque03/Ejercicio03_CalculadoraGeometria.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejercicios/bloque03/Ejercicio03_CalculadoraGeometria.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo1Condicionales/ejercicios/bloque03/Ejercicio04_DevolucionEnMonedas.java` | [02-condicionales/src/modulo1Condicionales/ejercicios/bloque03/Ejercicio04_DevolucionEnMonedas.java](../00-ejercicios/02-condicionales/src/modulo1Condicionales/ejercicios/bloque03/Ejercicio04_DevolucionEnMonedas.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejemplos/BucleFor.java` | [03-bucles/src/modulo2Bucles/ejemplos/BucleFor.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejemplos/BucleFor.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejemplos/Ejercicio1Clase.java` | [03-bucles/src/modulo2Bucles/ejemplos/Ejercicio1Clase.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejemplos/Ejercicio1Clase.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejemplos/LuckyNumber.java` | [03-bucles/src/modulo2Bucles/ejemplos/LuckyNumber.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejemplos/LuckyNumber.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejercicios/bloque01/Ejercicio01_SumarNumerosMayoresDe10.java` | [03-bucles/src/modulo2Bucles/ejercicios/bloque01/Ejercicio01_SumarNumerosMayoresDe10.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejercicios/bloque01/Ejercicio01_SumarNumerosMayoresDe10.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejercicios/bloque01/Ejercicio02_SumarNumerosMayoresDe10TantosComoQuieraUsuario.java` | [03-bucles/src/modulo2Bucles/ejercicios/bloque01/Ejercicio02_SumarNumerosMayoresDe10TantosComoQuieraUsuario.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejercicios/bloque01/Ejercicio02_SumarNumerosMayoresDe10TantosComoQuieraUsuario.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejercicios/bloque01/Ejercicio03_PositivosYNegativosTantosComoQuieraUsuario.java` | [03-bucles/src/modulo2Bucles/ejercicios/bloque01/Ejercicio03_PositivosYNegativosTantosComoQuieraUsuario.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejercicios/bloque01/Ejercicio03_PositivosYNegativosTantosComoQuieraUsuario.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejercicios/bloque02/Ejercicio01_MediaTantosComoQuieraUsuario.java` | [03-bucles/src/modulo2Bucles/ejercicios/bloque02/Ejercicio01_MediaTantosComoQuieraUsuario.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejercicios/bloque02/Ejercicio01_MediaTantosComoQuieraUsuario.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejercicios/bloque02/Ejercicio02_MayorYMenorTantosComoQuieraUsuario.java` | [03-bucles/src/modulo2Bucles/ejercicios/bloque02/Ejercicio02_MayorYMenorTantosComoQuieraUsuario.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejercicios/bloque02/Ejercicio02_MayorYMenorTantosComoQuieraUsuario.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejercicios/bloque02/Ejercicio03_MultiplosHastaUnLimite.java` | [03-bucles/src/modulo2Bucles/ejercicios/bloque02/Ejercicio03_MultiplosHastaUnLimite.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejercicios/bloque02/Ejercicio03_MultiplosHastaUnLimite.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejercicios/bloque02/Ejercicio04_MultiplosHastaUnLimiteDadoPorUsuario.java` | [03-bucles/src/modulo2Bucles/ejercicios/bloque02/Ejercicio04_MultiplosHastaUnLimiteDadoPorUsuario.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejercicios/bloque02/Ejercicio04_MultiplosHastaUnLimiteDadoPorUsuario.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejercicios/bloque03/Ejercicio01_SumaMediaNumerosHasta0.java` | [03-bucles/src/modulo2Bucles/ejercicios/bloque03/Ejercicio01_SumaMediaNumerosHasta0.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejercicios/bloque03/Ejercicio01_SumaMediaNumerosHasta0.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejercicios/bloque03/Ejercicio02_MayorMenorNumerosHasta0.java` | [03-bucles/src/modulo2Bucles/ejercicios/bloque03/Ejercicio02_MayorMenorNumerosHasta0.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejercicios/bloque03/Ejercicio02_MayorMenorNumerosHasta0.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejercicios/bloque03/Ejercicio03_TablaDeMultiplicarHasta0.java` | [03-bucles/src/modulo2Bucles/ejercicios/bloque03/Ejercicio03_TablaDeMultiplicarHasta0.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejercicios/bloque03/Ejercicio03_TablaDeMultiplicarHasta0.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo2Bucles/ejercicios/bloque03/Ejercicio04_ContadorPositivosYNegativosHasta0.java` | [03-bucles/src/modulo2Bucles/ejercicios/bloque03/Ejercicio04_ContadorPositivosYNegativosHasta0.java](../00-ejercicios/03-bucles/src/modulo2Bucles/ejercicios/bloque03/Ejercicio04_ContadorPositivosYNegativosHasta0.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/.DS_Store` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejemplos/EjemplosIniciales.java` | [04-arrays-strings/src/modulo3Arrays/ejemplos/EjemplosIniciales.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejemplos/EjemplosIniciales.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejemplos/EjemplosOrdenacion.java` | [04-arrays-strings/src/modulo3Arrays/ejemplos/EjemplosOrdenacion.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejemplos/EjemplosOrdenacion.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejemplos/Ejercicio3.java` | [04-arrays-strings/src/modulo3Arrays/ejemplos/Ejercicio3.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejemplos/Ejercicio3.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejemplos/Matrices.java` | [04-arrays-strings/src/modulo3Arrays/ejemplos/Matrices.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejemplos/Matrices.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejemplos/tresenraya/Jugador.java` | [09-proyectos/tres-en-raya-objetos/src/modulo3Arrays/ejemplos/tresenraya/Jugador.java](../00-ejercicios/09-proyectos/tres-en-raya-objetos/src/modulo3Arrays/ejemplos/tresenraya/Jugador.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejemplos/tresenraya/Principal.java` | [09-proyectos/tres-en-raya-objetos/src/modulo3Arrays/ejemplos/tresenraya/Principal.java](../00-ejercicios/09-proyectos/tres-en-raya-objetos/src/modulo3Arrays/ejemplos/tresenraya/Principal.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejemplos/tresenraya/Tablero.java` | [09-proyectos/tres-en-raya-objetos/src/modulo3Arrays/ejemplos/tresenraya/Tablero.java](../00-ejercicios/09-proyectos/tres-en-raya-objetos/src/modulo3Arrays/ejemplos/tresenraya/Tablero.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque01/Ejercicio01_150ElementosEnArray_SumaMediaMayorMenor.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque01/Ejercicio01_150ElementosEnArray_SumaMediaMayorMenor.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque01/Ejercicio01_150ElementosEnArray_SumaMediaMayorMenor.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque01/Ejercicio02_150ElementosEnArray_SumaMediaMayorMenorEntreLimites.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque01/Ejercicio02_150ElementosEnArray_SumaMediaMayorMenorEntreLimites.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque01/Ejercicio02_150ElementosEnArray_SumaMediaMayorMenorEntreLimites.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque01/Ejercicio03_MuestraArrayEnOrdenInverso.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque01/Ejercicio03_MuestraArrayEnOrdenInverso.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque01/Ejercicio03_MuestraArrayEnOrdenInverso.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque01/Ejercicio04_EncuentraElementoEnArray.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque01/Ejercicio04_EncuentraElementoEnArray.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque01/Ejercicio04_EncuentraElementoEnArray.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque01/Ejercicio05_SumaValoresParesEImpares.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque01/Ejercicio05_SumaValoresParesEImpares.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque01/Ejercicio05_SumaValoresParesEImpares.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque01/Ejercicio06_SumaValoresIndicePar.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque01/Ejercicio06_SumaValoresIndicePar.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque01/Ejercicio06_SumaValoresIndicePar.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque02/Ejercicio01_ParesCambianSignoEnArray.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque02/Ejercicio01_ParesCambianSignoEnArray.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque02/Ejercicio01_ParesCambianSignoEnArray.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque02/Ejercicio02_DosArraysCrearTercerArray.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque02/Ejercicio02_DosArraysCrearTercerArray.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque02/Ejercicio02_DosArraysCrearTercerArray.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque02/Ejercicio03_MultiplicaElementosArray.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque02/Ejercicio03_MultiplicaElementosArray.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque02/Ejercicio03_MultiplicaElementosArray.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque02/Ejercicio04_DeplazamientoCiclicoDerecha.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque02/Ejercicio04_DeplazamientoCiclicoDerecha.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque02/Ejercicio04_DeplazamientoCiclicoDerecha.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque02/Ejercicio05_DeplazamientoCiclicoDerechaLugaresPersonalizados.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque02/Ejercicio05_DeplazamientoCiclicoDerechaLugaresPersonalizados.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque02/Ejercicio05_DeplazamientoCiclicoDerechaLugaresPersonalizados.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque02/Ejercicio06_DeplazamientoCiclicoLugaresYDireccionPersonalizadas.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque02/Ejercicio06_DeplazamientoCiclicoLugaresYDireccionPersonalizadas.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque02/Ejercicio06_DeplazamientoCiclicoLugaresYDireccionPersonalizadas.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque03/Ejemplo04_OrdenacionSeleccion.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque03/Ejemplo04_OrdenacionSeleccion.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque03/Ejemplo04_OrdenacionSeleccion.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque03/Ejercicio01_OrdenacionBurbuja.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque03/Ejercicio01_OrdenacionBurbuja.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque03/Ejercicio01_OrdenacionBurbuja.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque03/Ejercicio03_OrdenacionBurbujaShell.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque03/Ejercicio03_OrdenacionBurbujaShell.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque03/Ejercicio03_OrdenacionBurbujaShell.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque04/Ejercicio01_MostrarCadenaOrdenInverso.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque04/Ejercicio01_MostrarCadenaOrdenInverso.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque04/Ejercicio01_MostrarCadenaOrdenInverso.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque04/Ejercicio02_ContarVocalesYConsonantes.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque04/Ejercicio02_ContarVocalesYConsonantes.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque04/Ejercicio02_ContarVocalesYConsonantes.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque04/Ejercicio03_Palindromo.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque04/Ejercicio03_Palindromo.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque04/Ejercicio03_Palindromo.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque04/Ejercicio04_ContarPalabras.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque04/Ejercicio04_ContarPalabras.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque04/Ejercicio04_ContarPalabras.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque04/Ejercicio05_CompararCadenas.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque04/Ejercicio05_CompararCadenas.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque04/Ejercicio05_CompararCadenas.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque04/Ejercicio06_ObtenerCadenaMinusculas.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque04/Ejercicio06_ObtenerCadenaMinusculas.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque04/Ejercicio06_ObtenerCadenaMinusculas.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque05/Ejercicio01_EliminarEspaciosEnBlancoEnCadena.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque05/Ejercicio01_EliminarEspaciosEnBlancoEnCadena.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque05/Ejercicio01_EliminarEspaciosEnBlancoEnCadena.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque05/Ejercicio02_CifradoCesar.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque05/Ejercicio02_CifradoCesar.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque05/Ejercicio02_CifradoCesar.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque05/Ejercicio03_ContarOcurrencias.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque05/Ejercicio03_ContarOcurrencias.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque05/Ejercicio03_ContarOcurrencias.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque05/Ejercicio04_EncontrarPalabraMasLarga.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque05/Ejercicio04_EncontrarPalabraMasLarga.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque05/Ejercicio04_EncontrarPalabraMasLarga.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque05/Ejercicio05_InvertirOrdenLetrasEnPalabras.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque05/Ejercicio05_InvertirOrdenLetrasEnPalabras.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque05/Ejercicio05_InvertirOrdenLetrasEnPalabras.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo3Arrays/ejercicios/bloque05/Ejercicio06_Pangrama.java` | [04-arrays-strings/src/modulo3Arrays/ejercicios/bloque05/Ejercicio06_Pangrama.java](../00-ejercicios/04-arrays-strings/src/modulo3Arrays/ejercicios/bloque05/Ejercicio06_Pangrama.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/Animal.java` | [06-herencia-polimorfismo/src/modulo4Objetos/Animal.java](../00-ejercicios/06-herencia-polimorfismo/src/modulo4Objetos/Animal.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/AnimalQueVuela.java` | [06-herencia-polimorfismo/src/modulo4Objetos/AnimalQueVuela.java](../00-ejercicios/06-herencia-polimorfismo/src/modulo4Objetos/AnimalQueVuela.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/AnimalTerrestre.java` | [06-herencia-polimorfismo/src/modulo4Objetos/AnimalTerrestre.java](../00-ejercicios/06-herencia-polimorfismo/src/modulo4Objetos/AnimalTerrestre.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/AnimalVolador.java` | [06-herencia-polimorfismo/src/modulo4Objetos/AnimalVolador.java](../00-ejercicios/06-herencia-polimorfismo/src/modulo4Objetos/AnimalVolador.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/Burro.java` | [06-herencia-polimorfismo/src/modulo4Objetos/Burro.java](../00-ejercicios/06-herencia-polimorfismo/src/modulo4Objetos/Burro.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/Gato.java` | [06-herencia-polimorfismo/src/modulo4Objetos/Gato.java](../00-ejercicios/06-herencia-polimorfismo/src/modulo4Objetos/Gato.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/Perro.java` | [06-herencia-polimorfismo/src/modulo4Objetos/Perro.java](../00-ejercicios/06-herencia-polimorfismo/src/modulo4Objetos/Perro.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/Principal.java` | [06-herencia-polimorfismo/src/modulo4Objetos/Principal.java](../00-ejercicios/06-herencia-polimorfismo/src/modulo4Objetos/Principal.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/coleccionAntiguedadesLuis/Antiguedades.java` | [09-proyectos/coleccion-antiguedades/src/modulo4Objetos/coleccionAntiguedadesLuis/Antiguedades.java](../00-ejercicios/09-proyectos/coleccion-antiguedades/src/modulo4Objetos/coleccionAntiguedadesLuis/Antiguedades.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/coleccionAntiguedadesLuis/Coches.java` | [09-proyectos/coleccion-antiguedades/src/modulo4Objetos/coleccionAntiguedadesLuis/Coches.java](../00-ejercicios/09-proyectos/coleccion-antiguedades/src/modulo4Objetos/coleccionAntiguedadesLuis/Coches.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/coleccionAntiguedadesLuis/ColeccionAntiguedades.java` | [09-proyectos/coleccion-antiguedades/src/modulo4Objetos/coleccionAntiguedadesLuis/ColeccionAntiguedades.java](../00-ejercicios/09-proyectos/coleccion-antiguedades/src/modulo4Objetos/coleccionAntiguedadesLuis/ColeccionAntiguedades.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/coleccionAntiguedadesLuis/Cuadros.java` | [09-proyectos/coleccion-antiguedades/src/modulo4Objetos/coleccionAntiguedadesLuis/Cuadros.java](../00-ejercicios/09-proyectos/coleccion-antiguedades/src/modulo4Objetos/coleccionAntiguedadesLuis/Cuadros.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/coleccionAntiguedadesLuis/Joyas.java` | [09-proyectos/coleccion-antiguedades/src/modulo4Objetos/coleccionAntiguedadesLuis/Joyas.java](../00-ejercicios/09-proyectos/coleccion-antiguedades/src/modulo4Objetos/coleccionAntiguedadesLuis/Joyas.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/coleccionAntiguedadesLuis/Libros.java` | [09-proyectos/coleccion-antiguedades/src/modulo4Objetos/coleccionAntiguedadesLuis/Libros.java](../00-ejercicios/09-proyectos/coleccion-antiguedades/src/modulo4Objetos/coleccionAntiguedadesLuis/Libros.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/ejemplo2/Empleado.java` | [06-herencia-polimorfismo/src/modulo4Objetos/ejemplo2/Empleado.java](../00-ejercicios/06-herencia-polimorfismo/src/modulo4Objetos/ejemplo2/Empleado.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/ejemplo2/EmpleadoPorHoras.java` | [06-herencia-polimorfismo/src/modulo4Objetos/ejemplo2/EmpleadoPorHoras.java](../00-ejercicios/06-herencia-polimorfismo/src/modulo4Objetos/ejemplo2/EmpleadoPorHoras.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/ejemplo2/EmpleadoTiempoCompleto.java` | [06-herencia-polimorfismo/src/modulo4Objetos/ejemplo2/EmpleadoTiempoCompleto.java](../00-ejercicios/06-herencia-polimorfismo/src/modulo4Objetos/ejemplo2/EmpleadoTiempoCompleto.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/ejemplo2/Principal.java` | [06-herencia-polimorfismo/src/modulo4Objetos/ejemplo2/Principal.java](../00-ejercicios/06-herencia-polimorfismo/src/modulo4Objetos/ejemplo2/Principal.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/ejercicioOO/Persona.java` | [05-poo/src/modulo4Objetos/ejercicioOO/Persona.java](../00-ejercicios/05-poo/src/modulo4Objetos/ejercicioOO/Persona.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/ejercicioOO/Principal.java` | [05-poo/src/modulo4Objetos/ejercicioOO/Principal.java](../00-ejercicios/05-poo/src/modulo4Objetos/ejercicioOO/Principal.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/ejercicioOO/PrincipalNOStatic.java` | [05-poo/src/modulo4Objetos/ejercicioOO/PrincipalNOStatic.java](../00-ejercicios/05-poo/src/modulo4Objetos/ejercicioOO/PrincipalNOStatic.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/spaceInvader/Humano.java` | [09-proyectos/space-invader/src/modulo4Objetos/spaceInvader/Humano.java](../00-ejercicios/09-proyectos/space-invader/src/modulo4Objetos/spaceInvader/Humano.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/spaceInvader/Invasor.java` | [09-proyectos/space-invader/src/modulo4Objetos/spaceInvader/Invasor.java](../00-ejercicios/09-proyectos/space-invader/src/modulo4Objetos/spaceInvader/Invasor.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/spaceInvader/Jugador.java` | [09-proyectos/space-invader/src/modulo4Objetos/spaceInvader/Jugador.java](../00-ejercicios/09-proyectos/space-invader/src/modulo4Objetos/spaceInvader/Jugador.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/spaceInvader/Principal.java` | [09-proyectos/space-invader/src/modulo4Objetos/spaceInvader/Principal.java](../00-ejercicios/09-proyectos/space-invader/src/modulo4Objetos/spaceInvader/Principal.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo4Objetos/spaceInvader/Tablero.java` | [09-proyectos/space-invader/src/modulo4Objetos/spaceInvader/Tablero.java](../00-ejercicios/09-proyectos/space-invader/src/modulo4Objetos/spaceInvader/Tablero.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo5/coleccionDatos/Package.java` | [07-colecciones/src/modulo5/coleccionDatos/Package.java](../00-ejercicios/07-colecciones/src/modulo5/coleccionDatos/Package.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo5/coleccionDatos/PostOfficeApp.java` | [07-colecciones/src/modulo5/coleccionDatos/PostOfficeApp.java](../00-ejercicios/07-colecciones/src/modulo5/coleccionDatos/PostOfficeApp.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo5/coleccionDatos/Principal.java` | [07-colecciones/src/modulo5/coleccionDatos/Principal.java](../00-ejercicios/07-colecciones/src/modulo5/coleccionDatos/Principal.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo5/coleccionDatos/Usuario.java` | [07-colecciones/src/modulo5/coleccionDatos/Usuario.java](../00-ejercicios/07-colecciones/src/modulo5/coleccionDatos/Usuario.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo6/dateExceptions/EjemploDaeCalendar.java` | [10-utilidades/src/modulo6/dateExceptions/EjemploDaeCalendar.java](../00-ejercicios/10-utilidades/src/modulo6/dateExceptions/EjemploDaeCalendar.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo6/dateExceptions/EjemploExcepcionesBasico.java` | [08-excepciones/src/modulo6/dateExceptions/EjemploExcepcionesBasico.java](../00-ejercicios/08-excepciones/src/modulo6/dateExceptions/EjemploExcepcionesBasico.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo6/dateExceptions/EjemploExp.java` | [08-excepciones/src/modulo6/dateExceptions/EjemploExp.java](../00-ejercicios/08-excepciones/src/modulo6/dateExceptions/EjemploExp.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo6/dateExceptions/ExcepcionsCheck.java` | [08-excepciones/src/modulo6/dateExceptions/ExcepcionsCheck.java](../00-ejercicios/08-excepciones/src/modulo6/dateExceptions/ExcepcionsCheck.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo6/dateExceptions/PasswordChecker.java` | [08-excepciones/src/modulo6/dateExceptions/PasswordChecker.java](../00-ejercicios/08-excepciones/src/modulo6/dateExceptions/PasswordChecker.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo6/dateExceptions/Persona.java` | [08-excepciones/src/modulo6/dateExceptions/Persona.java](../00-ejercicios/08-excepciones/src/modulo6/dateExceptions/Persona.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo6/dateExceptions/Pierna.java` | [08-excepciones/src/modulo6/dateExceptions/Pierna.java](../00-ejercicios/08-excepciones/src/modulo6/dateExceptions/Pierna.java) |
| `programacionDAM/DAM_PROGRAMACION/src/modulo7/accesoDatos/AccesoDatos.java` | **Excluido:** Acceso a Datos / JDBC / Aucorsa |
| `programacionDAM/DAM_PROGRAMACION/src/modulo7/accesoDatos/Principal.java` | **Excluido:** Acceso a Datos / JDBC / Aucorsa |
| `programacionDAM/DAM_PROGRAMACION/src/modulo7/accesoDatos/ejemplosClase/Aucorsa.java` | **Excluido:** Acceso a Datos / JDBC / Aucorsa |
| `programacionDAM/DAM_PROGRAMACION/src/modulo7/accesoDatos/ejemplosClase/ConexionBasica.java` | **Excluido:** Acceso a Datos / JDBC / Aucorsa |
| `programacionDAM/DAM_PROGRAMACION/src/modulo7/accesoDatos/ejemplosClase/ConnectionManagerV1.java` | **Excluido:** Acceso a Datos / JDBC / Aucorsa |
| `programacionDAM/DAM_PROGRAMACION/src/modulo7/accesoDatos/ejemplosClase/EjemplosInsertUpdateyDelete.java` | **Excluido:** Acceso a Datos / JDBC / Aucorsa |
| `programacionDAM/DAM_PROGRAMACION/src/modulo7/accesoDatos/ejemplosClase/Principal.java` | **Excluido:** Acceso a Datos / JDBC / Aucorsa |
| `programacionDAM/DAM_PROGRAMACION/src/modulo8/interfaceSwing/InterfazAucorsa.java` | **Excluido:** Acceso a Datos / JDBC / Aucorsa |
| `programacionDAM/DAM_PROGRAMACION/src/modulo8/interfaceSwing/InterfazAucorsaTab.java` | **Excluido:** Acceso a Datos / JDBC / Aucorsa |
| `programacionDAM/DAM_PROGRAMACION/src/utils/Util.java` | [10-utilidades/src/utils/Util.java](../00-ejercicios/10-utilidades/src/utils/Util.java) |
| `programacionDAM/DAM_PROGRAMACION/src/utils/Utils.java` | [10-utilidades/src/utils/Utils.java](../00-ejercicios/10-utilidades/src/utils/Utils.java) |
| `programacionDAM/DAM_PROGRAMACION/src/utils/UtilsArrays.java` | [10-utilidades/src/utils/UtilsArrays.java](../00-ejercicios/10-utilidades/src/utils/UtilsArrays.java) |
| `Ejericios/.gitignore` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `Ejericios/.idea/.gitignore` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `Ejericios/.idea/misc.xml` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `Ejericios/.idea/modules.xml` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `Ejericios/.idea/vcs.xml` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `Ejericios/Ejericios.iml` | **Excluido:** Metadatos de IDE/sistema o configuración histórica sustituida por .gitignore común |
| `Ejericios/src/EjerciciosString.java` | [04-arrays-strings/src/EjerciciosString.java](../00-ejercicios/04-arrays-strings/src/EjerciciosString.java) |
| `Ejericios/src/ExamenPrimitivas.java` | [11-examenes/Ejericios/src/ExamenPrimitivas.java](../11-examenes/Ejericios/src/ExamenPrimitivas.java) |
| `Ejericios/src/HundirFlota1D.java` | [09-proyectos/hundir-flota-1d/src/HundirFlota1D.java](../00-ejercicios/09-proyectos/hundir-flota-1d/src/HundirFlota1D.java) |
| `Ejericios/src/Iteradores.java` | [03-bucles/src/Iteradores.java](../00-ejercicios/03-bucles/src/Iteradores.java) |
| `Ejericios/src/Principal.java` | [05-poo/src/Principal.java](../00-ejercicios/05-poo/src/Principal.java) |
| `Ejericios/src/Repaso.java` | [04-arrays-strings/src/Repaso.java](../00-ejercicios/04-arrays-strings/src/Repaso.java) |
| `Ejericios/src/TresEnRaya.java` | [09-proyectos/tres-en-raya/src/TresEnRaya.java](../00-ejercicios/09-proyectos/tres-en-raya/src/TresEnRaya.java) |
| `Ejericios/src/objetos/Animal.java` | [05-poo/src/objetos/Animal.java](../00-ejercicios/05-poo/src/objetos/Animal.java) |
| `Ejericios/src/objetos/Granja.java` | [05-poo/src/objetos/Granja.java](../00-ejercicios/05-poo/src/objetos/Granja.java) |
| `Ejericios/src/objetos/Persona.java` | [05-poo/src/objetos/Persona.java](../00-ejercicios/05-poo/src/objetos/Persona.java) |
| `Ejericios/src/pokemon/EntrenadorPokemon.java` | [09-proyectos/pokemon/src/pokemon/EntrenadorPokemon.java](../00-ejercicios/09-proyectos/pokemon/src/pokemon/EntrenadorPokemon.java) |
| `Ejericios/src/pokemon/Pokeball.java` | [09-proyectos/pokemon/src/pokemon/Pokeball.java](../00-ejercicios/09-proyectos/pokemon/src/pokemon/Pokeball.java) |
| `Ejericios/src/pokemon/Pokemon.java` | [09-proyectos/pokemon/src/pokemon/Pokemon.java](../00-ejercicios/09-proyectos/pokemon/src/pokemon/Pokemon.java) |
| `Ejericios/src/pokemon/PokemonAgua.java` | [09-proyectos/pokemon/src/pokemon/PokemonAgua.java](../00-ejercicios/09-proyectos/pokemon/src/pokemon/PokemonAgua.java) |
| `Ejericios/src/pokemon/PokemonBaseImpl.java` | [09-proyectos/pokemon/src/pokemon/PokemonBaseImpl.java](../00-ejercicios/09-proyectos/pokemon/src/pokemon/PokemonBaseImpl.java) |
| `Ejericios/src/pokemon/PokemonFuego.java` | [09-proyectos/pokemon/src/pokemon/PokemonFuego.java](../00-ejercicios/09-proyectos/pokemon/src/pokemon/PokemonFuego.java) |
| `Ejericios/src/pokemon/PokemonTierra.java` | [09-proyectos/pokemon/src/pokemon/PokemonTierra.java](../00-ejercicios/09-proyectos/pokemon/src/pokemon/PokemonTierra.java) |
| `Ejericios/src/pokemon/Principal.java` | [09-proyectos/pokemon/src/pokemon/Principal.java](../00-ejercicios/09-proyectos/pokemon/src/pokemon/Principal.java) |
| `Ejericios/src/pokemon/TIPOPokeballs.java` | [09-proyectos/pokemon/src/pokemon/TIPOPokeballs.java](../00-ejercicios/09-proyectos/pokemon/src/pokemon/TIPOPokeballs.java) |
| `Ejericios/src/pokemon/TIPOPokemon.java` | [09-proyectos/pokemon/src/pokemon/TIPOPokemon.java](../00-ejercicios/09-proyectos/pokemon/src/pokemon/TIPOPokemon.java) |
| `Ejericios/src/recap/App.java` | **Excluido:** Esqueleto vacío sin implementación docente |
| `Ejericios/src/recap/Evento.java` | [08-excepciones/src/recap/Evento.java](../00-ejercicios/08-excepciones/src/recap/Evento.java) |
| `Ejericios/src/recap/EventoImpl.java` | [08-excepciones/src/recap/EventoImpl.java](../00-ejercicios/08-excepciones/src/recap/EventoImpl.java) |
| `Ejericios/src/recap/EventoOnline.java` | [08-excepciones/src/recap/EventoOnline.java](../00-ejercicios/08-excepciones/src/recap/EventoOnline.java) |
| `Ejericios/src/recap/EventoPresencial.java` | [08-excepciones/src/recap/EventoPresencial.java](../00-ejercicios/08-excepciones/src/recap/EventoPresencial.java) |
| `Ejericios/src/recap/PassException.java` | [08-excepciones/src/recap/PassException.java](../00-ejercicios/08-excepciones/src/recap/PassException.java) |
| `Ejericios/src/recap/PasswordException.java` | [08-excepciones/src/recap/PasswordException.java](../00-ejercicios/08-excepciones/src/recap/PasswordException.java) |
| `Ejericios/src/recap/Principal.java` | [08-excepciones/src/recap/Principal.java](../00-ejercicios/08-excepciones/src/recap/Principal.java) |
| `Ejericios/src/recap/TipoErrorPassword.java` | [08-excepciones/src/recap/TipoErrorPassword.java](../00-ejercicios/08-excepciones/src/recap/TipoErrorPassword.java) |
| `Ejericios/src/recap/Usuario.java` | [08-excepciones/src/recap/Usuario.java](../00-ejercicios/08-excepciones/src/recap/Usuario.java) |
| `Ejericios/src/utilidades/Arrays.java` | [04-arrays-strings/src/utilidades/Arrays.java](../00-ejercicios/04-arrays-strings/src/utilidades/Arrays.java) |
| `Ejericios/src/utilidades/Matrices.java` | [04-arrays-strings/src/utilidades/Matrices.java](../00-ejercicios/04-arrays-strings/src/utilidades/Matrices.java) |
| `Ejericios/src/utilidades/SumarPrimos.java` | [03-bucles/src/utilidades/SumarPrimos.java](../00-ejercicios/03-bucles/src/utilidades/SumarPrimos.java) |
| `Ejericios/src/utilidades/Utils.java` | [10-utilidades/src/utilidades/Utils.java](../00-ejercicios/10-utilidades/src/utilidades/Utils.java) |
| `Ejericios/src/utilidades/ejercicioSumaPrimos.java` | [03-bucles/src/utilidades/ejercicioSumaPrimos.java](../00-ejercicios/03-bucles/src/utilidades/ejercicioSumaPrimos.java) |
