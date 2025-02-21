package POO.Almacen;
import java.util.ArrayList;

public class Venta  {

    private int codeVenta;
    private ArrayList<Producto> prodVendidos = new ArrayList<>();

    public void addProducto(Producto p){
        prodVendidos.add(p);
    }

    @Override
    public String toString() {
        return "Venta [codeVenta=" + codeVenta + ", prodVendidos=" + prodVendidos + ", toString()=" + super.toString()
                + "]";
    }

    // bucle para mostrar las ventas
    public void mostrarVenta(){
        for(Producto p : prodVendidos){
            p.toString();
        }
    }

}
