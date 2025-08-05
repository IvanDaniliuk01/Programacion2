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

public class OperacionesAritmeticas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        // Solicitar el segundo número
        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Realizar las operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        // Para la división, es mejor usar double para un resultado preciso
        double division = (double) num1 / num2;

        // Mostrar los resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        scanner.close();
    }
}
