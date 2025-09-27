/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Clase Inventario
 * Gestiona una colección de productos. Permite agregar, eliminar, buscar,
 * filtrar y realizar otras operaciones sobre el listado de productos.
 */

public class Inventario {

    // Atributo principal: una lista dinámica para almacenar los productos.
    private List<Producto> productos;

    /**
     * Constructor de la clase Inventario.
     * Inicializa la lista de productos vacía.
     */
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo producto a la lista del inventario.
     * @param p El producto a agregar.
     */
    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println("Producto '" + p.getNombre() + "' agregado al inventario.");
    }

    /**
     * Muestra en consola la información de todos los productos en el inventario.
     */
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("--- Listado de Productos en Inventario ---");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    /**
     * Busca un producto en el inventario por su ID.
     * @param id El ID del producto a buscar.
     * @return El objeto Producto si se encuentra, o null si no existe.
     */
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Elimina un producto del inventario usando su ID.
     * @param id El ID del producto a eliminar.
     */
    public void eliminarProducto(String id) {
        Producto productoAEliminar = buscarProductoPorId(id);
        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
            System.out.println("Producto '" + productoAEliminar.getNombre() + "' eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar: Producto con ID '" + id + "' no encontrado.");
        }
    }

    /**
     * Actualiza la cantidad de stock de un producto específico.
     * @param id El ID del producto a actualizar.
     * @param nuevaCantidad La nueva cantidad de stock.
     */
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto productoAActualizar = buscarProductoPorId(id);
        if (productoAActualizar != null) {
            productoAActualizar.setCantidad(nuevaCantidad);
            System.out.println("Stock del producto '" + productoAActualizar.getNombre() + "' actualizado a " + nuevaCantidad + " unidades.");
        } else {
            System.out.println("No se pudo actualizar: Producto con ID '" + id + "' no encontrado.");
        }
    }

    /**
     * Muestra en consola todos los productos que pertenecen a una categoría específica.
     * @param categoria La categoría por la cual filtrar.
     */
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("--- Productos de la categoría: " + categoria.name() + " ---");
        boolean encontrados = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron productos en esta categoría.");
        }
    }

    /**
     * Calcula y devuelve la suma total de unidades de todos los productos en stock.
     * @return El total de stock como un entero.
     */
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    /**
     * Encuentra y devuelve el producto con la mayor cantidad de stock.
     * @return El producto con más stock, o null si el inventario está vacío.
     */
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }

        return productos.stream()
                .max(Comparator.comparingInt(Producto::getCantidad))
                .orElse(null);
    }

    /**
     * Muestra en consola los productos cuyo precio se encuentra dentro de un rango específico.
     * @param min Precio mínimo del rango.
     * @param max Precio máximo del rango.
     */
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("--- Productos con precio entre $" + min + " y $" + max + " ---");
        boolean encontrados = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
    }

    /**
     * Muestra en consola todas las categorías disponibles junto con sus descripciones.
     */
    public void mostrarCategoriasDisponibles() {
        System.out.println("--- Categorías de Productos Disponibles ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("- " + cat.name() + ": " + cat.getDescripcion());
        }
    }
}
