/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej12;

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto para el contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto del impuesto: $" + impuesto.getMonto());
        // Aquí iría la lógica compleja del cálculo...
        System.out.println("Cálculo finalizado.");
    }
}

