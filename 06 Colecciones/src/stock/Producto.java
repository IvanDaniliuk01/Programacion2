/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

/**
 * Clase Producto
 * Modela un producto con sus atributos básicos como id, nombre, precio,
 * cantidad en stock y categoría.
 */

public class Producto {
    // Atributos privados para encapsular los datos del producto
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    /**
     * Constructor para inicializar un objeto Producto con todos sus atributos.
     * @param id Identificador único del producto.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad disponible en stock.
     * @param categoria Categoría a la que pertenece el producto.
     */
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id inválido");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("nombre inválido");
        if (precio < 0) throw new IllegalArgumentException("precio negativo");
        if (cantidad < 0) throw new IllegalArgumentException("cantidad negativa");
        if (categoria == null) throw new IllegalArgumentException("categoría requerida");
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // --- Getters y Setters ---
    // Métodos para acceder y modificar los atributos de forma controlada.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    /**
     * Método para mostrar la información completa del producto en la consola.
     * Utiliza el método toString() para obtener una representación en texto del objeto.
     */
    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    /**
     * Sobrescribe el método toString() para devolver una representación
     * en formato String del objeto Producto.
     * @return Una cadena de texto con todos los detalles del producto.
     */
    @Override
    public String toString() {
        return "Producto {" +
                "ID: '" + id + '\'' +
                ", Nombre: '" + nombre + '\'' +
                ", Precio: $" + String.format("%.2f", precio) +
                ", Cantidad: " + cantidad +
                ", Categoría: '" + categoria.name() + " (" + categoria.getDescripcion() + ")" +
                '}';
    }
}
