# Escenario: Sistema de Análisis de Documentos

## Descripción:

Imagina que estás desarrollando un sistema de análisis de documentos para una empresa de análisis 
de datos. El sistema debe ser capaz de procesar diferentes tipos de documentos, como documentos de 
texto, hojas de cálculo y presentaciones, y realizar análisis específicos en cada tipo de documento.

## Objetivo:

Implementar el patrón de diseño Visitor para permitir que el sistema realice análisis específicos en 
diferentes tipos de documentos de manera eficiente y flexible.

## Requisitos:

1. Crear una interfaz DocumentoVisitor que defina métodos de visita para cada tipo de documento que se 
puede analizar, como visitarDocumentoTexto(), visitarHojaCalculo(), visitarPresentacion(), etc.
2. Implementar clases concretas que representen diferentes tipos de documentos, como DocumentoTexto,
HojaCalculo y Presentacion.
3. Agregar métodos en las clases concretas para aceptar visitantes y permitir que realicen análisis específicos 
en el documento, utilizando los métodos de visita definidos en la interfaz DocumentoVisitor.
4. Crear clases concretas que implementen la interfaz DocumentoVisitor para representar diferentes tipos de 
análisis que se pueden realizar en los documentos, como AnalisisEstadistico, AnalisisComplejidad, 
AnalisisPalabrasClave, etc.
5. Implementar los métodos de visita en las clases concretas de visitantes para realizar análisis específicos 
en cada tipo de documento.
6. Permitir que los usuarios soliciten el análisis de diferentes documentos a través del sistema y que el 
sistema procese automáticamente el análisis utilizando los visitantes adecuados.
7. Demostrar el uso del patrón Visitor en el sistema de análisis de documentos mediante ejemplos de análisis 
específicos realizados en diferentes tipos de documentos utilizando diferentes visitantes.