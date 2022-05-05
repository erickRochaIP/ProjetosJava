
public class Terceirizado extends Empregado{
	private double horasTrabalhadas;
	
	public double getValorAPagar(int diaPagto, int mesPagto)
	{
		return this.getHorasTrabalhadas() * ControlePagamento.hora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
}
