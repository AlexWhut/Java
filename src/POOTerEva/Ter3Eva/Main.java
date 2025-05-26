package POOTerEva.Ter3Eva;

import java.io.*;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Calle: ");
            String calle = scanner.nextLine();
            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine();
            Direccion direccion = new Direccion(calle, ciudad);
            System.out.print("Salario Base: ");
            double salarioBase = Double.parseDouble(scanner.nextLine());
            System.out.print("Horas Extras: ");
            int horasExtras = Integer.parseInt(scanner.nextLine());
            System.out.print("Tipo (1-Proyectos, 2-RRHH): ");
            int tipo = Integer.parseInt(scanner.nextLine());

            if (tipo == 1) {
                empleados.add(new EmpleadoProyectos(nombre, id, direccion, salarioBase, horasExtras));
            } else {
                empleados.add(new EmpleadoRRHH(nombre, id, direccion, salarioBase, horasExtras));
            }
        }

        empleados.sort(new ComparadorSalario());

        System.out.println("\n--- Lista de Empleados ---");
        for (Empleado e : empleados) {
            e.mostrarInformacion();
            System.out.println();
        }

        System.out.print("¿Desea guardar en archivo? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("nominas.dat"))) {
                oos.writeObject(empleados);
                System.out.println("Empleados guardados correctamente.");
            } catch (IOException e) {
                System.err.println("Error al guardar: " + e.getMessage());
            }
        }

        System.out.print("¿Desea cargar desde archivo? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("nominas.dat"))) {
                List<Empleado> cargados = (List<Empleado>) ois.readObject();
                System.out.println("\n--- Empleados cargados ---");
                for (Empleado e : cargados) {
                    e.mostrarInformacion();
                    System.out.println();
                }
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al leer: " + e.getMessage());
            }
        }
    }
}