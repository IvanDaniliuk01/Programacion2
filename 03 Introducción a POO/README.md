
# Trabajo Práctico: Introducción a la Programación Orientada a Objetos (POO)

Este repositorio contiene la resolución del Trabajo Práctico N°3 de la materia **Programación II**, correspondiente a la **Tecnicatura Universitaria en Programación a Distancia** de la UTN. El objetivo principal es aplicar los conceptos fundamentales de la Programación Orientada a Objetos (POO) utilizando Java.

## 📝 Descripción del Proyecto

El proyecto consiste en resolver una serie de casos prácticos que modelan entidades del mundo real y ficticio como clases y objetos. A través de estos ejercicios, se exploran y aplican los pilares de la POO para crear un código modular, reutilizable y fácil de mantener.

### Conceptos Aplicados

-   **Clases y Objetos**: Modelado de las entidades `Estudiante`, `Mascota`, `Libro`, `Gallina` y `NaveEspacial`.
-   **Atributos y Métodos**: Definición de las propiedades (estado) y comportamientos (funcionalidades) de cada objeto.
-   **Encapsulamiento**: Protección de los datos de los objetos mediante el uso de modificadores de acceso (`private`) y la exposición controlada a través de métodos públicos.
-   **Getters y Setters**: Implementación de métodos para acceder y modificar de forma segura los atributos privados, incluyendo lógica de validación.
-   **Estado e Identidad**: Demostración de cómo cada objeto mantiene su propio estado a lo largo del ciclo de vida del programa.

---

## 📂 Estructura del Repositorio

El código está organizado en archivos `.java` individuales, donde cada archivo representa una clase específica.

-   `Estudiante.java`: Define la clase para el registro de estudiantes.
-   `Mascota.java`: Define la clase para el registro de mascotas.
-   `Libro.java`: Define la clase `Libro`, aplicando encapsulamiento.
-   `Gallina.java`: Define la clase para la gestión de gallinas en una granja digital.
-   `NaveEspacial.java`: Define la clase para una simulación de nave espacial con gestión de combustible.
-   `IntroduccionAPOO.java`: Es la clase principal que contiene el método `main`. Desde aquí se instancian los objetos y se ejecutan las pruebas para cada uno de los ejercicios.

---

## 🚀 Cómo Compilar y Ejecutar

Para poder probar el proyecto, necesitas tener instalado el **JDK (Java Development Kit)** en tu sistema.

1.  **Clonar o Descargar el Repositorio**
    Puedes clonar el repositorio con `git` o descargar los archivos `.java` en una misma carpeta.

2.  **Abrir una Terminal**
    Navega a través de la terminal o línea de comandos hasta la carpeta donde se encuentran los archivos del proyecto.

3.  **Compilar el Código**
    Ejecuta el siguiente comando para compilar todos los archivos `.java` a la vez. Esto generará los archivos `.class` correspondientes.
    ```bash
    javac *.java
    ```

4.  **Ejecutar el Programa**
    Una vez compilado sin errores, ejecuta la clase principal con el siguiente comando:
    ```bash
    java IntroduccionAPOO
    ```

### Salida Esperada

Al ejecutar el programa, verás en la consola la salida detallada de cada uno de los 5 ejercicios, mostrando la creación de los objetos, la ejecución de sus métodos y los cambios en sus estados, tal como se solicita en las consignas del trabajo práctico.

```bash
### INICIO DEL TRABAJO PRÁCTICO DE POO ###

=============================================
EJERCICIO 1: REGISTRO DE ESTUDIANTES
=============================================
Información del Estudiante:
Nombre Completo: Juan Perez
Curso: Programación II
Calificación: 7.5
La calificación de Juan ha subido a 9.0
La calificación de Juan ha bajado a 8.5
Información del Estudiante:
Nombre Completo: Juan Perez
Curso: Programación II
Calificación: 8.5

... (y así sucesivamente para los demás ejercicios)
```
