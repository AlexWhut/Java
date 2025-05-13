package ProyectoFinal.GestorTorneo;

import java.io.*;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try {
            GestorTorneo gestor = new GestorTorneo();

            // Crear jugadores
            Jugador j1 = new Jugador("J1", "Alex Torres", "Whut", "IGL", "Colombia");
            Jugador j2 = new Jugador("J2", "Luis Pérez", "Shadow", "Fragger", "España");

            // Crear equipo
            Equipo e1 = new Equipo("Waku Esports", "Colombia", 2023);
            e1.addJugador(j1);
            e1.addJugador(j2);

            // Crear otro equipo
            Equipo e2 = new Equipo("FireWolf", "España", 2020);
            e2.addJugador(new Jugador("J3", "Carlos", "Ghost", "Support", "España"));
            e2.addJugador(new Jugador("J4", "Andrés", "SniperX", "Fragger", "España"));

            // Crear torneo tipo Liga
            TorneoLiga torneo = new TorneoLiga("Copa Valorant", "Valorant");
            torneo.agregarEquipo(e1);
            torneo.agregarEquipo(e2);
            torneo.generarEnfrentamientos();

            // Agregar a las List
            gestor.getJugadores().add(j1);
            gestor.getJugadores().add(j2);
            gestor.getEquipos().add(e1);
            gestor.getEquipos().add(e2);
            gestor.getTorneos().add(torneo);


            // Asignar resultado a las partidas
            for (Partida p : torneo.partidas) {
                if (p.getEquipoA().getNombre().equals("Waku Esports")) {
                    p.setResultado(13, 10); // Waku gana
                } else {
                    p.setResultado(9, 13); // FireWolf gana
                }
            }

            torneo.calcularPuntos();

            // Agregar a gestor
            gestor.ordenarEquipos((a, b) -> Double.compare(b.getWinRate(), a.getWinRate()));

            // Guardar datos serializados
            gestor.guardarDatos("C:/Users/whutc/Desktop/torneo_esports/datos_torneo.dat");

            // Exportar texto
            gestor.exportarTXT("C:/Users/whutc/Desktop/torneo_esports/equipos.txt");

            // Mostrar resultado
            System.out.println("Datos guardados y exportados correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }



        String ruta = "C:/Users/whutc/Desktop/torneo_esports/equipos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            System.out.println("=== Contenido de equipos.txt ===");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }


        String ruta2 = "C:/Users/whutc/Desktop/torneo_esports/datos_torneo.dat";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta2))) {
            List<Jugador> jugadores = (List<Jugador>) ois.readObject();
            List<Equipo> equipos = (List<Equipo>) ois.readObject();
            List<Torneo> torneos = (List<Torneo>) ois.readObject();

            System.out.println("=== Jugadores ===");
            for (Jugador j : jugadores) {
                System.out.println(j);
            }

            System.out.println("\n=== Equipos ===");
            for (Equipo e : equipos) {
                System.out.println(e);
            }

            System.out.println("\n=== Torneos ===");
            for (Torneo t : torneos) {
                System.out.println(t);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al deserializar: " + e.getMessage());
        }
    }
}

