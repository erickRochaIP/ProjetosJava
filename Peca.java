package principal_ErickRocha_GabrielTalim;

public class Peca {
	private int tipo;
	
	public Peca(int tipo) {
		this.tipo = tipo;
		if (this.tipo < 0)
			this.tipo = 0;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	
}
