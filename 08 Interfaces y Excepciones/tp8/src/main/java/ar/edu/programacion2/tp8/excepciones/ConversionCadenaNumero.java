package ar.edu.programacion2.tp8.excepciones;

/**
 * Convierte cadenas a números enteros mostrando mensajes claros ante errores.
 */
public final class ConversionCadenaNumero {

    private ConversionCadenaNumero() {
    }

    public static int convertir(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto a convertir no puede ser nulo");
        }
        try {
            return Integer.parseInt(texto.trim());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("No se pudo convertir '" + texto + "' a entero");
        }
    }
}

