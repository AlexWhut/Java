public class LocalComercial extends Construccion {
    private double precioPorMetroCuadrado;

    public LocalComercial(String ubicacion, int metrosCuadrados, double precioPorMetroCuadrado, int identificador, boolean esNueva) {
        super(ubicacion, metrosCuadrados, precioPorMetroCuadrado * metrosCuadrados, identificador, esNueva);
        this.precioPorMetroCuadrado = precioPorMetroCuadrado;
    }

    public double getPrecioPorMetroCuadrado() {
        return precioPorMetroCuadrado;
    }

    @Override
    public String toString() {
        return super.toString() + ", precioPorMetroCuadrado=" + precioPorMetroCuadrado;
    }
}
