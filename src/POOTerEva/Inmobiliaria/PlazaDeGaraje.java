public class PlazaDeGaraje extends Superficie {
    private boolean esPublico;

    public PlazaDeGaraje(String ubicacion, int metrosCuadrados, double precioPorMetroCuadrado, int identificador, boolean esPublico) {
        super(ubicacion, metrosCuadrados, precioPorMetroCuadrado, identificador);
        this.esPublico = esPublico;
    }

    public boolean isEsPublico() {
        return esPublico;
    }

    @Override
    public String toString() {
        return super.toString() + ", esPublico=" + esPublico;
    }
}
