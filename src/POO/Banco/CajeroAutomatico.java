package POO.Banco;

public class CajeroAutomatico {
    private Banco banco;
    
    public CajeroAutomatico(Banco banco) {
        this.banco = banco;
    }
    
    public void procesarRetiro(Usuario usuario, double cantidad) {
        if (usuario.retirarDinero(cantidad)) {
            System.out.println("Retiro exitoso de: " + cantidad);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}