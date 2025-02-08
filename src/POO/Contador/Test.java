package POO.Contador;

public class Test {
    public static void main(String[] args) {
        // Crear un objeto contador
        Contador contador = new Contador();

        // Incrementar y decrementar en unidades
        contador.incrementar();
        contador.incrementar(5);
        contador.decrementar();
        contador.decrementar(3);

        // Mostrar valor actual
        int valorActual = contador.getValor();
        System.out.println("Valor actual del contador: " + valorActual);

        // Reiniciar el contador
        contador.reiniciar();
        valorActual = contador.getValor();
        System.out.println("Valor después de reiniciar: " + valorActual);
    }
}
