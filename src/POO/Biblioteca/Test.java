package POO.Biblioteca;

public class Test {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Añadir libros
        biblioteca.addLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana", "978-3-16-148410-0", 1967));
        biblioteca.addLibro(new Libro("Rayuela", "Julio Cortázar", "Editorial Sudamericana", "978-3-16-148410-1", 1963));
        biblioteca.addLibro(new Libro("La Tía Julia y el escribidor", "Mario Vargas Llosa", "Editorial Seix Barral", "978-3-16-148410-2", 1977));

        // Ver los libros
        System.out.println("Libros en la biblioteca: " + biblioteca.getName());
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro);
        }

        // Eliminar libros
        biblioteca.deleteLibro("Cien años de soledad");
        biblioteca.deleteLibro("Rayuela");

        // Ver libros después de eliminarlos
        System.out.println("\nLibros en la biblioteca después de eliminar:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro);
        }
    }
}
