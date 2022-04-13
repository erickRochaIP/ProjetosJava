
import java.util.Scanner;

public class TesteRelogio {
	
	private static void printarRelogio12horas()
	{
		Relogio relogio = new Relogio();
		
		do
		{
			System.out.println(relogio.getRelogioFormato12());
			relogio.ticTac();
		}while(!relogio.saoZeroHora());
	}
	
	private static void printarRelogio24horas()
	{
		Relogio relogio = new Relogio();
		
		do
		{
			System.out.println(relogio.getRelogioFormato24());
			relogio.ticTac();
		}while(!relogio.saoZeroHora());
	}
	
	
	private static void printarErro()
	{
		System.out.println("Prezado Usuario,");
		System.out.println("");
		System.out.println("As opções são 1 ou 2.");
		System.out.println("");
		System.out.println("Atenciosamente,");
		System.out.println("");
		System.out.println("Erick");
	}
	
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("Qual formato voce quer?");
		System.out.println("1) Formato 12 horas");
		System.out.println("2) Formato 24 horas");
		
		int resposta = entrada.nextInt();
		
		switch(resposta)
		{
			case 1:
				printarRelogio12horas();
				break;
			case 2:
				printarRelogio24horas();
				break;
			default:
				printarErro();
		}
		
	}
}
