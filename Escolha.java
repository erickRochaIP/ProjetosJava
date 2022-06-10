package principal_ErickRocha_GabrielTalim;

import java.util.ArrayList;

public class Escolha {
	private int linha;
	private int coluna;
	
	public Escolha(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public boolean estaEm(ArrayList<Escolha> listaEscolha) {
		for(Escolha escolha : listaEscolha) {
			if(escolha.getColuna() == this.getColuna() && escolha.getLinha() == this.getLinha())
				return true;
		}
		return false;
	}
	
	
}
