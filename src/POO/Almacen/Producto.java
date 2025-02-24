package POO.Almacen;

public class Producto {
    private String nombre;
    private float precio;
    private String codigo;

    public Producto(String nombre, float precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }
}