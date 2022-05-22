import java.lang.Math;

public class Triangulo extends Bidimensional{
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo (double a, double b, double c) {
		setLados(a,b,c);
	}

	public double getLadoA() {
		return ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}
	
	public void setLados(double a, double b, double c) {
		// condicao de existencia do triangulo
		if (a > 0 && b > 0 && c >0
			&& (b+c) > a && a > Math.abs(b-c)
			&& (a+c) > b && b > Math.abs(a-c)
			&& (a+b) > c && c > Math.abs(a-b)) {
				this.ladoA = a;
				this.ladoB = b;
				this.ladoC = c;
		}
		else {
			System.out.println("Lados fornecidos nao formam um triangulo. Criando triangulo padrao");
			this.ladoA = 1;
			this.ladoB = 1;
			this.ladoC = 1;
		}
	}
	
	// formula de Heron
	public double obterArea() {
		double p = (ladoA + ladoB + ladoC)/2;
		
		return Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
	}
}
