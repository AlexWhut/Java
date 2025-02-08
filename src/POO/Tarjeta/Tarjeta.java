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
    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Ingreso exitoso. Nuevo saldo: " + saldo + " €");
        } else {
            System.out.println("Cantidad inválida.");
        }
    }

    // Método para comprobar el número secreto
    public boolean comprobarPin(int pin) {
        return this.numeroSecreto == pin;
    }

    // Método para sacar dinero
    public void sacarDinero(double cantidad) {
        if (cantidad > maxDiario) {
            System.out.println("Error: No puedes sacar más de " + maxDiario + " € por día.");
        } else if (saldo - cantidad < 200) {
            System.out.println("Error: No puedes retirar esa cantidad. El saldo mínimo permitido es 200 €.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo + " €");
        }
    }

    // Método para modificar el límite máximo diario
    public void setMaxDiario(double maxDiario) {
        this.maxDiario = maxDiario;
        System.out.println("Límite de retiro diario actualizado a " + maxDiario + " €");
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
}
