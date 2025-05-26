package POOTerEva.Ter3Eva;

public class EmpleadoRRHH extends Empleado {
    private final double PLUS = 580;

    public EmpleadoRRHH(String nombre, int id, Direccion direccion, double salarioBase, int horasExtras) {
        super(nombre, id, direccion, salarioBase, horasExtras);
    }

    @Override
    public double calcularSalarioTotal() {
        double horaBase = salarioBase / 160;
        return salarioBase + (horaBase * 1.5 * horasExtras) + PLUS;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Horas Extras: " + horasExtras);
        System.out.println("Salario Total: " + calcularSalarioTotal());
    }
}
