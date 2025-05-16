package ProyectoFinal.GestorTorneo;

import java.io.*;
import java.util.*;

public class GestorTorneo {
    
    private List<Jugador> jugadores = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();
    private List<Torneo> torneos = new ArrayList<>();

    public void guardarDatos(String archivo) throws IOException {
    File file = new File(archivo);
    file.getParentFile().mkdirs();

    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
        oos.writeObject(jugadores);
        oos.writeObject(equipos);
        oos.writeObject(torneos);
    }
    }

    public List<Jugador> getJugadores() { return jugadores; }
    public List<Equipo> getEquipos() { return equipos; }
    public List<Torneo> getTorneos() { return torneos; }


    public void cargarDatos(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            jugadores = (List<Jugador>) ois.readObject();
            equipos = (List<Equipo>) ois.readObject();
            torneos = (List<Torneo>) ois.readObject();
        }
    }

    public void exportarTXT(String archivo) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {
            for (Equipo e : equipos) {
                writer.println(e);
            }
        }
    }

    public void importarTXT(String archivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Lógica para procesar texto e importar (simplificado)
                System.out.println("Leído: " + linea);
            }
        }
    }

    public void ordenarEquipos(Comparator<Equipo> c) {
        equipos.sort(c);
    }
}