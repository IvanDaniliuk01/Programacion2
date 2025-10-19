/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo2;

class Efectivo implements Pagable {
    
    @Override
    public boolean pagar(double monto) {
        System.out.printf("Pago en efectivo de $%.2f\n", monto);
        return true;
    }
}
