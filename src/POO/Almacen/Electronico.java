package POO.Almacen;

class Electronico extends Producto {
    private int garantia; // años de garantía

    public Electronico(String nombre, float precio, String codigo, int garantia) {
        super(nombre, precio, codigo);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }
}