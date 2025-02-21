package POO.Almacen;

public class Ropa extends Producto{;

    private String color;

    public Ropa(String name, int codeBarra, double precio, String color) {
        super(name, codeBarra, precio);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ropa [color=" + color + ", getName()=" + getName() + ", toString()=" + super.toString() + "precio=" + getPrecio() +"]";
    }

    
    
}
