package daniliuk.ivan.tp.programación.estructurada;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().charAt(0);

        double descuento = 0.0;
        String porcentajeDescuento = "";

        switch (Character.toUpperCase(categoria)) {
            case 'A':
                descuento = 0.10; // 10%
                porcentajeDescuento = "10%";
                break;
            case 'B':
                descuento = 0.15; // 15%
                porcentajeDescuento = "15%";
                break;
            case 'C':
                descuento = 0.20; // 20%
                porcentajeDescuento = "20%";
                break;
            default:
                System.out.println("Categoría no válida.");
                scanner.close();
                return;
        }

        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;

        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + porcentajeDescuento);
        System.out.println("Precio final: " + precioFinal);

        scanner.close();
    }
}
