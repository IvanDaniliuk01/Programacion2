/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej10;

import java.util.Date;
import java.util.Random;

public class ClaveSeguridad {
    private String codigo;
    private Date ultimaModificacion;

    public ClaveSeguridad() {
        this.codigo = generarCodigo();
        this.ultimaModificacion = new Date();
    }

    private String generarCodigo() {
        // Simula la creación de un código de seguridad
        return String.valueOf(new Random().nextInt(9000) + 1000);
    }
}
