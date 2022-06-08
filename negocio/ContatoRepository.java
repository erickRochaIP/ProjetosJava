package negocio;

import servicos.Repository;
import servicos.Salvable;

public class ContatoRepository extends Repository{

	public ContatoRepository(String fileName) {
		super(fileName);
	}

	@Override
	protected Salvable getObject(String line) throws IllegalArgumentException {
		String[] data = line.split(";");
		if (data.length != 4)
			throw new IllegalArgumentException();
		Contato cont = new Contato(data[0], data[1], data[2], data[3]);
		return cont;
	}
	
}
