package com.example;

import java.util.UUID;

public abstract class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

//Getters y Setters
    public String getId() {
        return id;
    }

    


    public String getNombre() {
        return nombre;

    }

    


    public double getPrecio() {
        return precio;
    }
   
  
    public int getStock() {
        return stock;

    }

    public void setStock(int stock) {
        this.stock = stock;

    }

    // Método abstracto 
    public abstract String getDetalles();

}
