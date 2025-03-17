package POOAbs.FigurasAbs;

public abstract class Figura {

    private String name;

    public Figura(String name) {
        this.name = name;
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Area> " + calcularArea() + "\n" + //
                "Perimetro> " + calcularPerimetro();
    }

    

}
