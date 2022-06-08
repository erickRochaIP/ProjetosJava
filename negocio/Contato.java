package negocio;
import servicos.Salvable;

public class Contato implements Salvable {
	
	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	
	public Contato() {}
	
	public Contato(String nome, String telefone, String endereco, String email) {
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setEndereco(endereco);
		this.setEmail(email);
	}
	
	public String formatted() {
		return getNome()+";"+getTelefone()+";"+getEndereco()+";"+getEmail();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
