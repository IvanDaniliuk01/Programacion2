/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Universidad
 * Actúa como clase gestora principal, administrando listas de profesores y cursos.
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public String nombre() { return this.nombre; }

    public void agregarProfesor(Profesor p) {
        this.profesores.add(p);
        System.out.println("Profesor '" + p.getNombre() + "' agregado a la universidad.");
    }

    public void agregarCurso(Curso c) {
        this.cursos.add(c);
        System.out.println("Curso '" + c.getNombre() + "' agregado a la universidad.");
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Asigna un profesor a un curso, buscando ambos por sus identificadores.
     * @param codigoCurso El código del curso.
     * @param idProfesor El ID del profesor.
     */
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println("Asignación exitosa: Profesor '" + profesor.getNombre() + "' al curso '" + curso.getNombre() + "'.");
        } else {
            System.out.println("Error en la asignación: No se encontró el curso o el profesor.");
        }
    }

    public void listarProfesores() {
        System.out.println("--- Listado de Profesores de la Universidad " + nombre + " ---");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("--- Listado de Cursos de la Universidad " + nombre + " ---");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }
}
