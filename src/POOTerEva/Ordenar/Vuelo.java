package POOTerEva.Ordenar;

import java.time.LocalTime;

public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private LocalTime salida;
    private int duracion;

    public Vuelo(String numero, String origen, String destino, LocalTime salida, int duracion) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.salida = salida;
        this.duracion = duracion;
    }

    public String getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalTime getSalida() {
        return salida;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "numero='" + numero + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", salida=" + salida +
                ", duracion=" + duracion + " min" +
                '}';
    }
}

