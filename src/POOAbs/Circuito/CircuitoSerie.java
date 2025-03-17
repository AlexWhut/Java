package POOAbs.Circuito;

class CircuitoSerie extends Circuito {
    public CircuitoSerie(int voltaje) {
        super(voltaje);
    }

    @Override
    public double calcularIntensidad() {
        int resistenciaTotal = 0;
        for (Resistencia r : arrResistencias) {
            resistenciaTotal += r.getValor();
        }
        return resistenciaTotal != 0 ? (double) voltaje / resistenciaTotal : 0;
    }
}