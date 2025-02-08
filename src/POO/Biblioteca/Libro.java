package POO.Biblioteca;

public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;
    private String editorial;
    private String isbn;
    private int year;

    public Libro(String titulo, String autor, String editorial, String isbn, int year) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.year = year;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' + 
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", isbn='" + isbn + '\'' +
                ", año=" + year +
                '}';
    }

    @Override
    public int compareTo(Libro otro) {
        return this.titulo.compareTo(otro.titulo);
    }
}
