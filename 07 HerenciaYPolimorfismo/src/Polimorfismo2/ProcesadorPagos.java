/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo2;

class ProcesadorPagos {
    
    public static <T extends Pagable> void procesarPago(T medio, double monto) {
        boolean ok = medio.pagar(monto);
        System.out.println("Resultado: " + (ok ? "OK" : "FALLÓ") + " - Medio: " + medio.medio());
    }
}
