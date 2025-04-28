package POOTerEva.Palindroma;

public class Test {
    public static void main(String[] args) {
        Palindroma prueba1 = new Palindroma("Anita lava la tina");
        System.out.println("¿Es palíndromo? " + prueba1.esPalindromo());

        Palindroma prueba2 = new Palindroma("Hola mundo");
        System.out.println("¿Es palíndromo? " + prueba2.esPalindromo());

        Palindroma prueba3 = new Palindroma("Reconocer");
        System.out.println("¿Es palíndromo? " + prueba3.esPalindromo());
    }
}