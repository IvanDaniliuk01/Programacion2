/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionapoo;

public class Estudiante {
    // Atributos de la clase Estudiante
    String nombre;
    String apellido;
    String curso;
    double calificacion; // Usamos double para calificaciones con decimales

    /**
     * Constructor para inicializar un objeto Estudiante.
     * @param nombre El nombre del estudiante.
     * @param apellido El apellido del estudiante.
     * @param curso El curso en el que está inscrito.
     * @param calificacion La calificación inicial.
     */
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    /**
     * Muestra la información completa del estudiante en la consola.
     */
    public void mostrarInfo() {
        System.out.println("Información del Estudiante:");
        System.out.println("Nombre Completo: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    /**
     * Aumenta la calificación del estudiante.
     * @param puntos La cantidad de puntos a subir.
     */
    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("La calificación de " + nombre + " ha subido a " + this.calificacion);
    }

    /**
     * Disminuye la calificación del estudiante.
     * @param puntos La cantidad de puntos a bajar.
     */
    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        System.out.println("La calificación de " + nombre + " ha bajado a " + this.calificacion);
    }
}
