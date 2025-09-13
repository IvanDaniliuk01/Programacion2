# **Trabajo Práctico: Relaciones UML en Java \- Programación II**

Este repositorio contiene la resolución del **Trabajo Práctico N°5** de la materia **Programación II**, correspondiente a la Tecnicatura Universitaria en Programación de la Universidad Tecnológica Nacional (UTN).

## **🎯 Objetivo del Trabajo Práctico**

El objetivo principal de este proyecto es modelar, diseñar e implementar distintos tipos de **relaciones entre clases** (específicamente 1 a 1\) utilizando diagramas UML y su posterior implementación en el lenguaje de programación Java. Se busca reforzar la capacidad de abstracción y el análisis de modelos orientados a objetos.

## **🔗 Tipos de Relaciones Abordadas**

En los diferentes ejercicios se exploran y aplican los siguientes tipos de relaciones:

* **Asociación:** Una relación estructural que describe una conexión entre objetos.  
  * *Unidireccional y Bidireccional*.  
* **Agregación:** Una forma especializada de asociación que representa una relación "tiene un" (has-a), donde las partes pueden existir independientemente del todo.  
* **Composición:** Una forma fuerte de agregación donde las partes no pueden existir sin el todo. El ciclo de vida de la parte está ligado al del compuesto.  
* **Dependencia:** Una relación en la que un cambio en un elemento (el independiente) puede afectar a otro elemento (el dependiente).  
  * *Dependencia de Uso*: Una clase usa a otra como parámetro en un método.  
  * *Dependencia de Creación*: Una clase crea una instancia de otra dentro de un método.

## **📂 Estructura del Repositorio**

El proyecto está organizado en diferentes ejercicios, cada uno enfocado en un escenario particular para aplicar los conceptos. Cada ejercicio resuelto incluye:

1. **Diagrama UML:** Un diagrama de clases realizado con sintaxis de **Mermaid** para visualizar la estructura y las relaciones.  
2. **Análisis de la Relación:** Una descripción detallada del tipo de relación, su dirección (unidireccional/bidireccional) y la justificación de su elección.  
3. **Implementación en Java:** El código fuente de las clases involucradas, reflejando fielmente el diseño del diagrama UML.

## **📋 Listado de Ejercicios**

1. **Pasaporte \- Foto \- Titular** (Composición, Asociación)  
2. **Celular \- Batería \- Usuario** (Agregación, Asociación)  
3. **Libro \- Autor \- Editorial** (Asociación, Agregación)  
4. **TarjetaDeCrédito \- Cliente \- Banco** (Asociación, Agregación)  
5. **Computadora \- Placa Madre \- Propietario** (Composición, Asociación)  
6. **Reserva \- Cliente \- Mesa** (Asociación, Agregación)  
7. **Vehículo \- Motor \- Conductor** (Agregación, Asociación)  
8. **Documento \- FirmaDigital \- Usuario** (Composición, Agregación)  
9. **Cita Médica \- Paciente \- Profesional** (Asociación)  
10. **CuentaBancaria \- ClaveSeguridad \- Titular** (Composición, Asociación)  
11. **Reproductor \- Canción \- Artista** (Dependencia de Uso)  
12. **Impuesto \- Contribuyente \- Calculadora** (Dependencia de Uso)  
13. **GeneradorQR \- Usuario \- CódigoQR** (Dependencia de Creación)  
14. **EditorVideo \- Proyecto \- Render** (Dependencia de Creación)

## **🛠️ Tecnologías Utilizadas**

* **Lenguaje de Programación:** Java  
* **Modelado:** Diagramas UML (con sintaxis Mermaid)  
* **Documentación:** Markdown

Este proyecto sirve como una guía práctica y material de consulta para comprender y aplicar correctamente los distintos tipos de relaciones en el paradigma de la Programación Orientada a Objetos.
