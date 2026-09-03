# SpeedFast Semana 3

## Descripción del Proyecto

SpeedFast es una aplicación desarrollada en Java que simula la gestión de entregas para distintos tipos 
de pedidos. El sistema permite administrar pedidos de comida, encomiendas y compras express, aplicando 
los principios fundamentales de la Programación Orientada a Objetos: abstracción, polimorfismo e 
interfaces.

La solución está diseñada para facilitar la asignación de repartidores, calcular tiempos estimados de 
entrega, despachar pedidos, cancelar envíos y mantener un historial.


## Objetivo

Desarrollar un sistema orientado a objetos que permita:

- Gestionar distintos tipos de pedidos.
- Asignar repartidores.
- Calcular tiempos estimados de entrega.
- Despachar pedidos.
- Cancelar pedidos.
- Consultar el historial de pedidos.
- Aplicar principios de reutilización, escalabilidad y mantenibilidad.

---

# Principios de Programación Orientada a Objetos Aplicados

## 1. Abstracción

Se implementa mediante la clase abstracta `Pedido`, que reúne los atributos y comportamientos comunes de 
todos los pedidos.

### Atributos comunes

- idPedido
- cliente
- direccionDespacho
- repartidor

### Métodos

- mostrarResumen()
- calcularTiempoEntrega() (abstracto)
- asignarRepartidor() (abstracto)
- asignarRepartidor(String nombre)

La abstracción permite definir una estructura base para todos los tipos de pedidos, evitando duplicación
de código.

---

## 2. Polimorfismo

### Sobrescritura (Override)

Las clases hijas:

- PedidoComida
- PedidoEncomienda
- PedidoExpress

sobrescriben los métodos:

asignarRepartidor()
calcularTiempoEntrega()

### Estructura del Projecto

SpeedFast
│
├── Pedido.java
├── PedidoComida.java
├── PedidoEncomienda.java
├── PedidoExpress.java
│
├── Despachable.java
├── Cancelable.java
├── Rastreable.java
│
├── ControladorDeEnvios.java
│
├── Main.java
│
└── README.md

### Diagrama De Clases

                    <<abstract>>
                         Pedido
----------------------------------------------------------------
- idPedido : int
- cliente : String
- direccionDespacho : String
- repartidor : String
----------------------------------------------------------------
+ mostrarResumen() : void
+ calcularTiempoEntrega() : int
+ asignarRepartidor() : void
+ asignarRepartidor(String nombre) : void
----------------------------------------------------------------
              ▲                  ▲                  ▲
              │                  │                  │
              │                  │                  │

      PedidoComida      PedidoEncomienda      PedidoExpress

----------------------------------------------------------------

<<interface>> Despachable
+ despachar()

<<interface>> Cancelable
+ cancelar()

<<interface>> Rastreable
+ verHistorial()

                        ▲
                        │
                        │
             ControladorDeEnvios
------------------------------------------------
- historial : ArrayList<String>
------------------------------------------------
+ registrarPedido()
+ despachar()
+ cancelar()
+ verHistorial()
------------------------------------------------
