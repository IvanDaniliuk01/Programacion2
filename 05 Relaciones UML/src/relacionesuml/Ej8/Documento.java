/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej8;

import java.util.Date;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición

    public Documento(String titulo, String contenido, Usuario usuarioFirma) {
        this.titulo = titulo;
        this.contenido = contenido;
        // La firma se crea junto con el documento
        this.firma = new FirmaDigital(usuarioFirma);
    }
}
