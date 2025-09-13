/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej13;

public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario) {
        System.out.println("Generando código QR para: " + usuario.getNombre());
        return new CodigoQR(valor, usuario);
    }
}
