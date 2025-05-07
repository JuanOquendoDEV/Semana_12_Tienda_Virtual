# Actividad Evaulativa Semana 12

Saludos profesor jhon valencia este es mi trabajo realizado para la semana 12 propuesta 

Muchas Gracias 


## Como transcurre el codigo de la tienda virtual

Este codigo simula una tienda virtual en java usando progracion orientada a objetos esta divido por varias clases cada una de ellas cumpliendo un rol en especifico en estas se asocian lo aprendido durante este semestre 2 (Encapsulamiento, herencia, poliformismo, abstraccion, interfaces y manejo de excepciones

1. Excepcion personalizada (TiendaException): Es una excepcion personalizada que se usa ppara manejar errores especificos de la tienda (Como intentar agregar productos sin stock al carrito)

2. Interfaz **Metodo De Pago** : Define dos metodos - procesarPago(double monto) y - obtenerDetalles() Retorna detalles del metodo de pago (Por ejemplo, ultimos 4 digitos de una tarjeta)

3. Clase Abstracta **Producto** : Es la base para todos los productos de la tienda. Tiene los siguientes atributos: ID (Identificador unico) Nombre (Nombre del producto) Precio (Precio del producto) Stock (Cantidad disponible) Declara un metodo abstracto getDetalles() que debe ser implementado por las subclases.

4. Clases Derivadas De Producto : - Producto Electronico: Representa productos electronicos con garantia (En meses) - ProductosRopa: Representa productos de ropa con talla

5. Clase PagoTarjeta (Metodo de pago) : Implementa la interfaz **MetodoPago** Simula un pago usando tarjeta de credito, mostrando los ultimos 4 digitos de la tarjeta 

6. Clase CarritoCompra : Administra los productos que un usuario desea comprar, Metodos Claves - agregarProductos(Producto): Añade productos al carrito, validando que haya stock - calcularTotal(): Calcula el total del carrito sumando los precios - getProductos(): Retorna una copia de la lista de productos 

7. Clase Usuario : Representa un clienta en la tienda tiene: Nombre, Email y carritoCompra para gestionar su lista de productos 

8. Clase TiendaVirtual : Gestiona toda la tienda - Inventario - Usuarios y metodos claves: agregarProducto() Añande productos a el inventario, registrarUsuario() Registra nuevos usuarios, mostrarInventario() Muestra todos los productos del inventario, realizarCompra() Procesa la compra de un usuario usando un metodo del pago

9. Clase Main : Este es el punto de entrada simula el funcionamiento de la tienda = Crea una tienda virtual, Agrega productos al inventario, Registra un usuario, muestra el inventario, el usuario agrega productos a su carrito, procesa el pago usando una tarjeta y muestra el inventario actualizado   
