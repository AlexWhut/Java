package POO.Basicos.BasicoUno;

public class Rectangulo extends Figura {
    public Rectangulo(float altura, float base) {
        super(altura, base);
    }

    @Override
    public float area() {
        return altura * base;
    }

    @Override
    public float perimetro() {
        return 2 * (altura + base);
    }

    @Override
    public String toString() {
        return "Rectángulo [altura: " + altura + ", base: " + base + ", área: " + area() + ", perímetro: " + perimetro() + "]";
    }
}
