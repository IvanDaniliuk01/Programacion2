/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionapoo;

public class NaveEspacial {
    // Atributos de la clase
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100; // Constante para el límite de combustible

    /**
     * Constructor para crear una nave espacial.
     * @param nombre El nombre de la nave.
     * @param combustibleInicial El combustible con el que inicia.
     */
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }

    /**
     * Muestra el estado actual de la nave.
     */
    public void mostrarEstado() {
        System.out.println("--- Estado de la Nave: " + nombre + " ---");
        System.out.println("Combustible restante: " + combustible + "/" + MAX_COMBUSTIBLE);
        System.out.println("------------------------------------");
    }

    /**
     * Simula el despegue, consumiendo una cantidad fija de combustible.
     */
    public void despegar() {
        int costoDespegue = 10;
        if (combustible >= costoDespegue) {
            combustible -= costoDespegue;
            System.out.println("¡La nave " + nombre + " ha despegado! Consumo: " + costoDespegue + " unidades.");
        } else {
            System.out.println("Fallo en el despegue: combustible insuficiente.");
        }
    }

    /**
     * Avanza una distancia, consumiendo combustible.
     * El costo es 1 unidad de combustible por unidad de distancia.
     * @param distancia La distancia a avanzar.
     */
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println("La nave ha avanzado " + distancia + " unidades.");
        } else {
            System.out.println("No se puede avanzar: combustible insuficiente para recorrer " + distancia + " unidades.");
        }
    }

    /**
     * Recarga combustible, sin superar el máximo permitido.
     * @param cantidad La cantidad de combustible a recargar.
     */
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        }

        int combustiblePrevio = this.combustible;
        this.combustible += cantidad;

        if (this.combustible > MAX_COMBUSTIBLE) {
            this.combustible = MAX_COMBUSTIBLE;
        }

        int recargado = this.combustible - combustiblePrevio;
        System.out.println("Se han recargado " + recargado + " unidades de combustible.");
    }
}
