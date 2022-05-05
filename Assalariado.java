
public class Assalariado extends Empregado{
	private double horasExtras;
	
	public double getValorAPagar(int diaPagto, int mesPagto)
	{
		return ControlePagamento.salario + (this.horasExtras * ControlePagamento.hora);
	}
}
