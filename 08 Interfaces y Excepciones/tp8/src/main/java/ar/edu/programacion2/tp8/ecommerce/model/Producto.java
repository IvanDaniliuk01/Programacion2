package ar.edu.programacion2.tp8.ecommerce.model;

import java.util.Objects;

/**
 * Modelo inmutable que representa un producto del catálogo.
 */
public class Producto {

    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        this.nombre = validarNombre(nombre);
        this.precio = validarPrecio(precio);
    }

    private String validarNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío");
        }
        return nombre.trim();
    }

    private double validarPrecio(double precio) {
        if (Double.isNaN(precio) || Double.isInfinite(precio)) {
            throw new IllegalArgumentException("El precio del producto no es válido");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("El precio del producto no puede ser negativo");
        }
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Producto producto = (Producto) o;
        return Double.compare(producto.precio, precio) == 0 && nombre.equals(producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

