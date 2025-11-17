package ar.edu.programacion2.tp8.excepciones;

/**
 * Utilidad para realizar divisiones controladas.
 */
public final class DivisionSegura {

    private DivisionSegura() {
    }

    public static double dividir(double dividendo, double divisor) {
        if (Double.compare(divisor, 0d) == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return dividendo / divisor;
    }
}

