/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej2;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Relación de Agregación
    private Usuario usuario; // Relación de Asociación

    // La batería se recibe como parámetro, no se crea aquí
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
}
