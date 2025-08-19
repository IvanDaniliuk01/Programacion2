/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daniliuk.ivan.tp.programación.estructurada;

public class ImpresionRecursivaArray {

    // Función recursiva para mostrar los precios
    public static void imprimirArrayRecursivo(double[] array, int indice) {
        // Caso base: si el índice es igual a la longitud del array, terminamos.
        if (indice == array.length) {
            return;
        }
        
        // Paso recursivo: imprimir el elemento actual y llamar a la función para el siguiente.
        System.out.println("Precio: $" + array[indice]);
        imprimirArrayRecursivo(array, indice + 1);
    }

    public static void main(String[] args) {
        // a. Declarar e inicializar el array
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b. Usar la función recursiva para mostrar los precios originales
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0); // Empezamos desde el índice 0

        // c. Modificar el precio de un producto
        precios[2] = 129.99;

        // d. Usar la función recursiva de nuevo para mostrar los valores modificados
        System.out.println("\nPrecios modificados:");
        imprimirArrayRecursivo(precios, 0); // Empezamos de nuevo desde el índice 0
    }
}