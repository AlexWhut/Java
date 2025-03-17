package POOAbs.Circuito;

public class Test {
    public static void main(String[] args) {
        Placa placa = new Placa();

        Circuito serie1 = new CircuitoSerie(34);
        serie1.addResistencia(new Resistencia(200));
        serie1.addResistencia(new Resistencia(400));
        serie1.addResistencia(new Resistencia(500));

        Circuito serie2 = new CircuitoSerie(45);
        serie2.addResistencia(new Resistencia(50));
        serie2.addResistencia(new Resistencia(700));

        Circuito paralelo1 = new CircuitoParalelo(100);
        paralelo1.addResistencia(new Resistencia(100));

        placa.addCircuito(serie1);
        placa.addCircuito(serie2);
        placa.addCircuito(paralelo1);

        System.out.println(placa);
    }
}
