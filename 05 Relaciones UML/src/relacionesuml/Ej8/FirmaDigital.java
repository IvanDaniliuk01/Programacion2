/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej8;

import java.util.Date;
import java.util.UUID;

public class FirmaDigital {
    private String codigoHash;
    private Date fecha;
    private Usuario usuario; // Agregación

    public FirmaDigital(Usuario usuario) {
        this.usuario = usuario;
        this.fecha = new Date(); // Fecha actual
        this.codigoHash = UUID.randomUUID().toString(); // Genera un hash simple
    }
}

