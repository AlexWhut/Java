package POOTerEva.InterfaceFiguras;

public class Test {
    public static void main(String[] args) {
        Code main = new Code();
        
        System.out.println("Figuras originales:\n");
        for (Figura figura : main.getFiguras()) {
            mostrarInformacion(figura);
        }

        System.out.println("\nDespués de escalar:\n");
        for (Figura figura : main.getFiguras()) {
            if (figura instanceof Transformable) {
                ((Transformable) figura).escalar(2.0);
            }
            mostrarInformacion(figura);
        }
    }

    private static void mostrarInformacion(Figura figura) {
        System.out.println("Figura: " + figura.getClass().getSimpleName());
        System.out.printf("Área: %.2f\n", figura.calcularArea());
        System.out.printf("Perímetro: %.2f\n", figura.calcularPerimetro());
        if (figura instanceof Coloreable) {
            System.out.println("Color: " + ((Coloreable) figura).getColor());
        }
        System.out.println();
    }
}

