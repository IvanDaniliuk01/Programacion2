/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej1;

import java.util.Date;

public class Pasaporte {
    private String numero;
    private Date fechaEmision;
    private Foto foto; // Relación de Composición
    private Titular titular; // Relación de Asociación

    public Pasaporte(String numero, Date fechaEmision, String datosFoto, String formatoFoto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        // La Foto se crea junto con el Pasaporte
        this.foto = new Foto(datosFoto, formatoFoto); 
        this.titular = titular;
    }

}
