/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

public class Main {
    public static void main(String[] args) {
        // --- Tarea 1: Creamos una biblioteca ---
        System.out.println("--- Tarea 1: Creando la biblioteca ---");
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("Se ha creado la biblioteca '" + miBiblioteca.nombre() + "'.");

        // --- Tarea 2: Crear al menos tres autores ---
        System.out.println("\n--- Tarea 2: Creando autores ---");
        Autor autor1 = new Autor("A01", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A02", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A03", "Jorge Luis Borges", "Argentino");
        System.out.println("Autores creados.");

        // --- Tarea 3: Agregar 5 libros asociados a los autores ---
        System.out.println("\n--- Tarea 3: Agregando libros a la biblioteca ---");
        miBiblioteca.agregarLibro(new Libro("978-0307350444", "Cien años de soledad", 1967, autor1));
        miBiblioteca.agregarLibro(new Libro("978-0061122415", "La casa de los espíritus", 1982, autor2));
        miBiblioteca.agregarLibro(new Libro("978-0802144510", "Ficciones", 1944, autor3));
        miBiblioteca.agregarLibro(new Libro("978-8497592208", "El amor en los tiempos del cólera", 1985, autor1));
        miBiblioteca.agregarLibro(new Libro("978-0307475411", "Eva Luna", 1987, autor2));

        // --- Tarea 4: Listar todos los libros ---
        System.out.println("\n--- Tarea 4: Listado completo de libros ---");
        miBiblioteca.listarLibros();

        // --- Tarea 5: Buscar un libro por su ISBN ---
        System.out.println("\n--- Tarea 5: Buscando libro con ISBN '978-0802144510' ---");
        Libro libroBuscado = miBiblioteca.buscarLibroPorIsbn("978-0802144510");
        if (libroBuscado != null) {
            System.out.println("Libro encontrado:");
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("El libro no fue encontrado.");
        }

        // --- Tarea 6: Filtrar libros por año de publicación ---
        System.out.println("\n--- Tarea 6: Filtrando libros publicados en 1987 ---");
        miBiblioteca.filtrarLibrosPorAnio(1987);

        // --- Tarea 7: Eliminar un libro por su ISBN y listar los restantes ---
        System.out.println("\n--- Tarea 7: Eliminando libro con ISBN '978-8497592208' ---");
        miBiblioteca.eliminarLibro("978-8497592208");
        System.out.println("Listado de libros restantes:");
        miBiblioteca.listarLibros();

        // --- Tarea 8: Mostrar la cantidad total de libros ---
        System.out.println("\n--- Tarea 8: Cantidad total de libros ---");
        System.out.println("La biblioteca tiene un total de " + miBiblioteca.obtenerCantidadLibros() + " libros.");

        // --- Tarea 9: Listar todos los autores disponibles ---
        System.out.println("\n--- Tarea 9: Mostrando autores disponibles ---");
        miBiblioteca.mostrarAutoresDisponibles();
    }
}
