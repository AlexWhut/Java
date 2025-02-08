package POO.Basicos.BasicoCuatro;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.println("Ingrese el título de la canción: ");
        String titulo = scanner.nextLine();
        
        System.out.println("Ingrese el autor de la canción: ");
        String autor = scanner.nextLine();

        // Crear objeto Cancion con los datos ingresados
        BasicCancion BasicCancion1 = new BasicCancion(titulo, autor);
        
        // Mostrar información de la canción
        System.out.println("\nInformación de la canción:");
        System.out.println(BasicCancion1);

        scanner.close();
    }
}
