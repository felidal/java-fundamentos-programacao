package classe;


public class Calculadora {

	double resultado;

	double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}

	void acrescentar(double a) {
		resultado += a;
	}
	
	String obterResultado() {
		return String.format("%.2f", resultado);
	}
	
	void limpar() {
		resultado = 0;
	}
	

}
