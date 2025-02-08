package POO.Basicos.BasicoCinco;
import java.util.Calendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anno;

    // Constructor por defecto (toma la fecha actual)
    public Fecha() {
        Calendar fechaActual = Calendar.getInstance();
        this.dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        this.mes = fechaActual.get(Calendar.MONTH) + 1;
        this.anno = fechaActual.get(Calendar.YEAR);
    }

    // Constructor con parámetros
    public Fecha(int dia, int mes, int anno) {
        if (esFechaValida(dia, mes, anno)) {
            this.dia = dia;
            this.mes = mes;
            this.anno = anno;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.anno = 2000; // Fecha por defecto en caso de error
        }
    }

    // Métodos Get y Set
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnno() { return anno; }

    public void setDia(int dia) { this.dia = dia; }
    public void setMes(int mes) { this.mes = mes; }
    public void setAnno(int anno) { this.anno = anno; }

    // Validación de fecha
    private boolean esFechaValida(int dia, int mes, int anno) {
        if (anno < 1 || anno > 9999 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (esBisiesto(anno)) {
            diasPorMes[1] = 29;
        }
        return dia <= diasPorMes[mes - 1];
    }

    // Método para saber si un año es bisiesto
    private boolean esBisiesto(int anno) {
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }

    // Método toString para mostrar la fecha en formato largo
    @Override
    public String toString() {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return dia + " de " + meses[mes - 1] + " de " + anno;
    }
}
