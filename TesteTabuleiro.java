package principal_ErickRocha_GabrielTalim;

import java.util.Scanner;

public class TesteTabuleiro {

	public static void main(String[] args) {
		Jogador Erick = new Jogador(0);
		Jogador Gabriel = new Jogador(1);
		
		Scanner scan = new Scanner(System.in);
		
		int vezDe = 0;
		
		Tabuleiro tabuleiro = new Tabuleiro();
		while(!tabuleiro.jogoAcabou()) {
			tabuleiro.printOpcoesJogador(vezDe);
			System.out.println("Jogador " + vezDe + ", informe a coluna");
			int coluna = scan.nextInt();
			System.out.println("Jogador " + vezDe + ", informe a linha");
			int linha = scan.nextInt();
					
			try {
				tabuleiro.adicionarPeca(linha, coluna, vezDe);
				tabuleiro.limparEscolhas(vezDe);
				System.out.println("Informe suas opcoes de escolha pro proximo turno");
				int nEscolha = 0;
				while(nEscolha < 3) {
					try {
						System.out.println("Opcao " + nEscolha);
						System.out.println("Informe a coluna");
						int colunaEscolha = scan.nextInt();
						System.out.println("Informe a linha");
						int linhaEscolha = scan.nextInt();
						tabuleiro.adicionarEscolha(linhaEscolha, colunaEscolha, vezDe);
						nEscolha += 1;
					}catch(Exception ex) {
						System.out.println(ex.getMessage());
					}
				}
				vezDe = (vezDe + 1) % 2;
				tabuleiro.mostrarTabuleiro();
				
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			
		}
		if(tabuleiro.quemGanhou()!=-1) {
			System.out.println("Jogador " + tabuleiro.quemGanhou() + " ganhou!!!!!");
		}
		
	}
}


