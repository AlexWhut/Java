package POO.Cuentas;

public class Test {
    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(15000, 5);
        cuentaAhorros.consignar(5000);
        cuentaAhorros.retirar(3000);
        cuentaAhorros.retirar(4000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.retirar(500);
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();
    }
}