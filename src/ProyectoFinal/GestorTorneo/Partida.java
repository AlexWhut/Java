package ProyectoFinal.GestorTorneo;

import java.io.Serializable;
import java.time.LocalDate;

public class Partida implements Serializable {
    
    private Equipo equipoA;
    private Equipo equipoB;
    private int marcadorA;
    private int marcadorB;
    private LocalDate fecha;

    public Partida(Equipo equipoA, Equipo equipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.fecha = LocalDate.now();
    }

    public void setResultado(int marcadorA, int marcadorB) {
        this.marcadorA = marcadorA;
        this.marcadorB = marcadorB;
    }

    public Equipo getEquipoA() { return equipoA; }
    public Equipo getEquipoB() { return equipoB; }
    public int getMarcadorA() { return marcadorA; }
    public int getMarcadorB() { return marcadorB; }

    public String resultado() {
        return equipoA.getNombre() + " " + marcadorA + " - " + marcadorB + " " + equipoB.getNombre();
    }

    @Override
    public String toString() {
        return "Partida el " + fecha + ": " + resultado();
    }
}