# Trabajo Práctico 4: Programación Orientada a Objetos II ☕

Este proyecto es una implementación en Java que responde a los requerimientos del Trabajo Práctico N°4 de la materia **Programación II** de la **Tecnicatura Universitaria en Programación a Distancia** de la UTN.

El objetivo principal es aplicar conceptos avanzados de Programación Orientada a Objetos para construir un sistema simple de gestión de empleados.

---
## 🎯 Conceptos Aplicados

El desarrollo se centra en la correcta implementación de los siguientes conceptos de POO en Java:

* **Uso de `this`**: Para referenciar la instancia actual dentro de constructores y métodos.
* **Constructores y Sobrecarga**: Para permitir una inicialización flexible de los objetos.
* **Métodos Sobrecargados**: Para definir múltiples versiones de un método según los parámetros.
* **Método `toString()`**: Para obtener una representación legible del estado de un objeto.
* **Atributos Estáticos**: Para manejar variables compartidas por todas las instancias de una clase.
* **Métodos Estáticos**: Para definir funciones de clase que no requieren una instancia para ser invocadas.

---

## 📋 Requerimientos del Sistema

Se modela una clase `Empleado` que representa a un trabajador en una empresa.

### Clase `Empleado`

#### Atributos
* `int id`: Identificador único del empleado.
* `String nombre`: Nombre completo.
* `String puesto`: Cargo que desempeña.
* `double salario`: Salario actual.
* `static int totalEmpleados`: Un contador global para registrar la cantidad de empleados creados.

#### Constructores Sobrecargados

1.  Un constructor que recibe **todos los atributos** como parámetros (`id`, `nombre`, `puesto`, `salario`).
2.  Otro constructor que recibe solo `nombre` y `puesto`, asignando un `id` automático y un salario por defecto.

Ambos constructores deben incrementar el contador `totalEmpleados`.

#### Métodos Sobrecargados: `actualizarSalario`
1.  Un método que recibe un **porcentaje de aumento** (ej. `double porcentaje`).
2.  Otro método que recibe una **cantidad fija a aumentar** (ej. `int cantidad`).

#### Métodos Adicionales
* **`toString()`**: Devuelve una representación legible de los datos del empleado (`id`, `nombre`, `puesto` y `salario`).
* **`static mostrarTotalEmpleados()`**: Retorna el valor actual del contador `totalEmpleados`.

---
## 🚀 Tareas de la Clase de Prueba (`main`)

Se debe crear una clase de prueba que realice las siguientes acciones:
1.  **Instanciar** varios objetos `Empleado` usando ambos constructores.
2.  **Aplicar** los métodos `actualizarSalario()` (ambas versiones) sobre distintos empleados.
3.  **Imprimir** la información completa de cada empleado utilizando el método `toString()`.
4.  **Mostrar** el número total de empleados creados llamando al método estático `mostrarTotalEmpleados()`.

---
## 🛠️ Cómo Compilar y Ejecutar
1.  **Guardar los archivos**: Asegúrate de tener los archivos `Empleado.java` y `PruebaEmpleado.java` en el mismo directorio.
2.  **Abrir una terminal**: Navega hasta el directorio donde guardaste los archivos.
3.  **Compilar**: Ejecuta el siguiente comando para compilar las clases.
    ```sh
    javac Empleado.java PruebaEmpleado.java
    ```
4.  **Ejecutar**: Una vez compilado sin errores, ejecuta el programa.
    ```sh
    java PruebaEmpleado
    ```
