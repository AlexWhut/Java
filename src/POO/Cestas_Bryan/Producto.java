package POO.Cestas_Bryan;

public class Producto implements Comparable<Producto> {

    private int code;
    private String name;
    private double precio;
    private boolean gluten;

    // Constructor, donde 0 es sin gluten (false) y 1 es con gluten (true)
    Producto(int code, String name, double precio, int gluten) {
        this.code = code;
        this.name = name;
        this.precio = precio;
        this.gluten = gluten == 1; // 1 es con gluten (true), 0 es sin gluten (false)
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        // Ordenar por precio de menor a mayor
        return Double.compare(this.precio, otroProducto.precio);
    }

    @Override
    public String toString() {
        return "Código: " + code + ", Nombre: " + name + ", Precio: " + precio + " euros, " + (gluten ? "Con gluten" : "Sin gluten");
    }


}
