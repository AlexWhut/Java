package POO.Biblioteca;

class Test {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Crear autores
        Persona autor1 = new Persona("Gabriel", "García Márquez", new Fecha(6, 3, 1927));
        Persona autor2 = new Persona("Julio", "Cortázar", new Fecha(26, 8, 1914));
        Persona autor3 = new Persona("Mario", "Vargas Llosa", new Fecha(28, 3, 1936));

        // Añadir libros con objetos Persona como autores
        biblioteca.addLibro(new Libro("Cien años de soledad", autor1, "Editorial Sudamericana", "978-3-16-148410-0", 1967));
        biblioteca.addLibro(new Libro("Rayuela", autor2, "Editorial Sudamericana", "978-3-16-148410-1", 1963));
        biblioteca.addLibro(new Libro("La Tía Julia y el escribidor", autor3, "Editorial Seix Barral", "978-3-16-148410-2", 1977));

        // Ver los libros
        System.out.println("Libros en la biblioteca: " + biblioteca.getNombre());
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