/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej4;

import java.util.Date;

public class TarjetaDeCredito {
    private String numero;
    private Date fechaVencimiento;
    private Cliente cliente; // Asociación
    private Banco banco; // Agregación

    public TarjetaDeCredito(String numero, Date fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
    }
}
