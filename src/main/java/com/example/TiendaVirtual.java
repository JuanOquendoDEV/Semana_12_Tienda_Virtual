package com.example;

import java.util.ArrayList;
import java.util.List;

class TiendaVirtual {

    private List<Producto> inventario;
    private List<Usuario> usuarios;

    public TiendaVirtual() {
        this.inventario = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarCompra(Usuario usuario, MetodoPago metodoPago) throws TiendaException {
        if (usuario.getCarrito().getProductos().isEmpty()) {
            throw new TiendaException("El carrito está vacío.");
        }

        double total = usuario.getCarrito().calcularTotal();
        if (metodoPago.procesarPago(total)) {
            usuario.getCarrito().getProductos().clear();
            System.out.println("Compra realizada por $" + total);
        } else {
            throw new TiendaException("Error al procesar el pago.");
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (Producto producto : inventario) {
            System.out.println(producto.getDetalles());
        }
    }
}
