# Taller de Arreglos, ArrayList y Matrices

## Estudiante
Harold Esteban Ariza Silva

## Descripción
Solución del taller de estructuras lineales en Java, dividido en tres categorías:

 `Arreglos`  Ejercicios del 1 al 5: arreglos unidimensionales (números
  primos, pares, factoriales, mínimo/máximo, inversión de dígitos).
 `Arraylist`  Ejercicios del 6 al 10: uso de `ArrayList` (suma y media,
  inserción/borrado ordenado, frecuencias, ordenamiento, filtrado y el
  ejercicio de partidos de fútbol). 
 `Matrices`  Ejercicios del 11 al 15: arreglos bidimensionales (búsqueda,
  diagonal secundaria, simetría, transpuesta, intercambio de filas).

Cada ejercicio está implementado como una clase independiente con métodos
separados para generación de datos, procesamiento e impresión de
resultados, siguiendo Clean Code y los principios DRY, YAGNI, KISS y SOLID.


## Instrucciones para ejecutar el programa
Tener JDK 17 o superior.

Desde la carpeta src del repositorio, compilar y ejecutar cada ejercicio de forma
individual. Por ejemplo, para el ejercicio 1 estar en el archivo y darle F5 o run java, si quiere correrlo desde la terminal seria:

```bash
cd src
javac -encoding UTF-8 arreglos/Ejercicio01_ArregloPrimos.java
java arreglos.Ejercicio01_ArregloPrimos
```

Para los ejercicios que piden datos por teclado (por ejemplo el 3, 7, 11,
12, 13 o 15), el programa solicitará los valores por consola al ejecutarlo.

Para el ejercicio 10 (Partidos), se debe compilar la clase
`Partido`, pero antes de compilar cambiar la ruta del archivo PartidoLiga.txt por la correspondiente, si le da click izquierdo al archivo y hace la combinacion de teclas Ctrl + Alt + C copia la ruta

```bash
javac -encoding UTF-8 arraylist/Partido.java arraylist/Ejercicio10_Partidos.java
java arraylist.Ejercicio10_Partidos
```
