package POO.Banco;

public class CajeroAutomatico {
    public void procesarRetiro(Usuario usuario, double cantidad) {
        if (usuario.getTarjeta().realizarPago(cantidad)) {
            System.out.println("Retiro exitoso de: " + cantidad);
        } else {
            System.out.println("Fondos insuficientes.");
        }
        System.out.println(usuario.getTarjeta().toSaldo()); // Mostrar saldo actual
    }
}
