package POOTerEva.Ter3Eva;

import java.io.Serializable;

public abstract class Empleado implements Calculable, Serializable {
    protected String nombre;
    protected int id;
    protected Direccion direccion;
    protected double salarioBase;
    protected int horasExtras;

    public Empleado(String nombre, int id, Direccion direccion, double salarioBase, int horasExtras) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    public abstract void mostrarInformacion();
}
