package POOAbs.FigurasAbs;

public class Test {
    public static void main(String[] args) {
        
        Figura cuadrado1 = new Cuadrado("Cuadrado01",05);
        Figura ciruclo1 = new Circulo("Circulo", 20);
        Figura triangulo1 = new Triangulo("Triangulo", 4, 3, 3, 3, 5);


        System.out.println(cuadrado1);
        System.out.println(ciruclo1);
        System.out.println(triangulo1);

    }
}
