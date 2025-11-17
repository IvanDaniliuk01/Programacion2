package ar.edu.programacion2.tp8.excepciones;

/**
 * Encapsula la lógica de validación de edades.
 */
public final class ValidadorEdad {

    private ValidadorEdad() {
    }

    public static void validar(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad " + edad + " está fuera del rango permitido");
        }
    }
}

