package POO.Basicos.BasicoUno;

public class Figura {
    private float altura, base, area, perimetro;
	
	//constructor
	public Figura(float altura, float base) {
		this.altura = altura;
		this.base = base;
		this.area = area();
		this.perimetro = perimetro();
	}
	
	
    @Override
    public String toString() {
        return "Datos del rectangulo[altura: " + altura + "  Base: "+ base + " area: "+ area + " perimetro: "+ perimetro +"]";
    }

    public float area() {
    	return this.altura * this.base;	
    }

    public float perimetro() {
    	return (2*this.altura) + (2*this.base);	
    }

	
}
