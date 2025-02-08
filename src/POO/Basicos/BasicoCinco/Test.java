package POO.Basicos.BasicoCinco;

public class Test {
    public static void main(String[] args) {
        // Crear un autor
        Persona autor = new Persona("Y. Daniel", "Liang");

        // Crear una fecha de edición
        Fecha fechaEdicion = new Fecha(16, 11, 2001);

        // Crear un libro
        Libro libro = new Libro(
            "Introduction to Java Programming",
            autor,
            "0-13-031997-X",
            784,
            3,
            "Prentice-Hall",
            "New Jersey",
            "USA",
            fechaEdicion
        );

        // Mostrar la información del libro
        libro.mostrarInformacion();
    }
}
