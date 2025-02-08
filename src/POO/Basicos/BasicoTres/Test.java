package POO.Basicos.BasicoTres;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objeto Tiempo con valores ingresados por el usuario
        System.out.println("Ingresa la hora (0-23): ");
        int hora = scanner.nextInt();
        System.out.println("Ingresa los minutos (0-59): ");
        int minuto = scanner.nextInt();
        System.out.println("Ingresa los segundos (0-59): ");
        int segundo = scanner.nextInt();

        // Crear objeto Tiempo
        BasicTres tiempo = new BasicTres(hora, minuto, segundo);
        System.out.println("Hora inicial: " + tiempo);

        // Modificar la hora manualmente
        System.out.println("\nModifica la hora:");
        System.out.println("Nueva hora: ");
        tiempo.setHora(scanner.nextInt());

        System.out.println("Nuevos minutos: ");
        tiempo.setMinuto(scanner.nextInt());

        System.out.println("Nuevos segundos: ");
        tiempo.setSegundo(scanner.nextInt());

        // Mostrar la hora modificada
        System.out.println("Hora modificada: " + tiempo);

        scanner.close();
    }
}
