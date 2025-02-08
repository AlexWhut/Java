package POO.Tarjeta;

public class Tarjeta {
    private int numeroCuenta;
    private double saldo;
    private int numeroSecreto;
    private double maxDiario;

    // Constructor
    public Tarjeta(int numeroCuenta, double saldo, int numeroSecreto, double maxDiario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.numeroSecreto = numeroSecreto;
        this.maxDiario = maxDiario;
    }

    // Métodos para consultar saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para ingresar dinero
    public String ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return "Ingreso exitoso. Nuevo saldo: " + saldo + " €";
        } else {
            return "Cantidad inválida.";
        }
    }

    // Método para comprobar el número secreto
    public boolean comprobarPin(int pin) {
        return this.numeroSecreto == pin;
    }

    // Método para sacar dinero
    public String sacarDinero(double cantidad) {
        if (cantidad > maxDiario) {
            return "Error: No puedes sacar más de " + maxDiario + " € por día.";
        } else if (saldo - cantidad < 200) {
            return "Error: No puedes retirar esa cantidad. El saldo mínimo permitido es 200 €.";
        } else {
            saldo -= cantidad;
            return "Retiro exitoso. Nuevo saldo: " + saldo + " €";
        }
    }

    // Método para modificar el límite máximo diario
    public void setMaxDiario(double maxDiario) {
        this.maxDiario = maxDiario;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
}