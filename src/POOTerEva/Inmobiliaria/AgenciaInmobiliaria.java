import java.util.ArrayList;

public class AgenciaInmobiliaria {
    private ArrayList<Inmueble> inmuebles;

    public AgenciaInmobiliaria() {
        this.inmuebles = new ArrayList<>();
    }

    public void addInmueble(Inmueble inmueble) {
        inmuebles.add(inmueble);
    }

    public void verTodasVentaInmueble() {
        for (Inmueble inmueble : inmuebles) {
            if (inmueble instanceof Solar || inmueble instanceof Vivienda) {
                System.out.println(inmueble);
            }
        }
    }

    public void verTodosAlquilerInmueble() {
        for (Inmueble inmueble : inmuebles) {
            if (inmueble instanceof PlazaDeGaraje || inmueble instanceof LocalComercial || inmueble instanceof Vivienda) {
                System.out.println(inmueble);
            }
        }
    }

    public void inmueblesVenta(int precioMax) {
        for (Inmueble inmueble : inmuebles) {
            if (inmueble instanceof Solar) {
                if (inmueble.getPrecio() < precioMax) {
                    System.out.println(inmueble);
                }
            } else if (inmueble instanceof Vivienda) {
                Vivienda v = (Vivienda) inmueble;
                if (v.getPrecioVenta() < precioMax) {
                    System.out.println(v);
                }
            }
        }
    }

    public int solaresRusticos() {
        int contador = 0;
        for (Inmueble inmueble : inmuebles) {
            if (inmueble instanceof Solar) {
                Solar s = (Solar) inmueble;
                if (s.isEsRustico()) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public void verViviendasAlquilerDormitorios(int minimoDormitorios) {
        for (Inmueble inmueble : inmuebles) {
            if (inmueble instanceof Vivienda) {
                Vivienda v = (Vivienda) inmueble;
                if (v.getNumeroHabitaciones() > minimoDormitorios) {
                    System.out.println(v);
                }
            }
        }
    }

    public void verViviendasCompraDormitorios(int minimoDormitorios) {
        for (Inmueble inmueble : inmuebles) {
            if (inmueble instanceof Vivienda) {
                Vivienda v = (Vivienda) inmueble;
                if (v.getNumeroHabitaciones() > minimoDormitorios) {
                    System.out.println(v);
                }
            }
        }
    }

    public void verGarajesPublicos() {
        for (Inmueble inmueble : inmuebles) {
            if (inmueble instanceof PlazaDeGaraje) {
                PlazaDeGaraje g = (PlazaDeGaraje) inmueble;
                if (g.isEsPublico()) {
                    System.out.println(g);
                }
            }
        }
    }

    public void localesSegundaMano(int metros) {
        for (Inmueble inmueble : inmuebles) {
            if (inmueble instanceof LocalComercial) {
                LocalComercial local = (LocalComercial) inmueble;
                if (!local.isEsNueva() && local.getMetrosCuadrados() > metros) {
                    System.out.println(local);
                }
            }
        }
    }
}
