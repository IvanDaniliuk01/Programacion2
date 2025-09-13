/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej6;

import java.util.Date;
import java.sql.Time;

public class Reserva {
    private Date fecha;
    private Time hora;
    private Cliente cliente; // Asociación
    private Mesa mesa;       // Agregación

    public Reserva(Date fecha, Time hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
}