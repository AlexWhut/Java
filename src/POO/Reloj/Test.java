package POO.Reloj;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        // Crear un reloj
        Reloj reloj = new Reloj();

        // Crear alarmas
        Alarma alarma1 = new Alarma(LocalTime.of(6, 30));  // Alarma a las 6:30 AM
        Alarma alarma2 = new Alarma(LocalTime.of(7, 0));   // Alarma a las 7:00 AM

        // Activar alarmas
        alarma1.activar();
        alarma2.activar();

        // Añadir alarmas al reloj
        reloj.añadirAlarma(alarma1);
        reloj.añadirAlarma(alarma2);

        // Establecer la hora actual del reloj
        reloj.setHora(LocalTime.of(6, 28));  // Hora inicial: 6:28 AM

        // Avanzar el reloj y comprobar alarmas
        for (int i = 0; i < 1800; i++) { // Avanzar de 30 segundos en 30 segundos
            reloj.avanzarHora(30);
        }
    }
}
