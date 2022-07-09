package dominio;


public class Calculadora {
	
	private String expr = "0";
	
	public String getExpr(){
		return expr;
	}
	
	public void adicionarDigito(char c) {
		if (expr.equals("0"))
			expr = "";
		
		expr = expr + c;
	}
	
	public void calcula() {
		char op = '+';
		int id = expr.indexOf("+");
		
		if (id == -1) {
			op = '-';
			id = expr.indexOf("-");
		}
		if (id == -1) {
			op = '*';
			id = expr.indexOf("*");
		}
		if (id == -1) {
			op = '/';
			id = expr.indexOf("/");
		}
		
		double a = Double.parseDouble(expr.substring(0, id));
		double b = Double.parseDouble(expr.substring(id, expr.length()-1));
		
		switch (op)
		{
		case '+':
			expr = "" + ( a + b);
		case '-':
			expr = "" + (a - b);
		case '*':
			expr = "" + (a * b);
		case '/':
			expr = "" + (a / b);
		}
	}
	
	public void fazC() {
		int id = expr.indexOf("+");
		
		if (id == -1) {
			id = expr.indexOf("-");
		}
		if (id == -1) {
			id = expr.indexOf("*");
		}
		if (id == -1) {
			id = expr.indexOf("/");
		}
		if (id != -1) {
			expr = expr.substring(0, id);
		}
	}
	
	public void fazCE() {
		this.expr = "0";
	}
	
	public void aoQuadrado() {
		double a = Double.parseDouble(expr) * Double.parseDouble(expr);
		expr = "" + a;
	}
	
	public void perc() {
		double a = Double.parseDouble(expr) / 100;
		expr = "" + a;
	}
	
}
