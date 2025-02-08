package POO.Reloj;

import java.time.LocalTime;

public class Alarma {
    private LocalTime horaAlarma;
    private boolean activa;

    // Constructor para establecer la hora de la alarma
    public Alarma(LocalTime horaAlarma) {
        this.horaAlarma = horaAlarma;
        this.activa = false;
    }

    // Establecer la hora de la alarma
    public void setHoraAlarma(LocalTime horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    // Activar la alarma
    public void activar() {
        this.activa = true;
    }

    // Desactivar la alarma
    public void desactivar() {
        this.activa = false;
    }

    // Verificar si la alarma está activa
    public boolean isActiva() {
        return activa;
    }

    // Obtener la hora configurada de la alarma
    public LocalTime getHoraAlarma() {
        return horaAlarma;
    }
}
