package POO.Almacen;

public class Alimentacion extends Producto {
    private int diaCaducidad;
    private int mesCaducidad;
    private int horaCaducidad;

    public Alimentacion(String nombre, float precio, String codigo, int diaCaducidad, int mesCaducidad, int horaCaducidad) {
        super(nombre, precio, codigo);
        this.diaCaducidad = diaCaducidad;
        this.mesCaducidad = mesCaducidad;
        this.horaCaducidad = horaCaducidad;
    }

    public String getFechaCaducidad() {
        return diaCaducidad + "/" + mesCaducidad + " a las " + horaCaducidad + " horas";
    }
}
