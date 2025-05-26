package POOTerEva.Ter3Eva;

import java.util.Comparator;

public class ComparadorSalario implements Comparator<Empleado> {
    @Override
    public int compare(Empleado e1, Empleado e2) {
        return Double.compare(e2.calcularSalarioTotal(), e1.calcularSalarioTotal());
    }

    /*
        public int compare(Empleado e1, Empleado e2) {
        return e1.getNombre().compareToIgnoreCase(e2.getNombre());
    }
        \ */
}
