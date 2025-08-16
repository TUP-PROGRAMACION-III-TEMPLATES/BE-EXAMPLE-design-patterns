# Escenario: Sistema de Mensajería Instantánea

## Descripción:

Imagina que estás desarrollando un sistema de mensajería instantánea para una empresa que 
necesita facilitar la comunicación entre sus empleados. El sistema debe permitir que los usuarios 
envíen mensajes a otros usuarios individualmente o en grupos, y también debe admitir la creación 
de salas de chat para discusiones grupales.

## Objetivo:

Implementar el patrón de diseño Mediator para gestionar la comunicación entre los usuarios en el 
sistema de mensajería instantánea.

## Requisitos:

1. Crear una interfaz Mediator que defina métodos para que los usuarios se registren, envíen mensajes 
y reciban mensajes.
2. Implementar una clase SalaChat que actúe como el mediador principal y administre las comunicaciones 
entre los usuarios.
3. Crear una clase Usuario que represente a un usuario del sistema de mensajería, con métodos para 
enviar mensajes y recibir mensajes.
4. Asegurar que los usuarios se registren con el mediador al unirse al sistema de mensajería.
5. Permitir que los usuarios envíen mensajes a otros usuarios individualmente o a grupos a través del mediador.
6. Implementar un mecanismo para que los mensajes enviados por un usuario sean entregados a los destinatarios 
apropiados a través del mediador.
7. Demostrar el uso del patrón Mediator en el sistema de mensajería mediante ejemplos de envío y recepción de 
mensajes entre usuarios individuales y en salas de chat.