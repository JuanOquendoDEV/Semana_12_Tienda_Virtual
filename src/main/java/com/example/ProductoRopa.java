package com.example;

public class ProductoRopa extends Producto{
    private String talla;

    public ProductoRopa(String nombre, double precio, int stock, String talla) {
        super(nombre, precio, stock);
        this.talla = talla;
    }

    @Override
    public String getDetalles() {
        return "Producto de Ropa: " + getNombre() + ", $: " + getPrecio() + ", Stock: " + getStock() + ", Talla: " + talla;
    }


}
