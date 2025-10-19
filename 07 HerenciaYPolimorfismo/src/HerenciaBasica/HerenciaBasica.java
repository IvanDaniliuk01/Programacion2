/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerenciaBasica;

/**
 *
 * @author idani
 */
public class HerenciaBasica {
    public static void main(String[] args) {
        
        Auto auto = new Auto("Renault", "Sandero", 5);
        Vehiculo v = auto;
        System.out.println(v.mostrarInfo());

        if (v instanceof Auto) {
        Auto a = (Auto) v;
        System.out.println("Puertas (downcast): " + a.getCantidadPuertas());
        }
    }
}
