## Semana 2 SpeedFast

En esta actualización se transformó la clase Pedido en una clase abstracta para mejorar
la reutilización del código y aplicar correctamente los principios de herencia.

## Atributos comunes

- idPedido
- direccionEntrega
- distanciaKm

## Métodos

- mostrarResumen()
- calcularTiempoEntrega() (abstracto)

## Implementaciones

## PedidoComida
Tiempo = 15 + (2 × distancia en km)

## PedidoEncomienda
Tiempo = 20 + (1.5 × distancia en km)

## PedidoExpress
Tiempo base = 10 minutos.
Si la distancia supera los 5 km se agregan 5 minutos adicionales.

## Conceptos aplicados

- Clases abstractas
- Herencia
- Polimorfismo
- Sobrescritura de métodos
- Encapsulamiento