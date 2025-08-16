# Escenario: Sistema de Acceso a Contenido Restringido

## Descripción:

Imagina que estás desarrollando un sistema de gestión de contenido para una biblioteca digital que 
contiene libros electrónicos, artículos académicos y otros recursos educativos. Algunos de los 
recursos están restringidos y solo pueden ser accedidos por usuarios autorizados, como estudiantes 
inscritos o miembros de la facultad.

## Objetivo:

Implementar el patrón de diseño Proxy para controlar y gestionar el acceso a contenido restringido 
en la biblioteca digital.

## Requisitos:

1. Crear una interfaz AccesoContenido que defina un método acceder() para acceder al contenido.
2. Implementar una clase ContenidoReal que represente el contenido real y contenga la lógica para acceder al mismo.
3. Implementar una clase ProxyContenido que actúe como proxy para el contenido real y controle el acceso al mismo.
4. Agregar métodos en ProxyContenido para verificar las credenciales de los usuarios antes de permitirles 
acceder al contenido restringido.
5. Permitir que los usuarios soliciten acceso al contenido a través del proxy, y garantizar que solo los 
usuarios autorizados puedan acceder al contenido restringido.
6. Demostrar el uso del patrón Proxy en el sistema de gestión de contenido mediante ejemplos de acceso al 
contenido restringido con y sin credenciales autorizadas.
