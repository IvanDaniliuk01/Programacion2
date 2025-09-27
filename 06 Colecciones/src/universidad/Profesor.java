/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Clase Profesor
 * Modela a un profesor y mantiene una lista de los cursos que dicta.
 * Participa en una relación bidireccional con la clase Curso.
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // Relación: Un profesor dicta muchos cursos

    /**
     * Constructor de la clase Profesor.
     * @param id Identificador único del profesor.
     * @param nombre Nombre completo.
     * @param especialidad Área de especialización.
     */
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>(); // Inicializa la lista de cursos
    }

    // --- Getters ---
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    /**
     * Agrega un curso a la lista de cursos que dicta este profesor.
     * Este método asegura la consistencia de la relación bidireccional.
     * @param c El curso a agregar.
     */
    public void agregarCurso(Curso c) {
        if (c != null && !this.cursos.contains(c)) {
            this.cursos.add(c);
            // Sincroniza el otro lado de la relación: asigna este profesor al curso
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    /**
     * Elimina un curso de la lista de cursos que dicta este profesor.
     * También asegura la consistencia, quitando el profesor del curso.
     * @param c El curso a eliminar.
     */
    public void eliminarCurso(Curso c) {
        if (c != null && this.cursos.contains(c)) {
            this.cursos.remove(c);
            // Sincroniza el otro lado: el curso se queda sin profesor
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    /**
     * Muestra en consola los cursos que dicta el profesor.
     */
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + this.nombre + " no tiene cursos asignados.");
            return;
        }
        System.out.println("Cursos dictados por " + this.nombre + ":");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getNombre() + " (Código: " + curso.getCodigo() + ")");
        }
    }

    /**
     * Muestra la información completa del profesor.
     */
    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    /**
     * Sobrescribe el método toString para una representación textual.
     * @return Una cadena con los detalles del profesor.
     */
    @Override
    public String toString() {
        return "Profesor {" +
                "ID: '" + id + '\'' +
                ", Nombre: '" + nombre + '\'' +
                ", Especialidad: '" + especialidad + '\'' +
                ", N° de Cursos: " + cursos.size() +
                '}';
    }
}
