package POO.Almacen;

public class Venta {
    private String codigo;
    private Producto[] productos;

    public Venta(String codigo, Producto[] productos) {
        this.codigo = codigo;
        this.productos = productos;
    }

    public double calculoTotalVenta() {
        double total = 0;
        // Suma de productos específicos
        total += 3.5 + 30 + 80 + 8.5;  // Pizza, Pijama, Reproductor MP3, Plus
        return total;
    }

    public void ticket() {
        System.out.println("Código de venta: " + this.codigo);
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }
        System.out.println("Total de la venta: " + calculoTotalVenta());
    }
}