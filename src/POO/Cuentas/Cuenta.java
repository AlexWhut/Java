package POO.Cuentas;

public class Cuenta {
    private float saldo;
    private int numConsignaciones = 0;
    private int numRetiros = 0;
    private float tasaAnual;
    private float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public int getNumRetiros() {
        return numRetiros;
    }
    
    public void incrementarRetiros() {
        numRetiros++;
    }
    
    public int getNumConsignaciones() {
        return numConsignaciones;
    }
    
    public float getComisionMensual() {
        return comisionMensual;
    }
    
    public void setComisionMensual(float comision) {
        this.comisionMensual = comision;
    }
    
    
    public void consignar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numConsignaciones++;
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            saldo -= cantidad;
            numRetiros++;
        }
    }

    public void calcularInteresMensual() {
        float interesMensual = (saldo * (tasaAnual / 100)) / 12;
        saldo += interesMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteresMensual();
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Consignaciones: " + numConsignaciones);
        System.out.println("Retiros: " + numRetiros);
        System.out.println("Comisión mensual: " + comisionMensual);
    }
}