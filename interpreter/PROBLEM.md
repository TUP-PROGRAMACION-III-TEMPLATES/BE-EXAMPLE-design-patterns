# Escenario: Evaluación de Expresiones Matemáticas

## Descripción:

Imagina que estás desarrollando un sistema de evaluación de expresiones matemáticas para una 
calculadora avanzada. El sistema debe ser capaz de interpretar y evaluar expresiones 
matemáticas simples que incluyan operaciones como suma, resta, multiplicación, división, 
y también paréntesis para la prioridad de las operaciones.

## Objetivo:

Implementar el patrón de diseño Interpreter para interpretar y evaluar expresiones matemáticas 
en el sistema de la calculadora.

## Requisitos:

1. Crear una clase abstracta Expresion que defina el método interpret() para evaluar la expresión.
2. Implementar clases concretas que extiendan Expresion para representar diferentes tipos de 
expresiones matemáticas, como Suma, Resta, Multiplicacion, Division, y Numero.
3. Utilizar el patrón Composite para permitir la construcción de expresiones matemáticas complejas 
a partir de expresiones simples.
4. Implementar un parser que convierta una cadena de texto que representa una expresión matemática 
en una estructura de árbol de expresiones utilizando las clases concretas definidas anteriormente.
5. Utilizar el patrón Interpreter para recorrer y evaluar el árbol de expresiones, devolviendo el 
resultado de la evaluación.