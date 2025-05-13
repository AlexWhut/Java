package ProyectoFinal.GestorTorneo;

import java.io.Serializable;
import java.util.*;

public class Equipo implements Serializable, Comparable<Equipo>, Estadisticas {
 
    private String nombre;
    private String pais;
    private int fundacion;
    private List<Jugador> jugadores;
    private int victorias, derrotas, empates;

    public Equipo(String nombre, String pais, int fundacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.fundacion = fundacion;
        this.jugadores = new ArrayList<>();
    }

    public void addJugador(Jugador j) {
        jugadores.add(j);
    }

    public String getNombre() { return nombre; }

    @Override
    public int compareTo(Equipo otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

    @Override
    public int getVictorias() { return victorias; }
    @Override
    public int getDerrotas() { return derrotas; }
    @Override
    public int getEmpates() { return empates; }
    @Override
    
    public double getWinRate() {
        int total = victorias + derrotas + empates;
        return total == 0 ? 0 : (double) victorias / total;
    }

    public void registrarResultado(int marcadorPropio, int marcadorRival) {
        if (marcadorPropio > marcadorRival) victorias++;
        else if (marcadorPropio < marcadorRival) derrotas++;
        else empates++;
    }

    @Override
    public String toString() {
        return nombre + " (" + pais + ", fundado en " + fundacion + ")";
    }
}