package POO.Contador;

public class Contador {
    private int valor;

    // Constructor que inicializa el contador a 0
    public Contador() {
        this.valor = 0;
    }

    // Método para incrementar el contador en una unidad
    public void incrementar() {
        this.valor++;
    }

    // Método para incrementar el contador en varias unidades
    public void incrementar(int unidades) {
        if (unidades > 0) {
            this.valor += unidades;
        }
    }

    // Método para decrementar el contador en una unidad
    public void decrementar() {
        this.valor--;
    }

    // Método para decrementar el contador en varias unidades
    public void decrementar(int unidades) {
        if (unidades > 0) {
            this.valor -= unidades;
        }
    }

    // Método para reiniciar el contador a 0
    public void reiniciar() {
        this.valor = 0;
    }

    // Método para obtener el valor actual del contador
    public int getValor() {
        return this.valor;
    }
}
