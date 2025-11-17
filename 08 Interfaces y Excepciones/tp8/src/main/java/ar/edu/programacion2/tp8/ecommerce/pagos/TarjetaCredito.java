package ar.edu.programacion2.tp8.ecommerce.pagos;

/**
 * Implementación de pago con tarjeta con descuento porcentual configurable.
 */
public class TarjetaCredito implements PagoConDescuento {

    private final String numero;
    private final String titular;
    private double limiteDisponible;
    private final double porcentajeDescuento;

    public TarjetaCredito(String numero, String titular, double limiteDisponible, double porcentajeDescuento) {
        this.numero = validarCadena(numero, "El número de tarjeta es obligatorio");
        this.titular = validarCadena(titular, "El titular es obligatorio");
        this.limiteDisponible = validarMonto(limiteDisponible, "El límite disponible debe ser positivo");
        this.porcentajeDescuento = validarPorcentaje(porcentajeDescuento);
    }

    private String validarCadena(String valor, String mensaje) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
        return valor.trim();
    }

    private double validarMonto(double valor, String mensaje) {
        if (Double.isNaN(valor) || Double.isInfinite(valor) || valor <= 0) {
            throw new IllegalArgumentException(mensaje);
        }
        return valor;
    }

    private double validarPorcentaje(double porcentaje) {
        if (Double.isNaN(porcentaje) || porcentaje < 0 || porcentaje > 1) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 1");
        }
        return porcentaje;
    }

    @Override
    public double aplicarDescuento(double monto) {
        validarMonto(monto, "El monto a descontar debe ser positivo");
        double descuento = monto * porcentajeDescuento;
        double resultado = monto - descuento;
        return Math.max(resultado, 0);
    }

    @Override
    public void procesarPago(double monto) {
        validarMonto(monto, "El monto a cobrar debe ser positivo");
        if (monto > limiteDisponible) {
            throw new PagoException("La tarjeta no posee saldo disponible");
        }
        limiteDisponible -= monto;
    }

    public double getLimiteDisponible() {
        return limiteDisponible;
    }
}

