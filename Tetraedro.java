import java.lang.Math;

public class Tetraedro extends Tridimensional{
	// tetraedro regular
	private double lado;
	
	public Tetraedro(double lado) {
		setLado(lado);
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		// vamos manter o lado positivo e maior que 0
		this.lado = Math.abs(lado);
		if (lado == 0) {
			System.out.println("Lado fornecido igual a 0. Criando Tetraedro padrao");
			this.lado = 1;
		}
	}

	public double obterArea() {
		// formula da area do tetraedro
		return Math.sqrt(3) * Math.pow(lado, 2);
	}
	
	public double obterVolume() {
		// formula do volume do tetraedro
		return (Math.sqrt(2) * Math.pow(lado, 3))/12;
	}
}
