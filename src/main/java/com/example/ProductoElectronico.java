package com.example;

public class ProductoElectronico extends Producto {

private int garantiaMeses;


public ProductoElectronico( String nombre, double precio, int stock, int garantiaMeses) {
    super(nombre, precio, stock);
    this.garantiaMeses = garantiaMeses;



}

@Override
public String getDetalles() {
    return "Producto Electrónico: " + getNombre() + ", $: " + getPrecio() + ", Stock: " + getStock() + ", Garantía: " + garantiaMeses + " meses";

}

}
