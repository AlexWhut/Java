package POO.Almacen;

public class Tecnologia extends Producto {

    private int completo;

    public Tecnologia(String name, int codeBarra, double precio) {
        super(name, codeBarra, precio);
    }

    @Override
    public String toString() {
        return "Tecnologia [getName()=" + getName() + ", getCodeBarra()=" + getCodeBarra() + ", getPrecio()="
                + getPrecio() + ", toString()=" + super.toString() + "]";
    }

    

}
