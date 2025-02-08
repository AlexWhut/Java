package POO.Director;

public class Test {
    public static void main(String[] args) {
    	
    	//Experimento 1
        // Director 1
        Director linkDirector1 = new Director("Woody Alex", "Colombia", 2005);

        // Pelicula 1
        Pelicula linkPelicula1 = new Pelicula("Apocalipsis", 2005, linkDirector1);

        linkPelicula1.impresion();
    }
}
