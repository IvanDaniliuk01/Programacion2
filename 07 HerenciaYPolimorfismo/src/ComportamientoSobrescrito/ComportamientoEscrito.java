/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComportamientoSobrescrito;

import java.util.*;

public class ComportamientoEscrito {
    
    public static void main(String[] args) {
        
        List<Animal> animales = Arrays.asList(
            new Perro("Fido"),
            new Gato("Mishi"),
            new Vaca("Lola")
        );

        for (Animal a : animales) {
            System.out.println(a.describirAnimal());
            a.hacerSonido(); // polimorfismo por sobrescritura
        }
    }
}
