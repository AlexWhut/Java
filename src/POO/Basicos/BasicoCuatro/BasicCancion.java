package POO.Basicos.BasicoCuatro;

public class BasicCancion {
    private String titulo;
    private String autor;

    // Constructor con parámetros
    public BasicCancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Constructor por defecto
    public BasicCancion() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
    }

    // Métodos Get y Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método toString para mostrar la información de la canción
    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor;
    }
}

