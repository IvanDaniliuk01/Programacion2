package ar.edu.programacion2.tp8.ecommerce.contracts;

/**
 * Representa cualquier entidad cuyo costo puede calcularse.
 */
@FunctionalInterface
public interface Pagable {

    /**
     * Calcula el monto total asociado a la entidad.
     *
     * @return monto total
     */
    double calcularTotal();
}

