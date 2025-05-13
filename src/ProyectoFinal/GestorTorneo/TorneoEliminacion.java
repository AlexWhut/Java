package ProyectoFinal.GestorTorneo;

public class TorneoEliminacion extends Torneo {
    public TorneoEliminacion(String nombre, String juego) {
        super(nombre, juego);
    }

    @Override
    public void calcularPuntos() {
        // Solo el ganador avanza, lógica más compleja (simplificada)
        // Se podría hacer eliminatoria a una sola ronda
    }

    @Override
    public void generarEnfrentamientos() {
        // Lógica para armar llaves de eliminación
    }
}
