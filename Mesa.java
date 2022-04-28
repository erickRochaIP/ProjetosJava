package baralho;

public class Mesa {

	public static void main(String[] args) {
		int n = 5;
		
		Jogador a = new Jogador(n);
		Jogador b = new Jogador(n);
		
		Baralho baralho = new Baralho();
		baralho.embaralhar();
		
		a.setMao(baralho.darCartas(a.getTamanho()));
		b.setMao(baralho.darCartas(b.getTamanho()));
		
		System.out.println(a.getMaiorCarta().print());
		System.out.println(b.getMaiorCarta().print());

	}

}
