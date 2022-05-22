import java.lang.Math;

public class Circulo extends Bidimensional{
	private double raio;
	
	public Circulo(double raio) {
		setRaio(raio);
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		// vamos manter o raio positivo e maior que 0
		this.raio = Math.abs(raio);
		if (raio == 0) {
			System.out.println("Raio fornecido igual a 0. Criando circulo padrao");
			this.raio = 1;	
		}
	}

	public double obterArea() {
		return Math.PI * Math.pow(raio, 2);
	}
}
