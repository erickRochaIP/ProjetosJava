public class Jogador {
	private Carta[] mao;
	private int tamanho;
	
	public Jogador(int tamanho)
	{
		this.setTamanho(tamanho);
	}

	public Carta[] getMao() {
		return mao;
	}

	public void setMao(Carta[] mao) {
		this.mao = mao;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public Carta getMaiorCarta() {
		Carta maior = mao[0];
		for(Carta c : this.mao) {
			if (c.compararCom(maior) == 1)
				maior = c;
		}
		
		return maior;
	}
}
