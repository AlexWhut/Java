package POO.Cestas_Bryan;
import java.util.ArrayList;
import java.util.Collections;

public class Cesta {
    
    private String name;
    private ArrayList<Producto> productos;

    public Cesta(String name) {
        this.name = name;
        this.productos = new ArrayList<>();
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
        Collections.sort(productos); // Ahora funciona correctamente
    }

    public void mostrarProductos() {
        System.out.println("Cesta: " + name);
        for (Producto p : productos) {
            System.out.println(p.getName() + " - " + p.getPrecio() + "€ - " + (p.isGluten() ? "Con gluten" : "Sin gluten"));
        }
    }
}
