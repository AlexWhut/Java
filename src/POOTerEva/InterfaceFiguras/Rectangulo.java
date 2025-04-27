package POOTerEva.InterfaceFiguras;

class Rectangulo extends Figura implements Transformable, Coloreable {
    private double base;
    private double altura;
    private String color;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.color = "Sin color";
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void escalar(double factor) {
        base *= factor;
        altura *= factor;
    }

    @Override
    public void cambiarColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}