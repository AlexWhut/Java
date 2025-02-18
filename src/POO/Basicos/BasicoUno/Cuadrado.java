package POO.Basicos.BasicoUno;

public class Cuadrado extends Figura {
    public Cuadrado(float lado) {
        super(lado, lado);
    }

    @Override
    public float area() {
        return altura * altura;
    }

    @Override
    public float perimetro() {
        return 4 * altura;
    }

    @Override
    public String toString() {
        return "Cuadrado [lado: " + altura + ", área: " + area() + ", perímetro: " + perimetro() + "]";
    }
}
