package interfaces.exercicio1;

public class Retangulo implements AreaCalculavel{
		
	private double altura;
	private double base;
	
	public Retangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calculaArea() {
		return altura*base;
	}

	public double getAltura() {
		return altura;
	}

	public double getBase() {
		return base;
	}
	
	
	
}
