package POO.Banco;

public class Test {
    public static void main(String[] args) {
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9101-1121", 500);
        Usuario usuario = new Usuario("Alex", tarjeta);
        CajeroAutomatico cajero = new CajeroAutomatico();

        System.out.println(usuario); // Mostrar datos del usuario
        cajero.procesarRetiro(usuario, 200); // Retirar 200
        cajero.procesarRetiro(usuario, 400); // Intentar retirar 400 (fondos insuficientes)
    }
}
