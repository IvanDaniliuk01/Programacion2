/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComportamientoSobrescrito;

class Animal {
    
    protected String nombre;

    public Animal(String nombre) { this.nombre = nombre; }

    public void hacerSonido() {
        System.out.println("(silencio)");
    }

    public String describirAnimal() {
        return "Animal genérico llamado " + nombre;
    }
}
