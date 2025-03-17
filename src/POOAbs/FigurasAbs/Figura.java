package POOAbs.FigurasAbs;

public abstract class Figura {

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Area> " + calcularArea() + "\n" + //
                "Perimetro> " + calcularPerimetro();
    }

    

}
