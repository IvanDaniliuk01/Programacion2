/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej9;

import java.util.Date;
import java.sql.Time;

public class CitaMedica {
    private Date fecha;
    private Time hora;
    private Paciente paciente; // Asociación
    private Profesional profesional; // Asociación

    public CitaMedica(Date fecha, Time hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
}
