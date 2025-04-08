package POOTerEva.Ficheros;

import java.io.*;

public class CrearCarpeta {
    public static void main(String[] args) {
        
        String ruta = "C:\\Users\\DAM2_Diurno\\Desktop\\Carpeta";
        File carpeta = new File(ruta);

        if (carpeta.mkdirs()) {
            System.out.println("Carpetas creadas con exito.");
        } else {
            System.out.println("No se pudieron crear las carpetas (puede que ya existan).");
        }
    }
}