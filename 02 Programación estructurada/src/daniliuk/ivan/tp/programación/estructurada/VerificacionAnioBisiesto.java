package daniliuk.ivan.tp.programación.estructurada;

import java.util.Scanner;

public class VerificacionAnioBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        // Un año es bisiesto si es divisible por 4, excepto los divisibles por 100
        // a menos que también sean divisibles por 400.
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

        scanner.close();
    }
}
