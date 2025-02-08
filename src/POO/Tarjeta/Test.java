package POO.Tarjeta;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una tarjeta con datos iniciales
        Tarjeta miTarjeta = new Tarjeta(135, 2320, 3212, 500);

        System.out.print("Introduce tu número secreto: ");
        int pinIngresado = scanner.nextInt();

        if (!miTarjeta.comprobarPin(pinIngresado)) {
            System.out.println("Error: Número secreto incorrecto.");
        } else {
            System.out.println("Número secreto correcto.");
            System.out.println("Saldo actual: " + miTarjeta.getSaldo() + " €");

            // Imprimir número de cuenta correctamente
            System.out.println("Número de cuenta: " + miTarjeta.getNumeroCuenta());

            // Intentar sacar dinero
            System.out.print("¿Cuánto deseas retirar? ");
            double cantidad = scanner.nextDouble();
            System.out.println(miTarjeta.sacarDinero(cantidad));

            // Intentar ingresar dinero
            System.out.print("¿Cuánto deseas ingresar? ");
            double ingreso = scanner.nextDouble();
            System.out.println(miTarjeta.ingresarDinero(ingreso));

            // Mostrar saldo final
            System.out.println("Saldo final: " + miTarjeta.getSaldo() + " €");
        }

        scanner.close();
    }
}