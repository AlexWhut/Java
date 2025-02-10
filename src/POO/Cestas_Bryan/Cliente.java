package POO.Cestas_Bryan;

public class Cliente {
    
    private String name;
    private String dni;
    private int tipo;

    public Cliente(String name, String dni, int tipo) {
        this.name = name;
        this.dni = dni;
        this.tipo = tipo;    
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", DNI: " + dni + ", Tipo: " + tipo;
    }
}
