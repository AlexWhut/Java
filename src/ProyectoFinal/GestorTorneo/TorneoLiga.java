package ProyectoFinal.GestorTorneo;

public class TorneoLiga extends Torneo {
    public TorneoLiga(String nombre, String juego) {
        super(nombre, juego);
    }

    @Override
    public void calcularPuntos() {
        for (Partida p : partidas) {
            p.getEquipoA().registrarResultado(p.getMarcadorA(), p.getMarcadorB());
            p.getEquipoB().registrarResultado(p.getMarcadorB(), p.getMarcadorA());
        }
    }

    @Override
    public void generarEnfrentamientos() {
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                partidas.add(new Partida(equipos.get(i), equipos.get(j)));
            }
        }
    }

    @Override
    public String toString() {
    return "Liga: " + nombre + " - Juego: " + juego + " - Equipos inscritos: " + equipos.size();
}

}
