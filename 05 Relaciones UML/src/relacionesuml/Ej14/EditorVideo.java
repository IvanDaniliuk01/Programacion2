/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml.Ej14;

public class EditorVideo {
    // El método "exportar" crea y devuelve un objeto Render,
    // pero la clase EditorVideo no lo almacena como un atributo.
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Exportando el proyecto '" + proyecto.getNombre() + "' al formato " + formato);
        // Aquí se crea la instancia de Render
        return new Render(formato, proyecto);
    }
}
