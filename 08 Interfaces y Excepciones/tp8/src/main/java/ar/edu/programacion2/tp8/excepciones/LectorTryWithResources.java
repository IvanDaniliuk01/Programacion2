package ar.edu.programacion2.tp8.excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Ejemplo de uso de try-with-resources para asegurar el cierre de recursos.
 */
public final class LectorTryWithResources {

    private LectorTryWithResources() {
    }

    public static String leerPrimeraLinea(String ruta) {
        Path path = Path.of(ruta);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            return reader.readLine();
        } catch (IOException e) {
            throw new UncheckedIOException("Error al leer el archivo " + ruta, e);
        }
    }
}

