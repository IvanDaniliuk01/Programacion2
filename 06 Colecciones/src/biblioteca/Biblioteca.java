/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Clase Biblioteca
 * Gestiona una colección de libros. Modela la relación de composición
 * donde una Biblioteca "contiene" Libros.
 */
public class Biblioteca {
    // Atributos de la biblioteca
    private String nombre;
    private List<Libro> libros; // Colección de libros

    /**
     * Constructor para crear una Biblioteca.
     * @param nombre El nombre de la biblioteca.
     */
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    // Getter para el nombre
    public String nombre() { return nombre; }
    
    /**
     * Agrega un nuevo libro a la colección de la biblioteca.
     * @param libro El objeto Libro a agregar.
     */
    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' agregado a la biblioteca '" + this.nombre + "'.");
    }

    /**
     * Muestra en consola la información de todos los libros de la biblioteca.
     */
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca '" + this.nombre + "' no tiene libros.");
            return;
        }
        System.out.println("--- Libros en la Biblioteca: " + this.nombre + " ---");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    /**
     * Busca un libro por su código ISBN.
     * @param isbn El ISBN del libro a buscar.
     * @return El objeto Libro si se encuentra, de lo contrario null.
     */
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Elimina un libro de la colección usando su ISBN.
     * @param isbn El ISBN del libro a eliminar.
     */
    public void eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            System.out.println("Libro '" + libroAEliminar.getTitulo() + "' ha sido eliminado.");
        } else {
            System.out.println("Error: No se encontró un libro con ISBN '" + isbn + "'.");
        }
    }

    /**
     * Devuelve la cantidad total de libros en la biblioteca.
     * @return El número de libros.
     */
    public int obtenerCantidadLibros() {
        return this.libros.size();
    }

    /**
     * Muestra en consola los libros publicados en un año específico.
     * @param anio El año de publicación para filtrar.
     */
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("--- Libros publicados en el año " + anio + " ---");
        boolean encontrados = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron libros publicados en ese año.");
        }
    }

    /**
     * Muestra una lista de todos los autores únicos disponibles en la biblioteca.
     */
    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay autores disponibles ya que no hay libros en la biblioteca.");
            return;
        }
        // Usamos un HashSet para guardar los autores y evitar duplicados automáticamente.
        Set<Autor> autores = new HashSet<>();
        for (Libro libro : libros) {
            autores.add(libro.getAutor());
        }

        System.out.println("--- Autores Disponibles en la Biblioteca ---");
        for (Autor autor : autores) {
            System.out.println("- " + autor.getNombre() + " (" + autor.getNacionalidad() + ")");
        }
    }
}
