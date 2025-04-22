package POOTerEva.Ficheros;

import java.io.*;

public class LeerFichero {
    public static void main(String[] args) {
    
        String ruta = "C:\\Users\\DAM2_Diurno\\Desktop\\Carpeta\\hola.txt";

        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
