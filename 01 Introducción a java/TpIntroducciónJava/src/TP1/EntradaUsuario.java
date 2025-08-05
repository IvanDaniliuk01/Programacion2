/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1;

import java.util.Scanner;

/**
 *
 * @author iva1dan
 */


public class EntradaUsuario {

    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer el nombre
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar y leer la edad
        System.out.print("Ahora, ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Mostrar los datos ingresados
        System.out.println("\n--- Datos Ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        // Es una buena práctica cerrar el scanner cuando ya no se usa
        scanner.close();
    }
}
