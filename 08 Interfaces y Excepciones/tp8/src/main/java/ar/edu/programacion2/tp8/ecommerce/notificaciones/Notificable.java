package ar.edu.programacion2.tp8.ecommerce.notificaciones;

@FunctionalInterface
public interface Notificable {

    /**
     * Recibe un mensaje de notificación.
     *
     * @param mensaje detalle del evento
     */
    void notificar(String mensaje);
}

