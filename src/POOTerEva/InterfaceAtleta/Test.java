package POOTerEva.InterfaceAtleta;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Atleta[] atletas = {
            new Atleta("Luis", 15.0, 22),
            new Atleta("Carlos", 12.0, 25),
            new Atleta("Ana", 10.0, 19),
            new Atleta("Sofía", 11.0, 20)
        };

        // Ordenar por tiempo (Comparable)
        Arrays.sort(atletas);
        System.out.println("== Atletas ordenados por tiempo ==");
        for (Atleta a : atletas) {
            System.out.println(a);
        }

        // Ordenar por edad (Comparator)
        Arrays.sort(atletas, new ComparadorEdades());
        System.out.println("\n== Atletas ordenados por edad ==");
        for (Atleta a : atletas) {
            System.out.println(a);
        }
    }
}
