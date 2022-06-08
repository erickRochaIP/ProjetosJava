package negocio;

import java.util.ArrayList;
import java.util.HashMap;

import servicos.Salvable;

public class Agenda {
	private HashMap<String, Contato> contatos;
	
	public Agenda() {
		contatos = new HashMap<>();
	}
	
	public boolean incluirContato(Contato contato) {
		if (existeContato(contato.getNome()))
			return false;
		
		contatos.put(contato.getNome(), contato);
		return true;
	}
	
	public boolean existeContato(String nome) {
		return contatos.keySet().contains(nome);
	}
	
	public Contato consultarContato(String nome) {
		return contatos.get(nome);
	}
	
	public void removerContato(String nome) {
		contatos.remove(nome);
	}
	
	public void removerContatos() {
		contatos = new HashMap<>();
	}
	
	public void persistirAgenda() {
		ContatoRepository contatoRep = new ContatoRepository("agendaPessoal.txt");
		
		contatoRep.deleteFile();
		
		for(String nome : this.contatos.keySet()) {
			contatoRep.writeObject(contatos.get(nome));
		}
	}
	
	public void lerAgenda() {
		removerContatos();
		
		ContatoRepository contatoRep = new ContatoRepository("agendaPessoal.txt");
		ArrayList<Salvable> listContatos;
		listContatos = contatoRep.readFile();
		
		for (Salvable salv : listContatos)
			incluirContato((Contato)salv);
	}
}
