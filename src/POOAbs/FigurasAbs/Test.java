package POOAbs.FigurasAbs;

public class Test {
    public static void main(String[] args) {
        
        Figura cuadrado1 = new Cuadrado(05);
        Figura ciruclo1 = new Circulo(20);
        Figura triangulo1 = new Triangulo(4, 3, 3, 3, 5);


        System.out.println(cuadrado1);
        System.out.println(ciruclo1);
        System.out.println(triangulo1);

    }
}
