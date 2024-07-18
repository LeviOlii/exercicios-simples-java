package interfaces.exercicio1;

public class TestaAreas {

	public static void main(String[] args) {

		Circulo circulo = new Circulo(5.0);
		Retangulo retangulo = new Retangulo(2.0, 7.0);
		Quadrado quadrado = new Quadrado(12.0);
		
		System.out.printf("Círculo:\n\nRaio: %.2f\nÁrea: %.2f\n", circulo.getRaio(), circulo.calculaArea());
		System.out.printf("\nRetangulo:\n\nBase: %.2f\nAltura: %.2f\nÁrea: %.2f\n", retangulo.getBase(), retangulo.getAltura() ,retangulo.calculaArea());
		System.out.printf("\nQuadrado:\n\nLado: %.2f\nÁrea: %.2f\n", quadrado.getLado() ,quadrado.calculaArea());
		
		
	}

}
