package POO.Pajaro;

public class Pajaro {

    private int edad, ID;
    private String pais, color;

 
    private static int contadorPajaros = 100000;

    // Constructor
    public Pajaro(int edad, String pais, String color) {
        this.edad = edad;
        this.pais = pais;
        this.color = color;
        this.ID = generarID();
    }


    private int generarID() {
        return ++contadorPajaros; // Incrementa el contador y asigna el ID
    }


    @Override
    public String toString() {
        return "Pajaro[ID: " + ID + ", Edad: " + edad + " años, Pais: " + pais + ", Color: " + color + "]";
    }
}