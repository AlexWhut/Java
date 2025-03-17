package POOAbs.Circuito;

// Clase que representa una resistencia
class Resistencia {
    private int valor;

    public Resistencia(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}