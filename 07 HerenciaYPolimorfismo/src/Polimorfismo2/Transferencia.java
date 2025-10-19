/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo2;

class Transferencia implements Pagable {
    
    private String banco;
    private String cbu;

    public Transferencia(String banco, String cbu) {
        this.banco = banco;
        this.cbu = cbu;
    }

    @Override
    public boolean pagar(double monto) {
        System.out.printf("Transferencia de $%.2f desde %s (CBU %s)\n", monto, banco, cbu);
        return true;
    }
}
