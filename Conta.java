
public abstract class Conta extends Pagavel{
	protected int dia;
	protected int mes;
	protected double valor;
	
	public int getDia() {
		return this.dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return this.mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public double getValor() {
		return this.valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
