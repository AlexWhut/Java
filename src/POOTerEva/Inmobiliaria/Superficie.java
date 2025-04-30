public abstract class Superficie extends Inmueble {
    private double precioPorMetroCuadrado;

    public Superficie(String ubicacion, int metrosCuadrados, double precioPorMetroCuadrado, int identificador) {
        super(ubicacion, metrosCuadrados, precioPorMetroCuadrado * metrosCuadrados, identificador);
        this.precioPorMetroCuadrado = precioPorMetroCuadrado;
    }

    public double getPrecioPorMetroCuadrado() {
        return precioPorMetroCuadrado;
    }

    public double precio() {
        return getMetrosCuadrados() * precioPorMetroCuadrado;
    }

    @Override
    public String toString() {
        return super.toString() + ", precioPorMetroCuadrado=" + precioPorMetroCuadrado;
    }
}
