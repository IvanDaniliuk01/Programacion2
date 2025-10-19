/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComportamientoSobrescrito;

class Perro extends Animal {
    
    public Perro(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() { System.out.println("Guau!"); }

    @Override
    public String describirAnimal() { return "Perro: " + nombre; }
}
