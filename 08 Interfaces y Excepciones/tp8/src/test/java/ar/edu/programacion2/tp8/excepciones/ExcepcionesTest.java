package ar.edu.programacion2.tp8.excepciones;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExcepcionesTest {

    @Test
    @DisplayName("DivisionSegura realiza divisiones válidas")
    void divisionSegura() {
        assertEquals(5, DivisionSegura.dividir(10, 2));
        assertThrows(ArithmeticException.class, () -> DivisionSegura.dividir(10, 0));
    }

    @Test
    @DisplayName("ConversionCadenaNumero convierte enteros válidos y lanza NumberFormatException en caso contrario")
    void conversionCadenaNumero() {
        assertEquals(42, ConversionCadenaNumero.convertir("42"));
        assertThrows(NumberFormatException.class, () -> ConversionCadenaNumero.convertir("abc"));
    }

    @Test
    @DisplayName("LecturaArchivo devuelve el contenido esperado o lanza FileNotFoundException")
    void lecturaArchivo() throws Exception {
        String ruta = Path.of("src", "test", "resources", "archivo-demo.txt").toString();
        List<String> lineas = LecturaArchivo.leerArchivo(ruta);
        assertEquals("Primera linea de prueba", lineas.get(0));

        assertThrows(FileNotFoundException.class, () -> LecturaArchivo.leerArchivo("no-existe.txt"));
    }

    @Test
    @DisplayName("ValidadorEdad lanza la excepción personalizada cuando corresponde")
    void validadorEdad() {
        assertDoesNotThrow(() -> ValidadorEdad.validar(30));
        EdadInvalidaException ex = assertThrows(EdadInvalidaException.class, () -> ValidadorEdad.validar(130));
        assertTrue(ex.getMessage().contains("130"));
    }

    @Test
    @DisplayName("LectorTryWithResources obtiene la primera línea de un archivo")
    void lectorTryWithResources() {
        String ruta = Path.of("src", "test", "resources", "archivo-demo.txt").toString();
        assertEquals("Primera linea de prueba", LectorTryWithResources.leerPrimeraLinea(ruta));
    }
}

