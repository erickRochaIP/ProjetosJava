
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
		// Se chegou meio dia, mesmo formato de 24 com "a.m"
		if (!passouDeMeiDia())
			return getRelogioFormato24() + " a.m";
		
		// Se é exatamente meio dia, mesmo formato de 24 com "p.m"
		if (saoMeiDia())
			return getRelogioFormato24() + " p.m";
		
		// Senão, subtraia 12 das horas com "p.m"
		return String.format("%02d", horas.getValor() - 12) + ":" + minutos.getValorString() + " p.m";
	}
	
	public boolean saoZeroHora()
	{
		return horas.getValor() == 0 && minutos.getValor() == 0;
	}
	
	private boolean passouDeMeiDia()
	{
		return horas.getValor() >= 12;
	}
	
	private boolean saoMeiDia()
	{
		return horas.getValor() == 12;
	}
	
}
