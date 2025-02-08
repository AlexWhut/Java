package POO.Basicos.BasicoCinco;

public class Persona {
    private String nombre;
    private String apellido;

    // Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Métodos Get y Set
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    // Método toString para mostrar el nombre completo
    @Override
    public String toString() {
        return apellido + ", " + nombre;
    }
}
