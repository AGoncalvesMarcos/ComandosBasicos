package Calculadora;

public class Calculo {
	
	//class execução
	public static void main(String[] args) {
		Operacoes operacoes = new Operacoes();
		
		operacoes.soma(80, 36, 0);
		operacoes.multiplicacao(26, 79);
		operacoes.divisao(25, 12);
		operacoes.subtracao(79, 25);
	}

}
