package interfaces.exercicio1;

public class Circulo implements AreaCalculavel{
	
	private double raio;
	
	
	
	public Circulo(double raio) {
		this.raio = raio;
	}



	public double getRaio() {
		return raio;
	}



	@Override
	public double calculaArea() {
		return (Math.PI * Math.pow(raio, 2));
	}
	
}
