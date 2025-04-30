public class Vivienda extends Construccion {
    private double precioVenta;
    private double precioAlquiler;
    private int numeroHabitaciones;
    private int piso;

    public Vivienda(String ubicacion, int metrosCuadrados, double precioVenta, double precioAlquiler, int identificador, boolean esNueva, int numeroHabitaciones, int piso) {
        super(ubicacion, metrosCuadrados, precioVenta, identificador, esNueva);
        this.precioVenta = precioVenta;
        this.precioAlquiler = precioAlquiler;
        this.numeroHabitaciones = numeroHabitaciones;
        this.piso = piso;
    }

    public double getPrecioVenta() { return precioVenta; }
    public double getPrecioAlquiler() { return precioAlquiler; }
    public int getNumeroHabitaciones() { return numeroHabitaciones; }

    @Override
    public String toString() {
        return super.toString() + ", precioVenta=" + precioVenta +
               ", precioAlquiler=" + precioAlquiler +
               ", numeroHabitaciones=" + numeroHabitaciones +
               ", piso=" + piso;
    }
}
