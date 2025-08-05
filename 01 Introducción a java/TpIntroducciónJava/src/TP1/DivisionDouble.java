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

public class DivisionDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Ingresa el divisor: ");
        double divisor = scanner.nextDouble();

        double resultado = dividendo / divisor;

        // El resultado incluirá la parte decimal.
        System.out.println("Resultado de la división con double: " + resultado);
        scanner.close();
    }
}
