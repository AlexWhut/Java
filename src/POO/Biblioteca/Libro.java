package POO.Biblioteca;

class Libro implements Comparable<Libro> {
    private String titulo;
    private Persona autor;
    private String editorial;
    private String isbn;
    private int anio;

    public Libro(String titulo, Persona autor, String editorial, String isbn, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", editorial='" + editorial + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anio=" + anio +
                '}';
    }

    @Override
    public int compareTo(Libro otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }
}