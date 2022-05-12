
public class AssalariadoComissionado extends Comissionado{
	private double percentualBonus;
	
	public double getValorAPagar(int diaPagto, int mesPagto)
	{
		return (ControlePagamento.salario * 1.1) + (this.getValorVendas() * this.getPercentualBonus());
	}
	
	public double getPercentualBonus() {
		return this.percentualBonus;
	}
	public void setPercentualBonus(double percentualBonus) {
		this.percentualBonus = percentualBonus;
	}
}
