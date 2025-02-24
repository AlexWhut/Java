package POO.Atleta;

public class Atleta {
    private String nombre;
    private int edad;
    private double peso;
    private String pais;
    private double tiempoCompetencia;

    public Atleta(String nombre, int edad, double peso, String pais, double tiempoCompetencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.pais = pais;
        this.tiempoCompetencia = tiempoCompetencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getPais() {
        return pais;
    }

    public double getTiempoCompetencia() {
        return tiempoCompetencia;
    }

    public void setTiempoCompetencia(double tiempoCompetencia) {
        this.tiempoCompetencia = tiempoCompetencia;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", pais='" + pais + '\'' +
                ", tiempoCompetencia=" + tiempoCompetencia +
                '}';
    }
}

