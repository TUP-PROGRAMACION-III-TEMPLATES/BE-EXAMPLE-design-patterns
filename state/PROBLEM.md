# Escenario: Gestión de un Sistema de Pedidos en una Tienda en Línea

## Descripción:

Imagina que estás desarrollando el sistema de gestión de pedidos para una tienda en línea que vende 
productos electrónicos. El sistema debe gestionar el estado de los pedidos, desde el momento en que 
se realiza la compra hasta la entrega al cliente.

## Objetivo:

Implementar el patrón de diseño State para gestionar los diferentes estados de los pedidos en el sistema 
de la tienda en línea.

## Requisitos:

1. Crear una interfaz EstadoPedido que defina métodos para realizar acciones relacionadas con el estado del 
pedido, como confirmar, enviar y entregar.
2. Implementar clases concretas que representen los diferentes estados del pedido, como PedidoConfirmado, 
PedidoEnviado y PedidoEntregado.
3. Agregar métodos en las clases concretas para realizar las acciones asociadas con cada estado del pedido, 
como confirmar, enviar y entregar.
4. Implementar una clase Pedido que contenga una referencia al estado actual del pedido y métodos para cambiar 
el estado del pedido según sea necesario.
5. Permitir que los clientes realicen pedidos a través del sistema de la tienda en línea y que el sistema 
actualice automáticamente el estado del pedido a medida que avanza a través del proceso de compra y entrega.
6. Demostrar el uso del patrón State en el sistema de gestión de pedidos mediante ejemplos de cambio de 
estado del pedido, desde la confirmación hasta la entrega final al cliente.