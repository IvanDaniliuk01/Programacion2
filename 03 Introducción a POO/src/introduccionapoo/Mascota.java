/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionapoo;

public class Mascota {
    // Atributos de la clase Mascota
    String nombre;
    String especie;
    int edad;

    /**
     * Constructor para inicializar un objeto Mascota.
     * @param nombre El nombre de la mascota.
     * @param especie La especie de la mascota (ej. "Perro", "Gato").
     * @param edad La edad inicial de la mascota.
     */
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    /**
     * Muestra la información completa de la mascota en la consola.
     */
    public void mostrarInfo() {
        System.out.println("Información de la Mascota:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    /**
     * Incrementa la edad de la mascota en un año.
     */
    public void cumplirAnios() {
        this.edad++; // Incrementa la edad en 1
        System.out.println("¡Feliz cumpleaños, " + nombre + "! Ahora tiene " + this.edad + " años.");
    }
}
