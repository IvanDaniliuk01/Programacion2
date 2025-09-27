/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

/**
 *
 * @author idani
 */
public class Main {
    public static void main(String[] args) {
        // Creamos una instancia del inventario
        Inventario inventario = new Inventario();
        System.out.println("Sistema de Gestión de Inventario Inicializado.");

        // --- Tarea 1: Crear y agregar al menos cinco productos ---
        System.out.println("\n--- Tarea 1: Agregando productos al inventario ---");
        inventario.agregarProducto(new Producto("E01", "Smartphone Samsung S23", 2800.00, 15, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("A01", "Paquete de Arroz 1kg", 850.50, 120, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("R01", "Camisa de Algodón", 1500.00, 50, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("H01", "Juego de Sábanas Queen", 2200.00, 30, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("E02", "Auriculares Inalámbricos Sony", 1250.00, 80, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("A02", "Aceite de Girasol 900ml", 980.00, 200, CategoriaProducto.ALIMENTOS));

        // --- Tarea 2: Listar todos los productos ---
        System.out.println("\n--- Tarea 2: Listar todos los productos ---");
        inventario.listarProductos();

        // --- Tarea 3: Buscar un producto por ID ---
        System.out.println("\n--- Tarea 3: Buscar producto con ID 'R01' ---");
        Producto encontrado = inventario.buscarProductoPorId("R01");
        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // --- Tarea 4: Filtrar productos por categoría ---
        System.out.println("\n--- Tarea 4: Filtrar por categoría ELECTRONICA ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // --- Tarea 5: Eliminar un producto y listar los restantes ---
        System.out.println("\n--- Tarea 5: Eliminar producto con ID 'A02' ---");
        inventario.eliminarProducto("A02");
        inventario.listarProductos();

        // --- Tarea 6: Actualizar el stock de un producto ---
        System.out.println("\n--- Tarea 6: Actualizar stock del producto con ID 'E01' a 25 unidades ---");
        inventario.actualizarStock("E01", 25);
        Producto actualizado = inventario.buscarProductoPorId("E01");
        if(actualizado != null) actualizado.mostrarInfo();


        // --- Tarea 7: Mostrar el total de stock disponible ---
        System.out.println("\n--- Tarea 7: Mostrar total de stock ---");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("El stock total de todos los productos es: " + totalStock + " unidades.");

        // --- Tarea 8: Obtener y mostrar el producto con mayor stock ---
        System.out.println("\n--- Tarea 8: Obtener producto con mayor stock ---");
        Producto conMasStock = inventario.obtenerProductoConMayorStock();
        if (conMasStock != null) {
            System.out.println("El producto con mayor stock es:");
            conMasStock.mostrarInfo();
        } else {
            System.out.println("El inventario está vacío.");
        }

        // --- Tarea 9: Filtrar productos por rango de precio ---
        System.out.println("\n--- Tarea 9: Filtrar productos con precios entre $1000 y $3000 ---");
        inventario.filtrarProductosPorPrecio(1000.00, 3000.00);

        // --- Tarea 10: Mostrar las categorías disponibles ---
        System.out.println("\n--- Tarea 10: Mostrar todas las categorías disponibles ---");
        inventario.mostrarCategoriasDisponibles();
    }
}
