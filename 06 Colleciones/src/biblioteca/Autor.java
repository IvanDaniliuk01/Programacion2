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
public class Autor {
    // Atributos privados para encapsular los datos
    private String id;
    private String nombre;
    private String nacionalidad;

    /**
     * Constructor para inicializar un objeto Autor.
     * @param id Identificador único del autor.
     * @param nombre Nombre completo del autor.
     * @param nacionalidad País de origen del autor.
     */
    public Autor(String id, String nombre, String nacionalidad) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id inválido");
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }
    
    public void setNombre(String nombre) { this.nombre = Objects.requireNonNull(nombre); }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = Objects.requireNonNull(nacionalidad); }

    public void mostrarInfo() { System.out.println(this); }

    @Override
    public String toString() {
    return "Autor{" +
    "id='" + id + '\'' +
    ", nombre='" + nombre + '\'' +
    ", nacionalidad='" + nacionalidad + '\'' +
    '}';
    }
}
