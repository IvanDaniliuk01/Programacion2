/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daniliuk.ivan.tp.programación.estructurada;

import java.util.Scanner;

public class ActualizacionStock {

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        if (nuevoStock < 0) {
            System.out.println("Advertencia: El cálculo resultó en stock negativo. Se ajustará a 0.");
            return 0; // El stock no puede ser negativo
        }
        return nuevoStock;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stock, vendida, recibida;

        do {
            System.out.print("Ingrese el stock actual del producto (debe ser >= 0): ");
            stock = scanner.nextInt();
        } while (stock < 0);

        do {
            System.out.print("Ingrese la cantidad vendida (debe ser >= 0): ");
            vendida = scanner.nextInt();
        } while (vendida < 0);
        
        do {
            System.out.print("Ingrese la cantidad recibida (debe ser >= 0): ");
            recibida = scanner.nextInt();
        } while (recibida < 0);


        int nuevoStock = actualizarStock(stock, vendida, recibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        scanner.close();
    }
}