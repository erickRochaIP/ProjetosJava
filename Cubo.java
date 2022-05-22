
public class Cubo extends Tridimensional {
	private double lado;
	
	public Cubo(double lado) {
		setLado(lado);
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = Math.abs(lado);
		if(lado == 0) {
			System.out.println("Lado fornecido igual a 0. Criando Cubo padrao");
			this.lado = 1;
		}
	}
	
	public double obterArea() {
		// soma das 6 faces
		return Math.pow(lado, 2) * 6;
	}
	
	public double obterVolume() {
		return Math.pow(lado, 3);
	}
}
