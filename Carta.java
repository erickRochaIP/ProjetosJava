package baralho;

public class Carta {
	private int valor;
	private String naipe;
	
	public Carta() {
		this.valor = 0;
		this.naipe = "";
	}
	
	public Carta(int valor, String naipe) {
		this.valor = valor;
		this.naipe = naipe;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getNaipe() {
		return naipe;
	}
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	
	public int compararCom(Carta outraCarta) {
		if(this.valor > outraCarta.getValor())
			return 1;
		if(this.valor < outraCarta.getValor())
			return -1;
		if(this.naipe.equals("Ouros") && !outraCarta.getNaipe().equals("Ouros"))
			return 1;
		if(!this.naipe.equals("Ouros") && outraCarta.getNaipe().equals("Ouros"))
			return -1;
		
		return 0;
	}
	
	public boolean compararNaipe(Carta outraCarta) {
		return this.naipe.equals(outraCarta.getNaipe());
	}
	
	public String print() {
		return this.getValor() + " de " + this.getNaipe();
	}
}
