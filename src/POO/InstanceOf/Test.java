package POO.InstanceOf;

public class Test {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 10);
        Figura cuadrado = new Cuadrado(4);
        Figura triangulo = new Triangulo(6, 8);

        // Verificar con instanceof
        System.out.println("¿rectangulo es un Rectangulo? " + (rectangulo instanceof Rectangulo)); // true
        System.out.println("¿cuadrado es un Cuadrado? " + (cuadrado instanceof Cuadrado)); // true
        System.out.println("¿triangulo es un Triangulo? " + (triangulo instanceof Triangulo)); // true

        // Verificar si son instancias de la clase padre
        System.out.println("¿rectangulo es una Figura? " + (rectangulo instanceof Figura)); // true
        System.out.println("¿cuadrado es una Figura? " + (cuadrado instanceof Figura)); // true
        System.out.println("¿triangulo es una Figura? " + (triangulo instanceof Figura)); // true

        // Verificar si un Rectangulo es un Cuadrado (esto es falso)
        System.out.println("¿rectangulo es un Cuadrado? " + (rectangulo instanceof Cuadrado)); // false
    }
}
