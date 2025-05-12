package POOTerEva.InterfaceAtleta;

import java.util.Comparator;

public class ComparadorEdades implements Comparator<Atleta> {
    @Override
    public int compare(Atleta a1, Atleta a2) {
        return Integer.compare(a1.getEdad(), a2.getEdad());
    }
}

// este es el comparador de edades
