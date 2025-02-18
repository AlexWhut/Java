package POO.Basicos.BasicoUno;

public class Test {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 10);
        Figura cuadrado = new Cuadrado(4);
        Figura triangulo = new Triangulo(6, 8);

        System.out.println(rectangulo);
        System.out.println(cuadrado);
        System.out.println(triangulo);
    }
}
