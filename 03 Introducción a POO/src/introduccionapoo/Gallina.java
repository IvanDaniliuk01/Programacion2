/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionapoo;

public class Gallina {
    // Atributos de la clase Gallina
    int idGallina;
    int edad;
    int huevosPuestos;

    /**
     * Constructor para crear una nueva Gallina.
     * @param idGallina Identificador único para la gallina.
     */
    public Gallina(int idGallina) {
        this.idGallina = idGallina;
        this.edad = 0; // Las gallinas nacen con edad 0
        this.huevosPuestos = 0; // Y 0 huevos puestos
    }

    /**
     * Simula que la gallina pone un huevo, incrementando el contador.
     */
    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("La gallina " + idGallina + " ha puesto un huevo. Total: " + huevosPuestos);
    }

    /**
     * Incrementa la edad de la gallina en un año.
     */
    public void envejecer() {
        this.edad++;
        System.out.println("La gallina " + idGallina + " ahora tiene " + edad + " años.");
    }

    /**
     * Muestra el estado actual de la gallina.
     */
    public void mostrarEstado() {
        System.out.println("--- Estado de la Gallina ID: " + idGallina + " ---");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos Puestos: " + huevosPuestos);
        System.out.println("------------------------------------");
    }
}
