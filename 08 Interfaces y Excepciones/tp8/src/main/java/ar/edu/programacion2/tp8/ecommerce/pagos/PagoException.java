package ar.edu.programacion2.tp8.ecommerce.pagos;

/**
 * Excepción checked ligera para comunicar problemas con medios de pago.
 */
public class PagoException extends RuntimeException {

    public PagoException(String message) {
        super(message);
    }
}

