package POO.Reloj;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Reloj {
    private LocalTime horaActual;
    private List<Alarma> alarmas;

    // Constructor inicializa la hora y las alarmas
    public Reloj() {
        this.horaActual = LocalTime.of(0, 0); // Hora inicial
        this.alarmas = new ArrayList<>();
    }

    // Establecer la hora actual del reloj
    public void setHora(LocalTime hora) {
        this.horaActual = hora;
    }

    // Obtener la hora actual
    public LocalTime getHora() {
        return this.horaActual;
    }

    // Añadir una alarma
    public void añadirAlarma(Alarma alarma) {
        this.alarmas.add(alarma);
    }

    // Comprobar si alguna alarma suena
    public void comprobarAlarmas() {
        for (Alarma alarma : alarmas) {
            if (alarma.isActiva() && alarma.getHoraAlarma().equals(horaActual)) {
                System.out.println("¡Alarma suena! Son las " + horaActual);
            }
        }
    }

    // Avanzar la hora
    public void avanzarHora(int segundos) {
        this.horaActual = this.horaActual.plusSeconds(segundos);
        System.out.println("Hora actual: " + horaActual);
        comprobarAlarmas();
    }
}
