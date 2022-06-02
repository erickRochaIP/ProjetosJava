import java.util.HashSet;

public class Interpretadora {
	private HashSet<String> palavraChave;
	
	public Interpretadora(String problema)
	{
		palavraChave = new HashSet<String>();
		
		for (String palavra : problema.split(" ")) {
			palavraChave.add(palavra);
		}
	}
	
	public HashSet<String> getPalavraChave(){
		return this.palavraChave;
	}
}
