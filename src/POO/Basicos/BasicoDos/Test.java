package POO.Basicos.BasicoDos;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una fecha con valores ingresados por el usuario
        System.out.println("Digita el dia (1-31): ");
        int dia = scanner.nextInt();
        System.out.println("Digita el mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.println("Digita el año (1-9999): ");
        int anno = scanner.nextInt();

        // Crear las fechas
        BasicFecha fecha1 = new BasicFecha(dia, mes, anno);
        BasicFecha fecha2 = new BasicFecha();

        // Imprimir las fechas
        System.out.println("Fecha introducida: " + fecha1);
        System.out.println("Fecha actual del sistema: " + fecha2);

        // Verificar si la fecha ingresada es válida
        if (!fecha1.equals(new BasicFecha(dia, mes, anno))) {
            System.out.println("Fecha incorrecta y distinta");
        } else {
            if (fecha1.equals(fecha2)) {
                System.out.println("Las fechas son iguales");
            } else {
                System.out.println("Las fechas son distintas");
            }
        }

        scanner.close();
    }
}
