package Calculadora;

//class de page 
public class Operacoes {
	
	public void soma (int x1, int x2, int x3) {
		int resultado = x1+x2+ x3;
		System.out.println("O resultado da sua soma é " + resultado);
				
	}
	
	public void multiplicacao (int x1, int x2) {
		int resultado = x1*x2;
		System.out.println("O resultado da sua multiplicação é " + resultado);
	}
	
	public void divisao (int x1, int x2) {
		int resultado = x1/x2;
		System.out.println("O resultado da sua divisão é " + resultado);
	}
	
	public void subtracao (int x1, int x2) {
		int resultado = x1-x2;
		System.out.println("O resultado da sua subtração é " + resultado);
	}

}
