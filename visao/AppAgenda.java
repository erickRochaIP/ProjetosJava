package visao;

import negocio.*;

public class AppAgenda {
	
	private static void consultarDados(String nome, Agenda agenda) {
		if (agenda.existeContato(nome)) {
			Contato cont = agenda.consultarContato(nome);
			System.out.println("Dados do " + cont.getNome());
			System.out.println("Numero: " + cont.getTelefone());
			System.out.println("Endereco: " + cont.getEndereco());
			System.out.println("Email: " + cont.getEmail());
		}
		else
			System.out.println("Não existe o " + nome);
	}
	
	public static void main(String[] args) {
		// cria agenda e adiciona contatos
		Agenda agenda = new Agenda();
		agenda.incluirContato(new Contato("Arnaldo", "98217321", "Rua dos bobos", "Arnaldo@gmail.com"));
		agenda.incluirContato(new Contato("Bernardo", "988712", "Rua dos alegres", "Bern@gmail.com"));
		agenda.incluirContato(new Contato("Covauski", "9543245", "Rua dos espertos", "Covausk@gmail.com"));
		agenda.incluirContato(new Contato("Denarius", "9566852324", "Rua dos legais", "Denar@gmail.com"));
		
		// consulta os dados de alguns contatos
		consultarDados("Marcos", agenda);
		consultarDados("Arnaldo", agenda);
		
		// salva contatos
		agenda.persistirAgenda();
		
		// remove um contato
		agenda.removerContato("Arnaldo");
		consultarDados("Arnaldo", agenda);
		
		// recupera contatos salvos
		agenda.lerAgenda();
		consultarDados("Arnaldo", agenda);
		
	}
}
