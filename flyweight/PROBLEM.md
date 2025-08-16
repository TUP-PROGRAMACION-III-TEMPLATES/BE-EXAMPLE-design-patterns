# Escenario: Sistema de Gestión de Recursos en un Juego de Estrategia

## Descripción:

Imagina que estás desarrollando un juego de estrategia en tiempo real (RTS) donde los jugadores controlan unidades militares, como soldados, arqueros, caballeros, etc. El juego necesita gestionar una gran cantidad de unidades en pantalla al mismo tiempo para garantizar una experiencia de juego fluida.

## Objetivo:

Implementar el patrón de diseño Flyweight para optimizar el uso de memoria y mejorar el rendimiento del juego al compartir eficientemente recursos comunes entre múltiples unidades militares.

## Requisitos:

1. Definir una interfaz UnidadMilitar que declare métodos comunes para todas las unidades militares, como mover(), atacar(), defender(), etc.
2. Implementar una clase UnidadMilitarConcreta que represente una unidad militar específica, como un soldado, arquero, caballero, etc. Cada clase debe implementar la interfaz UnidadMilitar y contener datos específicos de la unidad, como posición, nivel de salud, etc.
3. Definir una clase FabricaUnidadesMilitares que actúe como una fábrica de unidades militares y mantenga un conjunto de unidades militares compartidas en un pool.
4. Implementar un método en la fábrica de unidades militares para obtener una instancia compartida de una unidad militar basada en su tipo. Si la instancia ya existe en el pool, devolverla; de lo contrario, crear una nueva instancia y agregarla al pool.
5. Permitir que el sistema del juego solicite unidades militares a través de la fábrica de unidades militares y que las unidades compartan recursos comunes siempre que sea posible, minimizando así el uso de memoria.
6. Demostrar el uso del patrón Flyweight en el sistema de gestión de unidades militares del juego mediante ejemplos de creación y manipulación eficiente de múltiples unidades militares en pantalla.