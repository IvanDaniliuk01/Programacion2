/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.Objects;

/**
 *
 * @author idani
 */
public class Libro {
    // Atributos privados del libro
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // Relación: Un libro tiene un Autor

    /**
     * Constructor para inicializar un objeto Libro.
     * @param isbn Identificador único del libro (ISBN).
     * @param titulo Título del libro.
     * @param anioPublicacion Año en que fue publicado.
     * @param autor Objeto Autor que escribió el libro.
     */
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }
    
    public void setTitulo(String titulo) { this.titulo = Objects.requireNonNull(titulo); }
    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion; }
    public void setAutor(Autor autor) { this.autor = Objects.requireNonNull(autor); }

    /**
     * Muestra la información completa del libro, incluyendo los datos de su autor.
     */
    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    /**
     * Sobrescribe el método toString para una representación textual del objeto Libro.
     * @return Una cadena con todos los detalles del libro y su autor.
     */
    @Override
    public String toString() {
        return "Libro {" +
                "ISBN: '" + isbn + '\'' +
                ", Título: '" + titulo + '\'' +
                ", Año de Publicación: " + anioPublicacion +
                ", Autor: '" + autor.getNombre() + "'" +
                '}';
    }
}
