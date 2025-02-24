package POO.Cuentas;

public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.activa = saldo >= 10000;
    }

    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("Cuenta inactiva, no se puede consignar.");
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("Cuenta inactiva, no se puede retirar.");
        }
    }

    @Override
    public void extractoMensual() {
        if (super.getNumRetiros() > 4) {
            super.setComisionMensual(super.getComisionMensual() + (super.getNumRetiros() - 4) * 1000);
        }
        super.extractoMensual();
        activa = super.getSaldo() >= 10000;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cuenta activa: " + activa);
        System.out.println("Total transacciones: " + (super.getNumConsignaciones() + super.getNumRetiros()));
    }
}
