public class TiendaJuegos {
    public static void main(String[] args) {
        // Crear algunos juegos
        Juego juego1 = new Juego("Minecraft", 29.99);
        Juego juego2 = new Juego("FIFA 24", 59.99);
        Juego juego3 = new Juego("GTA V", 39.99);

        // Crear un carrito de compras
        CarritoCompras carrito = new CarritoCompras();

        // Agregar juegos al carrito
        carrito.agregarJuego(juego1);
        carrito.agregarJuego(juego2);

        // Mostrar el contenido del carrito
        carrito.mostrarCarrito();
    }
}
