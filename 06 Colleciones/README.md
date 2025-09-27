# **Trabajo Práctico: Colecciones y POO en Java \- Programación II**

Este repositorio contiene la solución completa al trabajo práctico de la materia **Programación II** de la **Tecnicatura Universitaria en Programación (UTN)**. El objetivo principal es aplicar conceptos de Programación Orientada a Objetos (POO) utilizando colecciones dinámicas (ArrayList), enumeraciones (enum) y modelando distintas relaciones entre clases.

## **Ejercicios Resueltos**

El trabajo práctico se divide en tres casos de estudio, cada uno enfocado en un tipo de relación y problemática diferente.

### **1\. Caso Práctico: Sistema de Stock**

Este ejercicio implementa un sistema para gestionar el inventario de una tienda.

* **Objetivo:** Controlar productos, su stock, precios y categorías.  
* **Conceptos Clave:**  
  * Uso de ArrayList para almacenar una colección de productos.  
  * Implementación de enum para definir un conjunto fijo de categorías de productos.  
  * Encapsulamiento y métodos para interactuar con los datos de forma segura.  
* **Clases Implementadas:**  
  * CategoriaProducto.java: Enumeración que define las categorías (ALIMENTOS, ELECTRONICA, ROPA, HOGAR).  
  * Producto.java: Modela un producto con atributos como ID, nombre, precio, stock y categoría.  
  * Inventario.java: Gestiona la colección de productos, permitiendo agregar, eliminar, buscar, filtrar y actualizar.  
  * Main.java: Clase principal para ejecutar y probar todas las funcionalidades del sistema de stock.

### **2\. Caso Práctico: Biblioteca y Libros**

Este ejercicio desarrolla un sistema para administrar los libros y autores de una biblioteca.

* **Objetivo:** Modelar una relación de **composición 1 a N**, donde una Biblioteca contiene múltiples Libros.  
* **Conceptos Clave:**  
  * Relación de composición: Un Libro no puede existir sin una Biblioteca.  
  * Colaboración entre objetos (Libro tiene una instancia de Autor).  
  * Búsqueda, filtrado y eliminación de elementos en una colección.  
* **Clases Implementadas:**  
  * Autor.java: Modela a un autor con ID, nombre y nacionalidad.  
  * Libro.java: Modela un libro con ISBN, título, año y una referencia a su Autor.  
  * Biblioteca.java: Gestiona la colección de libros.  
  * Main.java: Clase principal para ejecutar las operaciones de la biblioteca.

### **3\. Caso Práctico: Universidad, Profesor y Curso**

Este es el ejercicio más avanzado, modelando un sistema académico simple.

* **Objetivo:** Implementar una **relación bidireccional 1 a N** entre Profesor y Curso.  
* **Conceptos Clave:**  
  * Relación bidireccional: Un Profesor conoce sus Cursos y un Curso conoce a su Profesor.  
  * Mantenimiento de la consistencia: Al asignar o cambiar un profesor, la referencia debe actualizarse en ambos objetos para evitar inconsistencias.  
  * Diseño de métodos que sincronicen el estado entre objetos relacionados.  
* **Clases Implementadas:**  
  * Profesor.java: Modela a un profesor y mantiene una lista de los cursos que dicta.  
  * Curso.java: Modela un curso y mantiene una referencia a su profesor responsable.  
  * Universidad.java: Actúa como clase gestora principal para administrar profesores y cursos.  
  * Main.java: Clase principal para probar las asignaciones y la sincronización de la relación bidireccional.

El código está completamente comentado para facilitar la comprensión de la lógica implementada en cada clase y método.
