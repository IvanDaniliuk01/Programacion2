/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daniliuk.ivan.tp.programación.estructurada;

import java.util.Scanner;

public class CalculoPrecioFinal {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convertir porcentajes a decimales
        double impuestoDecimal = impuesto / 100.0;
        double descuentoDecimal = descuento / 100.0;
        
        // Aplicar la fórmula
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double imp = scanner.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double desc = scanner.nextDouble();

        double finalPrice = calcularPrecioFinal(base, imp, desc);
        System.out.println("El precio final del producto es: " + finalPrice);

        scanner.close();
    }
}