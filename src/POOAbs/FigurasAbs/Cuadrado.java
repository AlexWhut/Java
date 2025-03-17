package POOAbs.FigurasAbs;

public class Cuadrado  extends Figura{
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }

    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado: \n"+"Area> " + calcularArea() + "\n" + //
                "Perimetro> " + calcularPerimetro();
    }

}
