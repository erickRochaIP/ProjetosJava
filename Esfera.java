import java.lang.Math;

public class Esfera extends Tridimensional{
	private double raio;
	
	public Esfera(double raio) {
		setRaio(raio);
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		// vamos manter o raio positivo e maior que 0
		this.raio = Math.abs(raio);
		if (raio == 0)
		{
			System.out.println("Raio fornecido igual a 0. Criando Esfera padrao");
			this.raio = 1;
		}
	}

	public double obterArea() {
		// formula da area da esfera
		return 4 * Math.PI * Math.pow(raio, 2);
	}
	
	public double obterVolume() {
		// formula do volume da esfera
		return (4 * Math.PI * Math.pow(raio, 3))/3;
	}
}
