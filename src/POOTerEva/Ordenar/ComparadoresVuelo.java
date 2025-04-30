package POOTerEva.Ordenar;

import java.util.Comparator;


public class ComparadoresVuelo {
    public static Comparator<Vuelo> porNumero = Comparator.comparing(Vuelo::getNumero);

    public static Comparator<Vuelo> porOrigen = Comparator.comparing(Vuelo::getOrigen);

    public static Comparator<Vuelo> porDestino = Comparator.comparing(Vuelo::getDestino);

    public static Comparator<Vuelo> porHoraSalida = Comparator.comparing(Vuelo::getSalida);

    public static Comparator<Vuelo> porDuracion = Comparator.comparingInt(Vuelo::getDuracion);
}
