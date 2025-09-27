/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

import java.util.Objects;

/**
 * Clase Curso
 * Modela un curso académico y mantiene una referencia a su profesor responsable.
 * Participa en una relación bidireccional con la clase Profesor.
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // Relación: Un curso tiene un Profesor

    /**
     * Constructor de la clase Curso.
     * @param codigo Código único del curso.
     * @param nombre Nombre del curso.
     */
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Un curso puede crearse sin profesor asignado
    }

    // --- Getters ---
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Asigna o cambia el profesor del curso, manteniendo la consistencia
     * de la relación bidireccional.
     * @param p El nuevo profesor para el curso (puede ser null).
     */
    public void setProfesor(Profesor p) {
        // Si ya tenía un profesor asignado, debemos eliminar este curso de la lista de ese antiguo profesor.
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }

        // Asignamos el nuevo profesor al curso.
        this.profesor = p;

        // Si el nuevo profesor no es nulo, agregamos este curso a su lista.
        if (p != null) {
            p.getCursos().add(this);
        }
    }

    /**
     * Muestra la información completa del curso.
     */
    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    /**
     * Sobrescribe el método toString para una representación textual.
     * @return Una cadena con los detalles del curso.
     */
    @Override
    public String toString() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        return "Curso {" +
                "Código: '" + codigo + '\'' +
                ", Nombre: '" + nombre + '\'' +
                ", Profesor: '" + nombreProfesor + '\'' +
                '}';
    }

}