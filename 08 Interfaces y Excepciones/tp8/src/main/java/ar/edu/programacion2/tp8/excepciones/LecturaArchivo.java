package ar.edu.programacion2.tp8.excepciones;

import java.io.FileNotFoundException;
import java.io.UncheckedIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;

/**
 * Utilidad para leer archivos de texto controlando excepciones.
 */
public final class LecturaArchivo {

    private LecturaArchivo() {
    }

    public static List<String> leerArchivo(String ruta) throws FileNotFoundException {
        try {
            return Files.readAllLines(Path.of(ruta));
        } catch (NoSuchFileException e) {
            FileNotFoundException notFound = new FileNotFoundException("El archivo no existe: " + ruta);
            notFound.initCause(e);
            throw notFound;
        } catch (IOException e) {
            throw new UncheckedIOException("Error leyendo el archivo " + ruta, e);
        }
    }
}

