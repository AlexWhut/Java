package POOTerEva.InterfaceAtleta;

public class Atleta implements Comparable<Atleta> {
    private String nombre;
    private double tiempo; // en segundos
    private int edad;

    public Atleta(String nombre, double tiempo, int edad) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTiempo() {
        return tiempo;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Atleta otro) {
        // Orden por tiempo de forma ascendente
        return Double.compare(this.tiempo, otro.tiempo);
    }

    @Override
    public String toString() {
        return nombre + " - " + tiempo + " segundos - " + edad + " años";
    }
}
