/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daniliuk.ivan.tp.programación.estructurada;

import java.util.Scanner;

public class DescuentoEspecial {

    // Variable global (estática) para el descuento
    static final double DESCUENTO_ESPECIAL = 0.10; // 10%

    public static void calcularDescuentoEspecial(double precio) {
        // Variable local para almacenar el descuento calculado
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        calcularDescuentoEspecial(precioProducto);

        scanner.close();
    }
}
