package com.example;

public class Usuario {
    private String nombre;
    private String email;
    private CarritoCompra carrito;

public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.carrito = new CarritoCompra();

}
    
        public String getNombre() {
            return nombre;
        }
    
        public String getEmail() {
            return email;
        }
    
        public CarritoCompra getCarrito() {
            return carrito;
        }
    
    }

