package POO.Cestas_Bryan;

public class Producto {

    int code;
    String name;
    double precio;
    boolean gluten;

    // Constructor, donde 0 es sin gluten (false) y 1 es con gluten (true)
    Producto(int code, String name, double precio, int gluten) {
        this.code = code;
        this.name = name;
        this.precio = precio;
        this.gluten = gluten == 1; // 1 es con gluten (true), 0 es sin gluten (false)
    }

    public String toString() {
        return "Código: " + code + ", Nombre: " + name + ", Precio: " + precio + " euros, " + (gluten ? "Con gluten" : "Sin gluten");
    }

    Producto jamonS = new Producto(1, "Jamón serrano", 40, 0); // 0 es sin gluten
    Producto lataF = new Producto(2, "Lata de foie gras", 10, 1); // 1 es con gluten
    Producto turronA = new Producto(3, "Turrón de almendras", 5, 1); // 1 es con gluten
    Producto cajaM = new Producto(4, "Caja de mazapán", 8, 1); // 1 es con gluten
    Producto botellaSidra = new Producto(5, "Botella de sidra", 8, 0); // 0 es sin gluten
    Producto botellaCava = new Producto(6, "Botella de cava", 15, 0); // 0 es sin gluten


}
