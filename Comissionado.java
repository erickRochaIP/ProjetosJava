
public class Comissionado extends Empregado{
	private double valorVendas;
	
	public double getValorAPagar(int diaPagto, int mesPagto)
	{
		return this.getValorVendas() * 0.06;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
}
