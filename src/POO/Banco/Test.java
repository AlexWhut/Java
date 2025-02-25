package POO.Banco;

public class Test {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco Central");
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9101-1121", 500);
        Usuario usuario = new Usuario("Alex", tarjeta);
        CajeroAutomatico cajero = new CajeroAutomatico(banco);

        // Imprimir información del usuario y su cuenta
        System.out.println(usuario);
        System.out.println(banco);
        
        // Simulación de retiro
        cajero.procesarRetiro(usuario, 200);
        cajero.procesarRetiro(usuario, 400);
    }
}
