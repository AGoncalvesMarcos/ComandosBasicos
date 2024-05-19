package IF; 

public class AprendendoIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String banco = "Banco Champions";
	    int boleto = 2000;
	    int saldoemconta = 1000;
	    int chequeespecial = 500;
	    int saldofinal = saldoemconta + chequeespecial - boleto;
	    
	    System.out.println("Bem vindo ao " + banco );
	    System.out.println("Seu saldo é de R$" + saldoemconta);
	    System.out.println("Você possui R$" + chequeespecial + " de cheque especial");
	    System.out.println("Você possui um boleto no valor de R$" + boleto);
	    
	    if (boleto <= saldoemconta + chequeespecial) {
	    	System.out.println("Você reazlizou o pagamento de R$" + boleto + " e seu saldo é de R$" + saldofinal);
			
		} else {
		System.out.println("Saldo insuficiente");
	    }
	
	}

}
