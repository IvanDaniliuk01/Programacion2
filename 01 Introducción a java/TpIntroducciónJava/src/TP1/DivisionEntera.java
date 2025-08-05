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

public class DivisionEntera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el dividendo (entero): ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingresa el divisor (entero): ");
        int divisor = scanner.nextInt();

        int resultado = dividendo / divisor;

        // El resultado será un entero, la parte decimal se trunca.
        System.out.println("Resultado de la división entera: " + resultado);
        scanner.close();
    }
}
