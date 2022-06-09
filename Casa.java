package principal_ErickRocha_GabrielTalim;

public class Casa {

	private Peca peca;
	
	public Casa() {
		peca=null;
	}
	
	public void adicionarPeca(Peca peca){
		this.peca=peca;
	}
	
	public int getTipoPeca() {
		if (!estaCheia())
			return -1;
		
		return this.peca.getTipo();
	}
	
	public boolean estaCheia() {
		return this.peca != null;
	}
	public void mostrarCasa() {
		if(peca==null) {
			System.out.print(" ");
		}
		else {
			System.out.print(peca.getTipo());
		}
	}
}
