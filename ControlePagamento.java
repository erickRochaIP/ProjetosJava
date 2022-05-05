import java.util.ArrayList;

public class ControlePagamento {
	public static final double salario = 1212;
	public static final double hora = 30;
	
	private ArrayList<Pagavel> pagamentos;

	public ArrayList<Pagavel> getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(ArrayList<Pagavel> pagamentos) {
		this.pagamentos = pagamentos;
	}
}
