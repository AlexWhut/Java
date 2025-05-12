package POOTerEva.InterfaceAtleta;

import java.io.*;
import java.util.*;

// ahora convertir el Arrays por List mejor con 4 atletas, el archivo se llamara atletas.ser para serializarlo guardar
// lo de List para meterlo al archivo creado.
// luego tener una para desrealizar y leer el atletas.ser y ver su contenido del archivo donde ponga la ruta

public class Test {
    public static void main(String[] args) {
        // Convertir Array a List
        List<Atleta> atletas = Arrays.asList( // inv asList
            new Atleta("Luis", 15.0, 22),
            new Atleta("Carlos", 12.0, 25),
            new Atleta("Ana", 10.0, 19),
            new Atleta("Sofía", 11.0, 20)
        );

        // Ordenar por tiempo (con colecctions sort ya que pase de Array[] a List)
        /* Collections.sort(atletas);
            System.out.println("== Atletas ordenados por tiempo ==");
        for (Atleta a : atletas) {
            System.out.println(a);
        } */

        // Ordenar por edad (Comparator)
        Collections.sort(atletas, new ComparadorEdades());
            System.out.println("\n== Atletas ordenados por edad ==");
        for (Atleta a : atletas) {
            System.out.println(a);
        }

        // Crear la carpeta si no existe
        File carpeta = new File("JavaSerializar");
        if (!carpeta.exists()) {
            boolean creada = carpeta.mkdirs();
            if (creada) {
                System.out.println("Carpeta 'JavaSerializar' creada exitosamente.");
            } else {
                System.out.println("Error al crear la carpeta.");
                return;
            }
        }

        // Serializar la lista en la carpeta
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaSerializar/atletas.ser"))) {
            oos.writeObject(atletas);
            System.out.println("Lista de atletas guardada en atletas.ser");
        } catch (IOException e) {
            System.out.println("Error al guardar atletas: " + e.getMessage());
        }

        // Deserializar la lista
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("JavaSerializar/atletas.ser"))) {
            List<Atleta> atletasRecuperados = (List<Atleta>) ois.readObject();
            System.out.println("\n//// Atletas recuperados de atletas.ser ////");
            for (Atleta a : atletasRecuperados) {
                System.out.println(a);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer atletas: " + e.getMessage());
        }
    }
}