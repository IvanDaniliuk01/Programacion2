# Trabajo Práctico 8 – Interfaces y Excepciones en Java

Este módulo implementa el TP8 completo para la materia **Programación II**. Incluye un mini e-commerce basado en interfaces y un set de ejercicios focalizados en el manejo de excepciones.

## Requisitos

- Java 17+
- Maven 3.9+

## Cómo ejecutar las pruebas

```bash
mvn test
```

Las pruebas cubren tanto el flujo del e-commerce (cálculo de totales, pagos con descuento y notificaciones al cliente) como cada ejercicio de excepciones solicitado.

## Organización del código

- `ar.edu.programacion2.tp8.ecommerce`  
  - `contracts`: interface `Pagable`.  
  - `model`: `Producto`, `Pedido`, `PedidoEstado`.  
  - `clientes`: `Cliente` implementa `Notificable`.  
  - `pagos`: `Pago`, `PagoConDescuento`, `TarjetaCredito`, `PayPal`.  
  - `notificaciones`: interface `Notificable`.
- `ar.edu.programacion2.tp8.excepciones`: utilidades `DivisionSegura`, `ConversionCadenaNumero`, `LecturaArchivo`, `LectorTryWithResources`, `ValidadorEdad` y la excepción personalizada `EdadInvalidaException`.

## Ejecución de ejemplo

El test `PedidoTest.pagarConTarjeta` muestra el flujo típico:

1. Crear productos y asociarlos a un `Pedido`.
2. Registrar un `Cliente` que recibirá notificaciones.
3. Procesar el pago con `TarjetaCredito` (aplica descuento).
4. Verificar que el estado cambia a `PAGADO` y que el cliente recibe el aviso.

Los escenarios de excepciones están cubiertos en `ExcepcionesTest`.

