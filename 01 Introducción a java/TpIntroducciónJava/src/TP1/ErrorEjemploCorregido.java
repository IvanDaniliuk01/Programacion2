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

public class ErrorEjemploCorregido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");

        // SOLUCIÓN: Usar nextLine() para leer una cadena de texto.
        String nombre = scanner.nextLine(); 

        System.out.println("Hola, " + nombre);
        scanner.close(); // Buena práctica
    }
}