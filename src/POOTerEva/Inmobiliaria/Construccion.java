public abstract class Construccion extends Inmueble {
    private boolean esNueva;

    public Construccion(String ubicacion, int metrosCuadrados, double precio, int identificador, boolean esNueva) {
        super(ubicacion, metrosCuadrados, precio, identificador);
        this.esNueva = esNueva;
    }

    public boolean isEsNueva() {
        return esNueva;
    }

    @Override
    public String toString() {
        return super.toString() + ", esNueva=" + esNueva;
    }
}
