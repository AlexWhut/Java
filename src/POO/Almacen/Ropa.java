package POO.Almacen;

public class Ropa extends Producto {
    private String material;

    public Ropa(String nombre, float precio, String codigo, String material) {
        super(nombre, precio, codigo);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
