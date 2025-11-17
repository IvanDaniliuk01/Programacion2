package ar.edu.programacion2.tp8.ecommerce.pagos;

/**
 * Contrato base para procesadores de pago.
 */
@FunctionalInterface
public interface Pago {

    /**
     * Procesa un pago por el monto indicado.
     *
     * @param monto monto a debitar
     * @throws PagoException si el pago no puede completarse
     */
    void procesarPago(double monto);
}

