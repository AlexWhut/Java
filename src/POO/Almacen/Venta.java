package POO.Almacen;
import java.util.ArrayList;

public class Venta  {

    private static int contadorVentas = 1;
    private int codeVenta;
    private ArrayList<Producto> prodVendidos;

    public Venta() {
        this.codeVenta = contadorVentas++;
        this.prodVendidos = new ArrayList<>();
    }

    public void addProducto(Producto p) {
        prodVendidos.add(p);
    }

    @Override
    public String toString() {
        return "Venta [codeVenta=" + codeVenta + ", productos vendidos=" + prodVendidos + "]";
    }

    public void mostrarVenta() {
        System.out.println("Venta #" + codeVenta);
        for (Producto p : prodVendidos) {
            System.out.println(p);
        }
    }
}
