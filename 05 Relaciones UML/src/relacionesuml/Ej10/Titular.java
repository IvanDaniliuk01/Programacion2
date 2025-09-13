/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // Asociación

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuentaBancaria(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
}
