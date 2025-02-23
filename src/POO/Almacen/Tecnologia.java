package POO.Almacen;

public class Tecnologia extends Producto {

    public Tecnologia(String name, long codeBarra, double precio) {
        super(name, codeBarra, precio);
    }

    @Override
    public String toString() {
        return "Tecnologia [name=" + getName() + ", codeBarra=" + getCodeBarra() + ", precio=" + getPrecio() + "]";
    }
}
