package POO.Banco;

public class TarjetaCredito {
    private String numero;
    private double saldo;
    
    public TarjetaCredito(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public boolean realizarPago(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{numero='" + numero + "', saldo=" + saldo + "}";
    }
}

