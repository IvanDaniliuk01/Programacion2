/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionapoo;

/**
 *
 * @author idani
 */
public class IntroduccionAPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("### INICIO DEL TRABAJO PRÁCTICO DE POO ###\n");

        // --- Ejercicio 1: Registro de Estudiantes ---
        System.out.println("=============================================");
        System.out.println("EJERCICIO 1: REGISTRO DE ESTUDIANTES");
        System.out.println("=============================================");
        // Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", "Programación II", 7.5);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(1.5); // Sube la nota a 9.0
        estudiante1.bajarCalificacion(0.5);  // Baja la nota a 8.5
        estudiante1.mostrarInfo();
        System.out.println("\n");


        // --- Ejercicio 2: Registro de Mascotas ---
        System.out.println("=============================================");
        System.out.println("EJERCICIO 2: REGISTRO DE MASCOTAS");
        System.out.println("=============================================");
        // Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.
        Mascota mascota1 = new Mascota("Fido", "Perro", 3);
        mascota1.mostrarInfo();
        mascota1.cumplirAnios(); // Simula que pasa un año
        mascota1.mostrarInfo(); // Verificamos el cambio en la edad
        System.out.println("\n");


        // --- Ejercicio 3: Encapsulamiento con la Clase Libro ---
        System.out.println("=============================================");
        System.out.println("EJERCICIO 3: ENCAPSULAMIENTO CON LIBRO");
        System.out.println("=============================================");
        // Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final.
        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954);
        System.out.println("--- Información Inicial del Libro ---");
        libro1.mostrarInfo();
        System.out.println("\n--- Intentando modificar el año ---");
        libro1.setAnioPublicacion(2030); // Intento con valor inválido (futuro)
        libro1.setAnioPublicacion(-500); // Intento con valor inválido (negativo)
        libro1.setAnioPublicacion(1955); // Intento con valor válido
        System.out.println("\n--- Información Final del Libro ---");
        libro1.mostrarInfo();
        System.out.println("\n");


        // --- Ejercicio 4: Gestión de Gallinas en Granja Digital ---
        System.out.println("=============================================");
        System.out.println("EJERCICIO 4: GESTIÓN DE GALLINAS");
        System.out.println("=============================================");
        // Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
        Gallina gallinaA = new Gallina(101);
        Gallina gallinaB = new Gallina(102);
        System.out.println("--- Estado Inicial de las Gallinas ---");
        gallinaA.mostrarEstado();
        gallinaB.mostrarEstado();
        System.out.println("\n--- Simulación de un día en la granja ---");
        gallinaA.ponerHuevo();
        gallinaA.ponerHuevo();
        gallinaB.ponerHuevo();
        gallinaA.envejecer();
        System.out.println("\n--- Estado Final de las Gallinas ---");
        gallinaA.mostrarEstado();
        gallinaB.mostrarEstado();
        System.out.println("\n");


        // --- Ejercicio 5: Simulación de Nave Espacial ---
        System.out.println("=============================================");
        System.out.println("EJERCICIO 5: SIMULACIÓN DE NAVE ESPACIAL");
        System.out.println("=============================================");
        // Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente.
        NaveEspacial enterprise = new NaveEspacial("Enterprise", 50);
        enterprise.mostrarEstado();
        enterprise.despegar();
        enterprise.mostrarEstado();
        System.out.println("\n--- Intentando avanzar sin combustible suficiente ---");
        enterprise.avanzar(50); // No debería poder, solo tiene 40 de combustible
        enterprise.mostrarEstado();
        System.out.println("\n--- Recargando combustible y avanzando ---");
        enterprise.recargarCombustible(30);
        enterprise.mostrarEstado();
        enterprise.avanzar(50); // Ahora sí debería poder
        enterprise.mostrarEstado();
    }
}
    
