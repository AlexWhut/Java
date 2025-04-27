package POOTerEva.InterfaceFiguras;

class Triangulo extends Figura implements Transformable, Coloreable {
    private double lado;
    private String color;

    public Triangulo(double lado) {
        this.lado = lado;
        this.color = "Sin color";
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }

    @Override
    public void escalar(double factor) {
        lado *= factor;
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
