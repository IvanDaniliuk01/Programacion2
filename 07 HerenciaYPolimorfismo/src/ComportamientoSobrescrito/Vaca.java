/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComportamientoSobrescrito;

class Vaca extends Animal {

    public Vaca(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() { System.out.println("Muu!"); }

    @Override
    public String describirAnimal() { return "Vaca: " + nombre; }
}
