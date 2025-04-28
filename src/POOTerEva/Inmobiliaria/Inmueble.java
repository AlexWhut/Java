public class Inmueble {

    private String ubicacion;
    private int metrosCuadrados;
    private int precio;
    private int identificador;

    public Inmueble(String ubicacion, int metrosCuadrados, int precio, int identificador){
        this.ubicacion = ubicacion;
        this.metrosCuadrados = metrosCuadrados;
        this.precio = precio;
        this.identificador = identificador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Inmueble [ubicacion=" + ubicacion + ", metrosCuadrados=" + metrosCuadrados + ", precio=" + precio
                + ", identificador=" + identificador + "]";
    }

    
}
