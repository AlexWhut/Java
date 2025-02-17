package POO.Basicos.BasicoUno;

public class Test {
    public static void main(String[] args) {
		/*Crear una clase Rectángulo, con atributos base y altura. 
        Crear también el constructor de la clase y los métodos necesarios 
        para calcular el área y el perímetro. Crear otra clase PruebaRectangulo 
        que pruebe varios rectángulos y muestre por pantalla sus áreas y perímetros. */
       
    Figura rectangulo1 = new Figura(15, 2);
		Figura rectangulo2 = new Figura(2, 2);
		Figura rectangulo3 = new Figura(1, 4);
		
		System.out.println("1: " + rectangulo1);
		System.out.println("2: " + rectangulo2);
		System.out.println("3: " + rectangulo3);
    }
}
