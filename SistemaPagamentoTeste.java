
public class SistemaPagamentoTeste {

	public static void main(String[] args) {
		ControlePagamento controle = new ControlePagamento();
		
		Assalariado ass = new Assalariado();
		ass.setNome("Assado");
		ass.setSobrenome("Silva");
		ass.setNumIdent(1);
		ass.setHorasExtras(20);
		
		AssalariadoComissionado assCom = new AssalariadoComissionado();
		assCom.setNome("Assada");
		assCom.setSobrenome("Rocha");
		assCom.setNumIdent(2);
		assCom.setPercentualBonus(0.3);
		assCom.setValorVendas(1000);
		
		Comissionado com = new Comissionado();
		com.setNome("Comadre");
		com.setSobrenome("Santos");
		com.setNumIdent(3);
		com.setValorVendas(1500);
		
		Terceirizado ter = new Terceirizado();
		ter.setNome("Terca");
		ter.setSobrenome("Malada");
		ter.setNumIdent(4);
		ter.setHorasTrabalhadas(10);
		
		Concessionaria con = new Concessionaria();
		con.setDia(3);
		con.setMes(7);
		con.setValor(2000);
		
		Titulo tit = new Titulo();
		tit.setDia(3);
		tit.setMes(7);
		tit.setValor(2000);
		
		controle.addPagamento(ass);
		controle.addPagamento(assCom);
		controle.addPagamento(com);
		controle.addPagamento(ter);
		controle.addPagamento(con);
		controle.addPagamento(tit);
		
		controle.exibirResumoPagamento(3, 7);
		
	}

}
