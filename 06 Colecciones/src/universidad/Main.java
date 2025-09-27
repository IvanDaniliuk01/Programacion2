/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

public class Main {
    public static void main(String[] args) {
        // --- Creación de la Universidad ---
        Universidad miUniversidad = new Universidad("UTN");
        System.out.println("Sistema de gestión para la Universidad " + miUniversidad.nombre() + " inicializado.");

        // --- Tarea 1: Crear al menos 3 profesores y 5 cursos ---
        System.out.println("\n--- Tarea 1: Creando profesores y cursos ---");
        Profesor prof1 = new Profesor("P001", "Ana Torres", "Matemáticas");
        Profesor prof2 = new Profesor("P002", "Carlos Ruiz", "Programación");
        Profesor prof3 = new Profesor("P003", "Laura Mendez", "Bases de Datos");

        Curso curso1 = new Curso("C101", "Álgebra");
        Curso curso2 = new Curso("C102", "Cálculo");
        Curso curso3 = new Curso("C201", "Programación I");
        Curso curso4 = new Curso("C202", "Programación II");
        Curso curso5 = new Curso("C301", "Bases de Datos I");
        System.out.println("Entidades creadas.");

        // --- Tarea 2: Agregar profesores y cursos a la universidad ---
        System.out.println("\n--- Tarea 2: Agregando entidades a la universidad ---");
        miUniversidad.agregarProfesor(prof1);
        miUniversidad.agregarProfesor(prof2);
        miUniversidad.agregarProfesor(prof3);
        miUniversidad.agregarCurso(curso1);
        miUniversidad.agregarCurso(curso2);
        miUniversidad.agregarCurso(curso3);
        miUniversidad.agregarCurso(curso4);
        miUniversidad.agregarCurso(curso5);

        // --- Tarea 3: Asignar profesores a cursos ---
        System.out.println("\n--- Tarea 3: Asignando profesores a cursos ---");
        miUniversidad.asignarProfesorACurso("C101", "P001"); // Álgebra con Ana
        miUniversidad.asignarProfesorACurso("C102", "P001"); // Cálculo con Ana
        miUniversidad.asignarProfesorACurso("C201", "P002"); // Programación I con Carlos
        miUniversidad.asignarProfesorACurso("C202", "P002"); // Programación II con Carlos
        miUniversidad.asignarProfesorACurso("C301", "P003"); // BD I con Laura

        // --- Tarea 4: Listar cursos con su profesor y profesores con sus cursos ---
        System.out.println("\n--- Tarea 4: Verificación de asignaciones ---");
        System.out.println("--- Listado de Cursos y sus Profesores ---");
        miUniversidad.listarCursos();
        System.out.println("\n--- Listado de Profesores y sus Cursos ---");
        prof1.listarCursos();
        prof2.listarCursos();
        prof3.listarCursos();

        // --- Tarea 5: Cambiar el profesor de un curso y verificar sincronización ---
        System.out.println("\n--- Tarea 5: Cambiando profesor del curso 'Programación II' a Laura Mendez ---");
        miUniversidad.asignarProfesorACurso("C202", "P003");
        
        System.out.println("\nVerificando estado del profesor Carlos Ruiz (ya no debería tener Prog II):");
        prof2.listarCursos();
        
        System.out.println("\nVerificando estado de la profesora Laura Mendez (debería tener Prog II y BD I):");
        prof3.listarCursos();
        
        System.out.println("\nVerificando el curso 'Programación II':");
        miUniversidad.buscarCursoPorCodigo("C202").mostrarInfo();

        System.out.println("\n¡Con esto finalizamos el trabajo práctico!");
    }
}
