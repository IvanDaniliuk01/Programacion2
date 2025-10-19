/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo2;

class TarjetaCredito implements Pagable {
    
    private String titular;
    private String numero;

    public TarjetaCredito(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    @Override
    public boolean pagar(double monto) {
        System.out.printf("Pagando $%.2f con Tarjeta de %s (****%s)\n", monto, titular, numero.substring(numero.length()-4));
        return true;
    }
}
