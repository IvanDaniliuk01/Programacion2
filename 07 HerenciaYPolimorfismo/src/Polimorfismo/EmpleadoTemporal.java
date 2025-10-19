/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

class EmpleadoTemporal extends Empleado {
    
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double tarifaHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSueldo() { return horasTrabajadas * tarifaHora; }
}
