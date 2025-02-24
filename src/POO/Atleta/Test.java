package POO.Atleta;

public class Test {
    public static void main(String[] args) {
        // Crear atletas
        Atleta atleta1 = new Atleta("Usain Bolt", 35, 94.0, "Jamaica", 9.58);
        Atleta atleta2 = new Atleta("Carl Lewis", 40, 80.0, "EE.UU.", 9.86);
        Atleta atleta3 = new Atleta("Yohan Blake", 32, 85.0, "Jamaica", 9.69);

        // Crear competencia y agregar atletas
        Competencia competencia = new Competencia("100m planos");
        competencia.agregarAtleta(atleta1);
        competencia.agregarAtleta(atleta2);
        competencia.agregarAtleta(atleta3);

        // Mostrar participantes
        System.out.println("Participantes:");
        competencia.mostrarParticipantes();

        // Obtener y mostrar ganador
        Atleta ganador = competencia.obtenerGanador();
        System.out.println("\nEl ganador es: " + ganador.getNombre() + " con un tiempo de " + ganador.getTiempoCompetencia() + " segundos.");
    }
}

