package POO.Basicos.BasicoDos;

import java.util.Calendar;

// Clase BasicFecha
public class BasicFecha {
    private int dia;
    private int mes;
    private int anno;

    // Constructor vacío que toma la fecha actual
    public BasicFecha() {
        Calendar fechaActual = Calendar.getInstance();
        this.dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        this.mes = fechaActual.get(Calendar.MONTH) + 1; // Enero es 0, por eso se suma 1
        this.anno = fechaActual.get(Calendar.YEAR);
    }

    // Constructor con parámetros
    public BasicFecha(int dia, int mes, int anno) {
        if (esFechaValida(dia, mes, anno)) {
            this.dia = dia;
            this.mes = mes;
            this.anno = anno;
        } 
    }

    // Métodos set y get
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (esFechaValida(dia, this.mes, this.anno)) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (esFechaValida(this.dia, mes, this.anno)) {
            this.mes = mes;
        }
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        if (esFechaValida(this.dia, this.mes, anno)) {
            this.anno = anno;
        }
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Fecha: "+ dia + "/" + mes + "/" + anno; 
    }
    
    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BasicFecha otra = (BasicFecha) obj;
        return dia == otra.dia && mes == otra.mes && anno == otra.anno;
    }
    
    // Método para validar la fecha
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
    
    // Método para validar si un año es bisiesto
    private boolean esBisiesto(int anno) {
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }
}