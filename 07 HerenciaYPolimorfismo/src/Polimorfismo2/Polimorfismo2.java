/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo2;

import java.util.*;

public class Polimorfismo2 {
    
    public static void main(String[] args) {
    
        List<Pagable> medios = Arrays.asList(
            new TarjetaCredito("Ana", "4111111111111111"),
            new Transferencia("Banco Nación", "2850590940090418135201"),
            new Efectivo()
        );

        for (Pagable m : medios) {
            ProcesadorPagos.procesarPago(m, 12345.67);
        }
    }
}
