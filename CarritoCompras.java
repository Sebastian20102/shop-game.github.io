import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<Juego> juegosEnCarrito;

    public CarritoCompras() {
        this.juegosEnCarrito = new ArrayList<>();
    }

    public void agregarJuego(Juego juego) {
        juegosEnCarrito.add(juego);
        System.out.println("Juego agregado al carrito: " + juego.getNombre());
    }

    public void mostrarCarrito() {
        if (juegosEnCarrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Juegos en el carrito:");
            for (Juego juego : juegosEnCarrito) {
                System.out.println("- " + juego);
            }
        }
    }
}
