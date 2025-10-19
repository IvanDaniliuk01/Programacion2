/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Polimorfismo2;

interface Pagable {
    
    boolean pagar(double monto);
    
    default String medio() { return this.getClass().getSimpleName(); }
}
