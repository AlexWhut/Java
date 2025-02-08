package POO.Pajaro;

public class Test {
    public static void main(String[] args) {
        Pajaro thePajaro001 = new Pajaro(1, "Colombia", "Amarillo");
        Pajaro thePajaro002 = new Pajaro(2, "Brasil", "Blanco");
        Pajaro thePajaro003 = new Pajaro(3, "Mexico", "Verde");
        Pajaro thePajaro004 = new Pajaro(4, "EEUU", "Blanco");
        Pajaro thePajaro005 = new Pajaro(5, "Argentina", "Azul");

        System.out.println(thePajaro001);
        System.out.println(thePajaro002);
        System.out.println(thePajaro003);
        System.out.println(thePajaro004);
        System.out.println(thePajaro005);
    }
}
