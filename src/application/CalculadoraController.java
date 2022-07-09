package application;

import dominio.Calculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraController {
	@FXML
	private Button b_0;
	@FXML
	private Button b_1;
	@FXML
	private Button b_2;
	@FXML
	private Button b_3;
	@FXML
	private Button b_4;
	@FXML
	private Button b_5;
	@FXML
	private Button b_6;
	@FXML
	private Button b_7;
	@FXML
	private Button b_8;
	@FXML
	private Button b_9;
	@FXML
	private Button b_som;
	@FXML
	private Button b_sub;
	@FXML
	private Button b_mul;
	@FXML
	private Button b_div;
	@FXML
	private Button b_eq;
	@FXML
	private Button b_pont;
	@FXML
	private Button b_perc;
	@FXML
	private Button b_pow;
	@FXML
	private Button b_CE;
	@FXML
	private Button b_C;
	
	@FXML
	private TextField tex_visor;
	
	private Calculadora calculadora;
	
	public CalculadoraController() {
		calculadora = new Calculadora();
	}
	
	@FXML
	public void n_pressionado(ActionEvent evento) {
		String faceBotao = ((Button)evento.getSource()).getText();
		calculadora.adicionarDigito(faceBotao.charAt(0));
		tex_visor.setText(calculadora.getExpr());
	}
	
	@FXML
	public void aoQuadrao(ActionEvent evento) {
		calculadora.aoQuadrado();;
		tex_visor.setText(calculadora.getExpr());
	}
	
	@FXML
	public void perc(ActionEvent evento) {
		calculadora.perc();
		tex_visor.setText(calculadora.getExpr());
	}
	
	@FXML
	public void CE(ActionEvent evento) {
		calculadora.fazCE();;
		tex_visor.setText(calculadora.getExpr());
	}
	
	@FXML
	public void fazC(ActionEvent evento) {
		calculadora.fazC();;
		tex_visor.setText(calculadora.getExpr());
	}
	
	@FXML
	public void igual(ActionEvent evento) {
		calculadora.calcula();
		tex_visor.setText(calculadora.getExpr());
	}
	
}
