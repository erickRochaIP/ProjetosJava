
public class Contador {
	private int limite;
	private int valor;
	
	public Contador(int limite, int valor)
	{
		this.limite = limite;
		this.valor = valor;
	}
	
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int contar()
	{
		valor = (valor + 1) % limite;
		return valor;
	}
	
	public String getValorString()
	{
		return String.format("%02d", valor);
	}
	
}
