
public class TesteRelogio {
	public static void main(String[] args)
	{
		Relogio relogio = new Relogio();
		
		do
		{
			System.out.println(relogio.getRelogioFormato12());
			//System.out.println(relogio.getRelogioFormato12());
			relogio.ticTac();
		}while(!relogio.saoZeroHora());
	}
}
