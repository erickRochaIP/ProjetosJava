import java.lang.Math;

public class Quadrado extends Bidimensional{
	private double lado;
	
	public Quadrado(double lado) {
		setLado(lado);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = Math.abs(lado);
		if(lado == 0) {
			System.out.println("Lado fornecido igual a 0. Criando Quadrado padrao");
			this.lado = 1;
		}
	}
	
	public double obterArea() {
		return Math.pow(lado, 2);
	}
}
