package POO.Almacen;

public class Producto {
    
    private String name;
    private long codeBarra;
    private double precio;

    public Producto(String name, long codeBarra, double precio) {
        this.name = name;
        this.codeBarra = codeBarra;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCodeBarra() {
        return codeBarra;
    }

    public void setCodeBarra(long codeBarra) {
        this.codeBarra = codeBarra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [name=" + name + ", codeBarra=" + codeBarra + ", precio=" + precio + "]";
    } 
}
