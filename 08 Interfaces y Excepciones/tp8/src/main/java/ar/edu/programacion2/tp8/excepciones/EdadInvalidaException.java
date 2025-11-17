package ar.edu.programacion2.tp8.excepciones;

/**
 * Excepción checked para edades fuera del rango permitido.
 */
public class EdadInvalidaException extends Exception {

    public EdadInvalidaException(String message) {
        super(message);
    }
}

