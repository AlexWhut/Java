package ProyectoFinal.GestorTorneo;

import java.io.Serializable;
import java.util.*;

public abstract class Torneo implements Serializable {
   
    protected String nombre;
    protected String juego;
    protected List<Equipo> equipos;
    protected List<Partida> partidas;

    public Torneo(String nombre, String juego) {
        this.nombre = nombre;
        this.juego = juego;
        this.equipos = new ArrayList<>();
        this.partidas = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void registrarPartida(Partida p) {
        partidas.add(p);
    }

    public abstract void calcularPuntos();

    public abstract void generarEnfrentamientos();

    @Override
    public String toString() {
    return "Torneo: " + nombre + " (" + juego + "), Equipos: " + equipos.size() + ", Partidas: " + partidas.size();
}

}