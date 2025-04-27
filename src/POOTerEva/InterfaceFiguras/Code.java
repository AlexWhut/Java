package POOTerEva.InterfaceFiguras;

import java.util.ArrayList;
import java.util.List;

public class Code {
    private List<Figura> figuras;

    public Code() {
        figuras = new ArrayList<>();

        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Triangulo triangulo = new Triangulo(3);

        figuras.add(circulo);
        figuras.add(rectangulo);
        figuras.add(triangulo);

        asignarColores();
    }

    private void asignarColores() {
        String[] colores = {"Rojo", "Azul", "Verde"};
        int i = 0;
        for (Figura figura : figuras) {
            if (figura instanceof Coloreable) {
                ((Coloreable) figura).cambiarColor(colores[i++]);
            }
        }
    }

    public List<Figura> getFiguras() {
        return figuras;
    }
}
