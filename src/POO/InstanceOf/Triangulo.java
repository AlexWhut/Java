package POO.InstanceOf;

public class Triangulo extends Figura {
    public Triangulo(float altura, float base) {
        super(altura, base);
    }

    @Override
    public float area() {
        return (base * altura) / 2;
    }

    @Override
    public float perimetro() {
        return base + 2 * (float) Math.sqrt((altura * altura) + (base / 2) * (base / 2));
    }

    @Override
    public String toString() {
        return "Triángulo [altura: " + altura + ", base: " + base + ", área: " + area() + ", perímetro: " + perimetro() + "]";
    }
}
