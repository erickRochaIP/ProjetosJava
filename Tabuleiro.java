package principal_ErickRocha_GabrielTalim;

public class Tabuleiro {
     
	private Casa casas[][];
	
	public Tabuleiro(){
		casas = new Casa[10][10];
		
		for(int i =0; i<10;i++) {
			for(int j=0;j<10;j++) {
				casas[i][j] = new Casa();
			}
		}
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
		
		
	}
	public void mostrarTabuleiro() {
		
		
		
		for(int i =0; i<10;i++) {
	
			for(int j=0;j<10;j++) {
				casas[i][j].mostrarCasa();
			}
			System.out.println();
		}
	
	}
	public boolean existeSequencia (int i ,int j) {
		int tipo = casas[i][j].getTipoPeca();
		if (tipo == -1)
				return false;
		
		if (i <= 5) {
			if(casas[i+1][j].getTipoPeca() == tipo &&
				casas[i+2][j].getTipoPeca() == tipo &&
				casas[i+3][j].getTipoPeca() == tipo &&
				casas[i+4][j].getTipoPeca() == tipo) {
				return true;
			}
		}
		
		if (j <= 5) {
			if(casas[i][j+1].getTipoPeca() == tipo &&
				casas[i][j+2].getTipoPeca() == tipo &&
				casas[i][j+3].getTipoPeca() == tipo &&
				casas[i][j+4].getTipoPeca() == tipo) {
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
		
}
