package POO.Atleta;

import java.util.ArrayList;
import java.util.List;

public class Competencia {
    private String nombre;
    private List<Atleta> atletas;

    public Competencia(String nombre) {
        this.nombre = nombre;
        this.atletas = new ArrayList<>();
    }

    public void agregarAtleta(Atleta atleta) {
        atletas.add(atleta);
    }

    public Atleta obtenerGanador() {
        if (atletas.isEmpty()) {
            return null;
        }
        Atleta ganador = atletas.get(0);
        for (Atleta atleta : atletas) {
            if (atleta.getTiempoCompetencia() < ganador.getTiempoCompetencia()) {
                ganador = atleta;
            }
        }
        return ganador;
    }

    public void mostrarParticipantes() {
        for (Atleta atleta : atletas) {
            System.out.println(atleta);
        }
    }

    @Override
    public String toString() {
        return "Competencia [nombre=" + nombre + ", atletas=" + atletas + "]";
    }

    
}

