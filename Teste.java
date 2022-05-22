
public class Teste {

	public static void main(String[] args) {
		CaixaDeBrinquedo caixa = new CaixaDeBrinquedo();
		
		caixa.addForma(new Triangulo(3, 4, 5));
		caixa.addForma(new Circulo(8));
		caixa.addForma(new Quadrado(7));
		caixa.addForma(new Tetraedro(7));
		caixa.addForma(new Esfera(2));
		caixa.addForma(new Cubo(8));
		
		// adicionando formas invalidas no final
		caixa.addForma(new Triangulo(1,2,3));
		caixa.addForma(new Circulo(0));
		caixa.addForma(new Quadrado(0));
		caixa.addForma(new Tetraedro(0));
		caixa.addForma(new Esfera(0));
		caixa.addForma(new Cubo(0));

		caixa.listFormas();
	}

}
