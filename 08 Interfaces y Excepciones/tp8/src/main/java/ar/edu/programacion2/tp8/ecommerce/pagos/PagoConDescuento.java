package ar.edu.programacion2.tp8.ecommerce.pagos;

/**
 * Extiende la capacidad de pago permitiendo aplicar descuentos previos al cobro.
 */
public interface PagoConDescuento extends Pago {

    /**
     * Calcula el monto final luego de aplicar un descuento al valor base.
     *
     * @param monto monto original
     * @return monto luego del descuento
     */
    double aplicarDescuento(double monto);
}

