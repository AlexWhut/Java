package POOAbs.Circuito;
import java.util.ArrayList;

public abstract class Circuito {
    protected int voltaje;
    protected ArrayList<Resistencia> arrResistencias;

    public Circuito(int voltaje) {
        this.voltaje = voltaje;
        this.arrResistencias = new ArrayList<>();
    }

    public void addResistencia(Resistencia resistencia) {
        arrResistencias.add(resistencia);
    }

    public abstract double calcularIntensidad();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [voltaje=" + voltaje + ", resistencias=" + arrResistencias + ", intensidad=" + calcularIntensidad() + "]";
    }
}