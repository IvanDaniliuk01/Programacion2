/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionapoo;

public class Libro {
    // Atributos privados para aplicar encapsulamiento
    private String titulo;
    private String autor;
    private int anioPublicacion;

    /**
     * Constructor para inicializar un objeto Libro.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param anioPublicacion El año de publicación.
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        // Usamos el setter para asegurar que el año inicial sea válido
        setAnioPublicacion(anioPublicacion);
    }

    // --- Getters (Métodos de acceso) ---

    /**
     * Devuelve el título del libro.
     * @return El título.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve el autor del libro.
     * @return El autor.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Devuelve el año de publicación del libro.
     * @return El año de publicación.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // --- Setter (Método de modificación) con validación ---

    /**
     * Establece el año de publicación con validación.
     * No permite años futuros (mayores a 2025) o negativos.
     * @param anioPublicacion El nuevo año de publicación.
     */
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 2025 || anioPublicacion < 0) {
            System.out.println("Error: El año de publicación '" + anioPublicacion + "' no es válido.");
        } else {
            this.anioPublicacion = anioPublicacion;
            System.out.println("Año de publicación actualizado a " + anioPublicacion + ".");
        }
    }

    /**
     * Muestra la información completa del libro.
     */
    public void mostrarInfo() {
        System.out.println("Información del Libro:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año de Publicación: " + getAnioPublicacion());
    }
}
