/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daniliuk.ivan.tp.programación.estructurada;

import java.util.Scanner;

public class CostoEnvioTotal {

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5.0; // $5 por kg
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10.0; // $10 por kg
        }
        return 0.0; // Zona no válida
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        
        // Limpiar el buffer antes de leer la línea
        scanner.nextLine(); 

        String zona;
        do {
            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
            zona = scanner.nextLine();
            if (!zona.equalsIgnoreCase("Nacional") && !zona.equalsIgnoreCase("Internacional")) {
                System.out.println("Error: Zona no válida. Por favor, intente de nuevo.");
            }
        } while (!zona.equalsIgnoreCase("Nacional") && !zona.equalsIgnoreCase("Internacional"));

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        scanner.close();
    }
}
