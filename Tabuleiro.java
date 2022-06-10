package principal_ErickRocha_GabrielTalim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Tabuleiro {
     
	private Casa casas[][];
	private HashMap<Integer, ArrayList<Escolha>> escolhas;
	
	public Tabuleiro(){
		casas = new Casa[10][10];
		
		for(int i =0; i<10;i++) {
			for(int j=0;j<10;j++) {
				casas[i][j] = new Casa();
			}
		}
		escolhas = new HashMap<Integer, ArrayList<Escolha>>();
		escolhas.put(0, new ArrayList<Escolha>());
		escolhas.put(1, new ArrayList<Escolha>());
	}
	
	public void adicionarPeca(int linha, int coluna, int tipo) throws Exception{
		testarExistencia(linha, coluna,tipo);
		casas[linha][coluna].adicionarPeca(new Peca(tipo));
	}
	public void testarExistencia(int linha, int coluna, int tipo) throws Exception{
		if(linha>9 || coluna>9 || linha < 0 || coluna <0) {
			throw new Exception("Linha e coluna deve estar entre 0 e 9");
		}
		if(casas[linha][coluna].estaCheia()) {
			throw new Exception("Esta casa ja esta ocupada");
		}
		if(this.escolhas.get(tipo).size() > 0 &&
				!(new Escolha(linha, coluna).estaEm(this.escolhas.get(tipo)))) {
			throw new Exception("Essa casa nao esta nas suas escolhas");
		}
		
		
	}
	public void mostrarTabuleiro() {
		
		System.out.println(" |0|1|2|3|4|5|6|7|8|9|");
		
		for(int i =0; i<10;i++) {
			System.out.println("----------------------");
			System.out.print(i + "|");
			for(int j=0;j<10;j++) {
				casas[i][j].mostrarCasa();
				System.out.print("|");
			}
			System.out.println();
		}
	
	}
	public boolean existeSequencia (int i ,int j) {
		int tipo = casas[i][j].getTipoPeca();
		if (tipo == -1)
				return false;
		
		// sequencia na vertical
		if (i <= 5) {
			if(casas[i+1][j].getTipoPeca() == tipo &&
				casas[i+2][j].getTipoPeca() == tipo &&
				casas[i+3][j].getTipoPeca() == tipo &&
				casas[i+4][j].getTipoPeca() == tipo) {
				return true;
			}
		}
		
		// sequencia na horizontal
		if (j <= 5) {
			if(casas[i][j+1].getTipoPeca() == tipo &&
				casas[i][j+2].getTipoPeca() == tipo &&
				casas[i][j+3].getTipoPeca() == tipo &&
				casas[i][j+4].getTipoPeca() == tipo) {
				return true;
			}
		}
		
		// sequencia na diagonal
		if (i <= 5 && j <= 5) {
			if(casas[i+1][j+1].getTipoPeca() == tipo &&
					casas[i+2][j+2].getTipoPeca() == tipo &&
					casas[i+3][j+3].getTipoPeca() == tipo &&
					casas[i+4][j+4].getTipoPeca() == tipo) {
					return true;
				}
		}
		
		// sequencia na diagonal
		if (i <= 5 && j >= 4) {
			if(casas[i+1][j-1].getTipoPeca() == tipo &&
					casas[i+2][j-2].getTipoPeca() == tipo &&
					casas[i+3][j-3].getTipoPeca() == tipo &&
					casas[i+4][j-4].getTipoPeca() == tipo) {
					return true;
				}
		}
		
		return false;
		
	}
	public int quemGanhou() {
		
		for(int i =0; i<10;i++) {
			
			for(int j=0;j<10;j++) {
				if(existeSequencia(i, j))
					return this.casas[i][j].getTipoPeca();
			}
		}
		
		return -1;
	}
	public boolean tabuleiroCheio() {
		for(int i =0; i<10;i++) {
			
			for(int j=0;j<10;j++) {
				if( ! this.casas[i][j].estaCheia()){
					return false;
				}
				
			}
		}
		return true;
	}
	public boolean jogoAcabou() {
		return (quemGanhou()!= -1 || tabuleiroCheio());
			
		
	}
	
	public void printOpcoesJogador(int jogador) {
		System.out.println("Escolhas disponiveis para o jogador " + jogador+":");
		if (this.escolhas.get(jogador).size() == 0) {
			System.out.println("Qualquer casa!");
		}else {
			for(Escolha escolha : this.escolhas.get(jogador)) {
				System.out.print("(" + escolha.getColuna() + ", " + escolha.getLinha() + ") ");
			}
			System.out.println();
		}
	}
	
	public void limparEscolhas(int jogador) {
		this.escolhas.remove(jogador);
		this.escolhas.put(jogador, new ArrayList<Escolha>());
	}
	
	public void adicionarEscolha(int linha, int coluna, int jogador) throws Exception {
		testarExistenciaEscolha(linha, coluna, jogador);
		this.escolhas.get(jogador).add(new Escolha(linha, coluna));
	}
	
	public void testarExistenciaEscolha(int linha, int coluna, int tipo) throws Exception{
		if(linha>9 || coluna>9 || linha < 0 || coluna <0) {
			throw new Exception("Linha e coluna deve estar entre 0 e 9");
		}
		if(casas[linha][coluna].estaCheia()) {
			throw new Exception("Esta casa ja esta ocupada");
		}
		
		
	}
}
