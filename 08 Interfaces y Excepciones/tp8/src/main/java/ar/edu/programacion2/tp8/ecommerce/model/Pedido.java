package ar.edu.programacion2.tp8.ecommerce.model;

import ar.edu.programacion2.tp8.ecommerce.clientes.Cliente;
import ar.edu.programacion2.tp8.ecommerce.contracts.Pagable;
import ar.edu.programacion2.tp8.ecommerce.pagos.Pago;
import ar.edu.programacion2.tp8.ecommerce.pagos.PagoConDescuento;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Representa un pedido de e-commerce compuesto por múltiples productos.
 */
public class Pedido implements Pagable {

    private final List<Producto> productos;
    private PedidoEstado estado;
    private Cliente cliente;

    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = PedidoEstado.CREADO;
    }

    public Pedido(Collection<Producto> productosIniciales) {
        this();
        if (productosIniciales != null) {
            productosIniciales.forEach(this::agregarProducto);
        }
    }

    public Pedido(Cliente cliente) {
        this();
        setCliente(cliente);
    }

    public Pedido(Collection<Producto> productosIniciales, Cliente cliente) {
        this(productosIniciales);
        setCliente(cliente);
    }

    public void agregarProducto(Producto producto) {
        productos.add(Objects.requireNonNull(producto, "El producto no puede ser nulo"));
    }

    public void agregarProductos(Collection<Producto> nuevosProductos) {
        if (nuevosProductos == null || nuevosProductos.isEmpty()) {
            return;
        }
        nuevosProductos.forEach(this::agregarProducto);
    }

    public boolean removerProducto(Producto producto) {
        return productos.remove(producto);
    }

    public List<Producto> getProductos() {
        return Collections.unmodifiableList(productos);
    }

    public boolean estaVacio() {
        return productos.isEmpty();
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public void actualizarEstado(PedidoEstado nuevoEstado) {
        this.estado = Objects.requireNonNull(nuevoEstado, "El estado del pedido no puede ser nulo");
        notificarCliente("Estado del pedido actualizado a " + nuevoEstado.name());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = Objects.requireNonNull(cliente, "El cliente es obligatorio");
    }

    public double pagar(Pago medioPago) {
        Objects.requireNonNull(medioPago, "El medio de pago es obligatorio");
        if (estado != PedidoEstado.CREADO) {
            throw new IllegalStateException("Solo se puede pagar un pedido en estado CREADO");
        }
        if (estaVacio()) {
            throw new IllegalStateException("No se puede pagar un pedido sin productos");
        }

        double monto = calcularTotal();
        if (medioPago instanceof PagoConDescuento pagoConDescuento) {
            monto = pagoConDescuento.aplicarDescuento(monto);
        }
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto final debe ser mayor a cero");
        }

        medioPago.procesarPago(monto);
        actualizarEstado(PedidoEstado.PAGADO);
        return monto;
    }

    private void notificarCliente(String mensaje) {
        if (cliente != null) {
            cliente.notificar(mensaje);
        }
    }

    @Override
    public double calcularTotal() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }
}
