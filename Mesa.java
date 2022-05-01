import java.util.Scanner;

public class Mesa {
	
	private static boolean jogarRodada()
	{
		Baralho baralho = new Baralho();
		System.out.println("Mesa embaralhando....");
		baralho.embaralhar();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o número de cartas a distribuir para os jogadores:");
		int n = scan.nextInt();
		
		Jogador a = new Jogador(n);
		Jogador b = new Jogador(n);
		
		System.out.println("Mesa distribui as " + n + " cartas para jogador A e para o jogador B.");
		a.setMao(baralho.darCartas(a.getTamanho()));
		b.setMao(baralho.darCartas(b.getTamanho()));
		
		Carta cartaA = a.getMaiorCarta();
		Carta cartaB = b.getMaiorCarta();
		
		System.out.println("O jogador A joga a carta de naipe " + cartaA.getNaipe() + " de valor " + cartaA.getValor());
		System.out.println("O jogador B joga a carta de naipe " + cartaB.getNaipe() + " de valor " + cartaB.getValor());
		
		int result = cartaA.compararCom(cartaB);
		
		if (result == 1)
			System.out.println("O jogador A venceu o jogo.");
		else if (result == -1)
			System.out.println("O jogador B venceu o jogo.");
		else
			System.out.println("Como os valores das cartas são iguais e nenhum jogador tem cartas de Ouros, o jogo ficou empatado!");
		
		return result == 0;
	}

	public static void main(String[] args) {
		while(jogarRodada())
			System.out.println("Jogando novamente...");

	}

}
