import java.util.ArrayList;

public class ControlePagamento {
	public static final double salario = 1212;
	public static final double hora = 30;
	
	private ArrayList<Pagavel> pagamentos;
	
	public ControlePagamento() {
		pagamentos = new ArrayList<Pagavel>();
	}

	public ArrayList<Pagavel> getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(ArrayList<Pagavel> pagamentos) {
		this.pagamentos = pagamentos;
	}
	public void addPagamento(Pagavel pagavel) {
		this.getPagamentos().add(pagavel);
	}
	public void exibirResumoPagamento(int diaPagto, int mesPagto) {
		double total = 0;
		
		for(Pagavel pag : this.getPagamentos())
		{
			total += pag.getValorAPagar(diaPagto, mesPagto);
			if (pag instanceof Empregado)
			{
				Empregado emp = (Empregado)pag;
				System.out.print("Empregado: " + emp.getNome() + " " + emp.getSobrenome() + " (" + emp.getNumIdent() + ") - ");
				System.out.println("Valor a pagar: " + emp.getValorAPagar(diaPagto, mesPagto));
			}
			else if (pag instanceof Conta)
			{
				Conta cont = (Conta)pag;
				System.out.println("Conta - Valor a pagar: " + cont.getValorAPagar(diaPagto, mesPagto));
			}
		}
		
		System.out.println("Total a pagar: " + total);
	}
}
