/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author idani
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        // --- Tarea 1: Instanciar varios objetos usando ambos constructores ---
        System.out.println("--- Creando empleados... ---");

        // Instancia usando el primer constructor (con todos los datos)
        Empleado emp1 = new Empleado(101, "Ana Gómez", "Desarrolladora Senior", 55000.0);

        // Instancias usando el segundo constructor (nombre y puesto, con ID y salario automáticos)
        Empleado emp2 = new Empleado("Juan Pérez", "Analista de Sistemas");
        Empleado emp3 = new Empleado("María Rodríguez", "Gerente de Proyectos");

        System.out.println("Empleados creados exitosamente.\n");

        // --- Tarea 2: Imprimir la información inicial de cada empleado ---
        System.out.println("--- Información Inicial de los Empleados ---");
        // Se llama implícitamente al método toString() de cada objeto.
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println();

        // --- Tarea 3: Aplicar los métodos actualizarSalario() ---
        System.out.println("--- Actualizando salarios... ---");

        // Actualizar salario de Ana (aumento de 10.5%)
        System.out.println("-> Aumentando salario de '" + emp1.getNombre() + "' en un 10.5%.");
        emp1.actualizarSalario(10.5); // Llama al método que recibe un double

        // Actualizar salario de Juan (aumento fijo de 2500)
        System.out.println("-> Aumentando salario de '" + emp2.getNombre() + "' con un monto fijo de $2500.");
        emp2.actualizarSalario(2500); // Llama al método que recibe un int

        System.out.println("Salarios actualizados.\n");

        // --- Tarea 4: Imprimir la información final ---
        System.out.println("--- Información Final de los Empleados ---");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3); // El salario de María no se modificó
        System.out.println();


        // --- Tarea 5: Mostrar el total de empleados creados ---
        System.out.println("--- Total de Empleados Creados ---");
        // Se llama al método estático directamente desde la clase, sin necesidad de un objeto.
        System.out.println("El número total de empleados registrados es: " + Empleado.mostrarTotalEmpleados());
    }
}
