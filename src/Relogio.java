
public class Relogio {
	private Contador horas;
	private Contador minutos;
	
	public Relogio()
	{
		horas = new Contador(24, 0);
		minutos = new Contador(60, 0);
	}
	
	public Contador getHoras()
	{
		return this.horas;
	}
	public void setHoras(Contador horas)
	{
		this.horas = horas;
	}
	public Contador getMinutos()
	{
		return this.minutos;
	}
	public void setMinutos(Contador minutos)
	{
		this.minutos = minutos;
	}
	
	public void ticTac()
	{
		if (this.minutos.contar() == 0)
			this.horas.contar();
	}
	
	public String getRelogioFormato24()
	{
		return horas.getValorString() + ":" + minutos.getValorString();
	}
	
	public String getRelogioFormato12()
	{
		if (!passouDeUmaDaTarde())
			return getRelogioFormato24() + " a.m";
		return String.format("%02d", horas.getValor() - 12) + ":" + minutos.getValorString() + " p.m";
	}
	
	public boolean saoZeroHora()
	{
		return horas.getValor() == 0 && minutos.getValor() == 0;
	}
	
	private boolean passouDeUmaDaTarde()
	{
		return horas.getValor() > 12;
	}
	
}
