public abstract class Inmueble {
    private String ubicacion;
    private int metrosCuadrados;
    private double precio;
    private int identificador;

    public Inmueble(String ubicacion, int metrosCuadrados, double precio, int identificador) {
        this.ubicacion = ubicacion;
        this.metrosCuadrados = metrosCuadrados;
        this.precio = precio;
        this.identificador = identificador;
    }

    public String getUbicacion() { return ubicacion; }
    public int getMetrosCuadrados() { return metrosCuadrados; }
    public double getPrecio() { return precio; }
    public int getIdentificador() { return identificador; }

    @Override
    public String toString() {
        return "Inmueble{" +
                "ubicacion='" + ubicacion + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                ", precio=" + precio +
                ", identificador=" + identificador +
                '}';
    }
}
