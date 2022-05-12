
public class Titulo extends Conta{
	public double getValorAPagar(int diaPagto, int mesPagto)
	{
		if (mesPagto > this.mes || (mesPagto == this.mes && diaPagto > this.dia))
			return this.valor*1.1;
		return this.valor;
	}
}
