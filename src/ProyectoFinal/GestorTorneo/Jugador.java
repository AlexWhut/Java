package ProyectoFinal.GestorTorneo;

import java.io.Serializable;

public class Jugador implements Serializable {
    
    private String id;
    private String nombre;
    private String nick;
    private String rol;
    private String nacionalidad;

    public Jugador(String id, String nombre, String nick, String rol, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nick = nick;
        this.rol = rol;
        this.nacionalidad = nacionalidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getNick() { return nick; }
    public String getRol() { return rol; }
    public String getNacionalidad() { return nacionalidad; }

    @Override
    public String toString() {
        return nick + " (" + nombre + ", " + rol + ") - " + nacionalidad;
    }
}