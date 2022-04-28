package baralho;

import java.security.*;

public class Baralho {
	private Carta[] cartas;
	private int primeiraPos;
	private String[] naipes = {"Ouros", "Paus", "Copas", "Espadas"};
	
	public Baralho() {
		this.cartas = new Carta[52];
		encherBaralhoZerado();
	}
	
	private void encherBaralhoZerado() {
		int k = 0;
		for (int i = 0; i < naipes.length; i++) {
			for (int j = 1; j <= 13; j++) {
				this.cartas[k] = new Carta(j, this.naipes[i]);
				k += 1;
			}
		}
		this.primeiraPos = 0;
	}
	
	public void embaralhar() {
		SecureRandom random = new SecureRandom();
		byte bytes[] = new byte[20];
		random.nextBytes(bytes);
		
		for (int i = 0; i < 52; i++) {
			int r = Math.abs(random.nextInt()%52);
			Carta temp = cartas[i];
			cartas[i] = cartas[r];
			cartas[r] = temp;
		}
	}
	
	public Carta[] darCartas(int quantidade) {
		if (primeiraPos + quantidade > 52)
			return null;
		
		Carta[] c = new Carta[quantidade];
		for(int i = 0; i < quantidade; i++) {
			c[i] = this.cartas[primeiraPos + i];
			this.cartas[primeiraPos + i] = null;
		}
		primeiraPos += quantidade;
		
		if (primeiraPos >= 52) {
			encherBaralhoZerado();
			embaralhar();
		}
		
		return c;
	}
}
