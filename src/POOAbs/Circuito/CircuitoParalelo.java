package POOAbs.Circuito;

class CircuitoParalelo extends Circuito {
    public CircuitoParalelo(int voltaje) {
        super(voltaje);
    }

    @Override
    public double calcularIntensidad() {
        double sumaInversa = 0;
        for (Resistencia r : arrResistencias) {
            sumaInversa += 1.0 / r.getValor();
        }
        double resistenciaEquivalente = sumaInversa != 0 ? 1.0 / sumaInversa : 0;
        return resistenciaEquivalente != 0 ? (double) voltaje / resistenciaEquivalente : 0;
    }
}
    