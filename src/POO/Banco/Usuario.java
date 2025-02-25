package POO.Banco;

public class Usuario {
    private String nombre;
    private TarjetaCredito tarjeta;

    public Usuario(String nombre, TarjetaCredito tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    // Método necesario para acceder a la tarjeta
    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', " + tarjeta + "}";
    }
}
