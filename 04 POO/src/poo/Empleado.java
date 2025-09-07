/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 * La clase Empleado modela a un trabajador de una empresa, gestionando
 * sus datos personales y salariales.
 * Incluye conceptos de POO como sobrecarga, 'this' y miembros estáticos.
 */

public class Empleado {

    // Atributos de la instancia para cada objeto Empleado
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático: es compartido por todas las instancias de la clase.
    private static int totalEmpleados = 0;

    /**
     * Constructor 1: Sobrecargado.
     * Recibe todos los atributos para inicializar un objeto Empleado.
     * Utiliza 'this' para desambiguar entre los atributos de la clase y los parámetros del método.
     *
     * @param id Identificador único del empleado.
     * @param nombre Nombre completo del empleado.
     * @param puesto Cargo que ocupa el empleado.
     * @param salario Salario del empleado.
     */
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        // Cada vez que se crea un empleado con este constructor, se incrementa el contador.
        totalEmpleados++;
    }

    /**
     * Constructor 2: Sobrecargado.
     * Recibe solo nombre y puesto. Asigna un ID automático basado en el contador
     * de empleados y un salario por defecto.
     *
     * @param nombre Nombre completo del empleado.
     * @param puesto Cargo que ocupa el empleado.
     */
    
    public Empleado(String nombre, String puesto) {
        // Se autoincrementa el contador primero y luego se asigna como ID.
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 35000.50; // Salario por defecto.
    }

    /**
     * Método 1 para actualizar el salario (Sobrecargado).
     * Aumenta el salario basado en un porcentaje.
     *
     * @param porcentajeAumento El porcentaje a aumentar (ej. 10 para 10%).
     */
    
    public void actualizarSalario(double porcentajeAumento) {
        this.salario += this.salario * (porcentajeAumento / 100);
    }

    /**
     * Método 2 para actualizar el salario (Sobrecargado).
     * Aumenta el salario en una cantidad fija.
     *
     * @param cantidadAumento La cantidad fija a sumar al salario actual.
     */
    
    public void actualizarSalario(int cantidadAumento) {
        this.salario += cantidadAumento;
    }

    /**
     * Sobrescribe el método toString() de la clase Object.
     * Provee una representación en formato de texto legible del estado actual del objeto.
     *
     * @return Un String con los detalles del empleado.
     */
    
    @Override
    public String toString() {
        // Se usa String.format para mostrar el salario con dos decimales.
        return """
               Empleado {
                 id = """ + id + ",\n" +
               "  nombre = '" + nombre + "',\n" +
               "  puesto = '" + puesto + "',\n" +
               "  salario = $" + String.format("%.2f", salario) + "\n" +
               "}";
    }

    /**
     * Método estático: Se puede llamar sin necesidad de crear una instancia de la clase
     * (usando Empleado.mostrarTotalEmpleados()).
     *
     * @return El número total de empleados creados.
     */
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // --- Getters y Setters (Buenas prácticas de encapsulamiento) ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}