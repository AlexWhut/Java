package POO.InstanceOf;

public abstract class Figura {
    protected float altura;
    protected float base;

	
	//constructor
	public Figura(float altura, float base) {
		this.altura = altura;
		this.base = base;
	}
	
	public abstract float area();
	public abstract float perimetro();


    @Override
    public String toString() {
        return "Figura sin datos";
    }

}
