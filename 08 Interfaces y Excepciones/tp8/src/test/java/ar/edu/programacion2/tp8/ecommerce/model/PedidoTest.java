package ar.edu.programacion2.tp8.ecommerce.model;

import ar.edu.programacion2.tp8.ecommerce.clientes.Cliente;
import ar.edu.programacion2.tp8.ecommerce.pagos.PayPal;
import ar.edu.programacion2.tp8.ecommerce.pagos.TarjetaCredito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PedidoTest {

    @Test
    @DisplayName("calcularTotal suma los precios de todos los productos")
    void calcularTotal() {
        Producto libro = new Producto("Libro", 12000.50);
        Producto mouse = new Producto("Mouse", 5000);
        Pedido pedido = new Pedido(List.of(libro, mouse));

        assertEquals(17000.50, pedido.calcularTotal(), 0.0001);
    }

    @Test
    @DisplayName("agregarProducto no admite nulos")
    void agregarProductoNulo() {
        Pedido pedido = new Pedido();

        assertThrows(NullPointerException.class, () -> pedido.agregarProducto(null));
    }

    @Test
    @DisplayName("removerProducto elimina ocurrencias existentes")
    void removerProducto() {
        Producto teclado = new Producto("Teclado", 15000);
        Pedido pedido = new Pedido();
        pedido.agregarProducto(teclado);

        assertTrue(pedido.removerProducto(teclado));
        assertTrue(pedido.estaVacio());
    }

    @Test
    @DisplayName("El estado inicial es CREADO y se puede actualizar")
    void actualizarEstado() {
        Pedido pedido = new Pedido();
        assertEquals(PedidoEstado.CREADO, pedido.getEstado());

        pedido.actualizarEstado(PedidoEstado.PAGADO);
        assertEquals(PedidoEstado.PAGADO, pedido.getEstado());
    }

    @Test
    @DisplayName("Producto no permite nombre vacío ni precio negativo")
    void productoValidaciones() {
        assertThrows(IllegalArgumentException.class, () -> new Producto(" ", 100));
        assertThrows(IllegalArgumentException.class, () -> new Producto("Libro", -1));
    }

    @Test
    @DisplayName("Pagar con tarjeta aplica descuento y cambia el estado")
    void pagarConTarjeta() {
        Cliente cliente = new Cliente("Ana", "ana@example.com");
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Notebook", 200000));

        TarjetaCredito tarjeta = new TarjetaCredito("1234", "Ana", 500000, 0.10);
        double montoCobrado = pedido.pagar(tarjeta);

        assertEquals(180000, montoCobrado, 0.01);
        assertEquals(PedidoEstado.PAGADO, pedido.getEstado());
        assertTrue(tarjeta.getLimiteDisponible() < 500000);
    }

    @Test
    @DisplayName("Intentar pagar un pedido vacío lanza excepción")
    void pagarPedidoVacio() {
        Pedido pedido = new Pedido();
        assertThrows(IllegalStateException.class, () -> pedido.pagar(new PayPal("test@example.com", 1000, 0)));
    }

    @Test
    @DisplayName("El cliente recibe notificaciones cuando cambia el estado")
    void notificacionesAlCliente() {
        Cliente cliente = new Cliente("Carlos", "carlos@example.com");
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Libro", 5000));

        pedido.actualizarEstado(PedidoEstado.ENVIADO);

        assertFalse(cliente.getNotificacionesRecibidas().isEmpty());
        String ultimoMensaje = cliente.getNotificacionesRecibidas()
                .get(cliente.getNotificacionesRecibidas().size() - 1);
        assertTrue(ultimoMensaje.contains("ENVIADO"));
    }
}
