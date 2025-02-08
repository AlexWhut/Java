package POO.Biblioteca;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private String name;
    private ArrayList<Libro> libros;

    public Biblioteca(String name) {
        this.name = name;
        this.libros = new ArrayList<>();
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
        Collections.sort(libros);
    }

    public void deleteLibro(String titulo) {
        libros.removeIf(libro -> libro.getTitulo().equals(titulo));
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public String getName() {
        return name;
    }
}
