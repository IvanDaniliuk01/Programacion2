/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición
    private Titular titular; // Asociación

    public CuentaBancaria(String cbu, double saldo, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.titular = titular;
        this.clave = new ClaveSeguridad(); // Se crea al instanciar la cuenta
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
}
