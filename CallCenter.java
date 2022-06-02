import java.util.Scanner;

public class CallCenter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SuporteTecnico supTec = new SuporteTecnico();
		
		System.out.println("Bem vindo ao sistema de Suporte Tecnico");
		System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema");
		String problema = scan.nextLine();
		
		while (!problema.equals("sair") && !problema.equals("")) {
			System.out.println(supTec.buscarSolucao(problema));
			System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema");
			problema = scan.nextLine();
		}
		System.out.println("Obrigado por utilizar nosssos servicos");
		
		scan.close();
	}

}
