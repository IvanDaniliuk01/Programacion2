package ar.edu.programacion2.tp8.ecommerce.pagos;

/**
 * Implementación simple de pagos con PayPal que ofrece cashback.
 */
public class PayPal implements PagoConDescuento {

    private final String email;
    private double saldoDisponible;
    private final double porcentajeCashback;

    public PayPal(String email, double saldoDisponible, double porcentajeCashback) {
        this.email = validarCadena(email, "El correo es obligatorio");
        this.saldoDisponible = validarMonto(saldoDisponible, "El saldo disponible debe ser positivo");
        this.porcentajeCashback = validarPorcentaje(porcentajeCashback);
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
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 1");
        }
        return porcentaje;
    }

    @Override
    public double aplicarDescuento(double monto) {
        validarMonto(monto, "El monto del pedido debe ser positivo");
        double descuento = monto * porcentajeCashback;
        return Math.max(monto - descuento, 0);
    }

    @Override
    public void procesarPago(double monto) {
        validarMonto(monto, "El monto a debitar debe ser positivo");
        if (monto > saldoDisponible) {
            throw new PagoException("Saldo insuficiente en PayPal");
        }
        saldoDisponible -= monto;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }
}

