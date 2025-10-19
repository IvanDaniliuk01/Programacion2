/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

class EmpleadoPlanta extends Empleado {
    
    private double sueldoBase;
    private int antiguedadAnios;

    public EmpleadoPlanta(String nombre, double sueldoBase, int antiguedadAnios) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.antiguedadAnios = antiguedadAnios;
    }

    public int getAntiguedadAnios() { return antiguedadAnios; }

    @Override
    public double calcularSueldo() {
        double adicionalPorAntiguedad = 0.03 * antiguedadAnios * sueldoBase; // 3% por año
        return sueldoBase + adicionalPorAntiguedad;
    }
}
