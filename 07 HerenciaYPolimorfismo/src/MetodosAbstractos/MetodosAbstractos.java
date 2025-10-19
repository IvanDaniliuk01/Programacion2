/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosAbstractos;

/**
 *
 * @author idani
 */
public class MetodosAbstractos {
    
    public static void main(String[] args) {
        
        Figura[] figuras = new Figura[] {
            new Circulo(2.5),
            new Rectangulo(3, 4),
            new Circulo(1.2),
            new Rectangulo(10, 2.5)
        };

        for (Figura f : figuras) { // polimorfismo: la misma llamada invoca implementaciones distintas
        System.out.printf("Área de %s = %.3f%n", f.toString(), f.calcularArea());
        }
    }
}
