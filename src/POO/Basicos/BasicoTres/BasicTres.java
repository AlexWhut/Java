package POO.Basicos.BasicoTres;

public class BasicTres {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor con hora, minuto y segundo
    public BasicTres(int hora, int minuto, int segundo) {
        if (esHoraValida(hora, minuto, segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    // Constructor con hora y minuto
    public BasicTres(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    // Constructor con solo la hora
    public BasicTres(int hora) {
        this(hora, 0, 0);
    }

    // Métodos Get y Set con validaciones
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (esHoraValida(hora, this.minuto, this.segundo)) {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (esHoraValida(this.hora, minuto, this.segundo)) {
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (esHoraValida(this.hora, this.minuto, segundo)) {
            this.segundo = segundo;
        }
    }

    // Validación de hora
    private boolean esHoraValida(int hora, int minuto, int segundo) {
        return (hora >= 0 && hora < 24) &&
               (minuto >= 0 && minuto < 60) &&
               (segundo >= 0 && segundo < 60);
    }

    // Método toString para mostrar la hora
    @Override
    public String toString() {
        return String.format("Hora: %02d:%02d:%02d", hora, minuto, segundo);
    }
}
