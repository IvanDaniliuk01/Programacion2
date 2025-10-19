/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

import java.util.*;

public class Polimorfismo {
    public static void main(String[] args) {
        
    List<Empleado> empleados = new ArrayList<>();
    empleados.add(new EmpleadoPlanta("Ana", 800000, 5));
    empleados.add(new EmpleadoTemporal("Luis", 160, 3500));
    empleados.add(new EmpleadoPlanta("Sofía", 650000, 2));

    for (Empleado e : empleados) {
        
            String tipo;

            if (e instanceof EmpleadoPlanta) {
                tipo = "Planta";
            } else if (e instanceof EmpleadoTemporal) {
                tipo = "Temporal";
            } else {
                tipo = "Desconocido";
            }
        
            System.out.printf("%s (%s) -> Sueldo: $%.2f%n", e.getNombre(), tipo, e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                EmpleadoPlanta ep = (EmpleadoPlanta) e;
                System.out.println(" Antigüedad años: " + ep.getAntiguedadAnios());
            }
        }
    }
}
