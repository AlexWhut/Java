package POOTerEva.Ter3Eva;

import java.io.Serializable;

public class Direccion implements Serializable {
    private String calle;
    private String ciudad;

    public Direccion(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad;
    }
}