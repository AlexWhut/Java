package POOTerEva.Ordenar;

import java.time.LocalTime;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        LinkedList<Vuelo> vuelos = new LinkedList<>();
        vuelos.add(new Vuelo("IB123", "Madrid", "Londres", LocalTime.of(10, 30), 150));
        vuelos.add(new Vuelo("AA456", "Barcelona", "París", LocalTime.of(8, 15), 90));
        vuelos.add(new Vuelo("DL789", "Valencia", "Roma", LocalTime.of(12, 0), 120));
        vuelos.add(new Vuelo("BA012", "Sevilla", "Berlín", LocalTime.of(6, 45), 180));
        vuelos.add(new Vuelo("FR345", "Bilbao", "Ámsterdam", LocalTime.of(14, 20), 160));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige el criterio de ordenación:");
        System.out.println("1. Número de vuelo");
        System.out.println("2. Ciudad de origen");
        System.out.println("3. Ciudad de destino");
        System.out.println("4. Hora de salida");
        System.out.println("5. Duración del vuelo");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> Collections.sort(vuelos, ComparadoresVuelo.porNumero);
            case 2 -> Collections.sort(vuelos, ComparadoresVuelo.porOrigen);
            case 3 -> Collections.sort(vuelos, ComparadoresVuelo.porDestino);
            case 4 -> Collections.sort(vuelos, ComparadoresVuelo.porHoraSalida);
            case 5 -> Collections.sort(vuelos, ComparadoresVuelo.porDuracion);
            default -> System.out.println("Opción no válida. Se muestra la lista sin ordenar.");
        }

        System.out.println("\nVuelos ordenados:");
        for (Vuelo v : vuelos) {
            System.out.println(v);
        }

        scanner.close();
    }
}

