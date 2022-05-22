import java.util.ArrayList;

public class CaixaDeBrinquedo {
	private ArrayList<Forma> formas;
	
	public CaixaDeBrinquedo() {
		this.formas = new ArrayList<Forma>();
	}
	
	public void addForma(Forma forma) {
		this.formas.add(forma);
	}
	
	public ArrayList<Forma> getFormas(){
		return this.formas;
	}
	
	public void listFormas() {
		for(Forma forma : this.formas) {
			if(forma instanceof Quadrado) {
				System.out.println("Eu sou um Quadrado e a minha area eh " + ((Quadrado)forma).obterArea());
			} else if(forma instanceof Circulo) {
				System.out.println("Eu sou um Circulo e a minha area eh " + ((Circulo)forma).obterArea());
			} else if(forma instanceof Triangulo) {
				System.out.println("Eu sou um Triangulo e a minha area eh " + ((Triangulo)forma).obterArea());
			} else if(forma instanceof Cubo) {
				System.out.print("Eu sou um Cubo e a minha area eh " + ((Cubo)forma).obterArea());
				System.out.println(" e o meu volume eh " + ((Cubo)forma).obterVolume());
			} else if(forma instanceof Esfera) {
				System.out.print("Eu sou um Esfera e a minha area eh " + ((Esfera)forma).obterArea());
				System.out.println(" e o meu volume eh " + ((Esfera)forma).obterVolume());
			} else if(forma instanceof Tetraedro) {
				System.out.print("Eu sou um Tetraedro e a minha area eh " + ((Tetraedro)forma).obterArea());
				System.out.println(" e o meu volume eh " + ((Tetraedro)forma).obterVolume());
			}
		}
	}
}
