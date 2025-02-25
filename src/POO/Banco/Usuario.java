package POO.Banco;

public class Usuario {

    private String nombre;
    private TarjetaCredito tarjeta;
    
    public Usuario(String nombre, TarjetaCredito tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }
    
    public boolean retirarDinero(double cantidad) {
        return tarjeta.realizarPago(cantidad);
    }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', " + tarjeta.toString() + "}";
    }
    
}