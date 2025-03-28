package POOAbs.FigurasAbs;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(String name, double base, double altura, double lado1, double lado2, double lado3) {
        super(name);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    @Override
    public double calcularArea(){
        return(base * altura) / 2;
    }

    @Override
    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Triangulo: \n"+"Area> " + calcularArea() + "\n" + //
                "Perimetro> " + calcularPerimetro();
    }    

}
