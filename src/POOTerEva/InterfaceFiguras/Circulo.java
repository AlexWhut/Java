package POOTerEva.InterfaceFiguras;

class Circulo extends Figura implements Transformable, Coloreable {
    private double radio;
    private String color;

    public Circulo(double radio) {
        this.radio = radio;
        this.color = "Sin color";
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void escalar(double factor) {
        radio *= factor;
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

