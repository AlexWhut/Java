package POOAbs.FigurasAbs;

public class Circulo extends Figura{
    
    private double radio;
    
    public Circulo(String name, double radio) {
        super(name);
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo: \n"+"Area> " + calcularArea() + "\n" + //
                "Perimetro> " + calcularPerimetro();
    }
}
