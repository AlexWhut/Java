package POOTerEva.Ter3Eva;

public class Test {
    
}

/*
 * 
 * import java.util.ArrayList;

// Interfaces
interface Terrestre {
    void conducir();
}

interface Acuatico {
    void navegar();
}

// Clase base
abstract class Vehiculo {
    String nombre;

    Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

// Clases hijas
class VehiculoAnfibio extends Vehiculo implements Terrestre, Acuatico {
    VehiculoAnfibio(String nombre) {
        super(nombre);
    }

    public void conducir() {}
    public void navegar() {}
}

class Automovil extends Vehiculo implements Terrestre {
    Automovil(String nombre) {
        super(nombre);
    }

    public void conducir() {}
}

class Camion extends Vehiculo implements Terrestre {
    Camion(String nombre) {
        super(nombre);
    }

    public void conducir() {}
}

class MotoAnfibia extends Vehiculo implements Terrestre, Acuatico {
    MotoAnfibia(String nombre) {
        super(nombre);
    }

    public void conducir() {}
    public void navegar() {}
}

class Lancha extends Vehiculo implements Acuatico {
    Lancha(String nombre) {
        super(nombre);
    }

    public void navegar() {}
}

// Programa principal
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Automovil("Auto 1"));
        vehiculos.add(new Lancha("Lancha 1"));
        vehiculos.add(new Camion("Camión 1"));
        vehiculos.add(new VehiculoAnfibio("Anfibio 1"));
        vehiculos.add(new MotoAnfibia("MotoAnfibia 1"));

        int terrestres = 0;
        int acuaticos = 0;
        int terrestresAcuaticos = 0;

        for (Vehiculo v : vehiculos) {
            boolean esTerrestre = v instanceof Terrestre;
            boolean esAcuatico = v instanceof Acuatico;

            if (esTerrestre) terrestres++;
            if (esAcuatico) acuaticos++;
            if (esTerrestre && esAcuatico) terrestresAcuaticos++;
        }

        System.out.println("Vehículos terrestres: " + terrestres);
        System.out.println("Vehículos acuáticos: " + acuaticos);
        System.out.println("Vehículos terrestres-acuáticos: " + terrestresAcuaticos);
    }
}

 */