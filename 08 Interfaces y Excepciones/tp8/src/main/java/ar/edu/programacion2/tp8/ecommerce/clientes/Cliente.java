package ar.edu.programacion2.tp8.ecommerce.clientes;

import ar.edu.programacion2.tp8.ecommerce.notificaciones.Notificable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Representa a un cliente capaz de recibir notificaciones.
 */
public class Cliente implements Notificable {

    private final String nombre;
    private final String email;
    private final List<String> notificacionesRecibidas = new ArrayList<>();

    public Cliente(String nombre, String email) {
        this.nombre = validarCadena(nombre, "El nombre del cliente es obligatorio");
        this.email = validarCadena(email, "El email del cliente es obligatorio");
    }

    private String validarCadena(String valor, String mensaje) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
        return valor.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void notificar(String mensaje) {
        notificacionesRecibidas.add(Objects.requireNonNull(mensaje, "El mensaje no puede ser nulo"));
    }

    public List<String> getNotificacionesRecibidas() {
        return Collections.unmodifiableList(notificacionesRecibidas);
    }
}

