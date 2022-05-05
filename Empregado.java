
public abstract class Empregado extends Pagavel {
	protected String nome;
	protected String sobrenome;
	protected int numIdent;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getNumIdent() {
		return this.numIdent;
	}
	public void setNumIdent(int numIdent) {
		this.numIdent = numIdent;
	}
}
