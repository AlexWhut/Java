package POOAbs.Circuito;

import java.util.ArrayList;

public class Placa {
    private ArrayList<Circuito> circuitos;

    public Placa() {
        this.circuitos = new ArrayList<>();
    }

    public void addCircuito(Circuito circuito) {
        circuitos.add(circuito);
    }

    public double calcularIntensidadTotal() {
        double intensidadTotal = 0;
        for (Circuito c : circuitos) {
            intensidadTotal += c.calcularIntensidad();
        }
        return intensidadTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Placa con circuitos:\n");
        for (Circuito circuito : circuitos) {
            sb.append(circuito).append("\n");
        }
        sb.append("Intensidad total de la placa: ").append(calcularIntensidadTotal());
        return sb.toString();
    }
}