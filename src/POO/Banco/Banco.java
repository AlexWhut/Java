package POO.Banco;

public class Banco {
    private String nombre;
    
    public Banco(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Banco: " + nombre;
    }
}

