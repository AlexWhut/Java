package POO.Cuentas;

public class CuentaCorriente extends Cuenta {
    private float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad > super.getSaldo()) {
            sobregiro += (cantidad - super.getSaldo());
            super.setSaldo(0);
        } else {
            super.setSaldo(super.getSaldo() - cantidad);
        }
        super.incrementarRetiros();
    }

    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                super.setSaldo(cantidad - sobregiro);
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
            }
        } else {
            super.consignar(cantidad);
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Sobregiro: " + sobregiro);
        System.out.println("Total transacciones: " + (super.getNumConsignaciones() + super.getNumRetiros()));
    }
}