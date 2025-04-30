public class Solar extends Superficie {
    private boolean esRustico;

    public Solar(String ubicacion, int metrosCuadrados, double precioPorMetroCuadrado, int identificador, boolean esRustico) {
        super(ubicacion, metrosCuadrados, precioPorMetroCuadrado, identificador);
        this.esRustico = esRustico;
    }

    public boolean isEsRustico() {
        return esRustico;
    }

    @Override
    public String toString() {
        return super.toString() + ", esRustico=" + esRustico;
    }
}
