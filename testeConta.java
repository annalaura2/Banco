package comercialBanco.java;

public class testeConta {
	
	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		
		contaCorrente.numero = 11; 
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "Sarah"; 
		contaCorrente.cliente.idade = 20; 
		
		contaPoupanca.numero = 22; 
		contaPoupanca.saldo = 10.4; 
		contaPoupanca.cliente.nome = "Anna"; 
		contaPoupanca.cliente.idade = 19;
	
		
		contaInvestimento.numero = 33; 
		contaInvestimento.saldo = 45.6; 
		contaInvestimento.cliente.nome = "Eva"; 
		contaInvestimento.cliente.idade = 9; 
		
		System.out.println("== CONTA CORRENTE ==");
		System.out.println("Número da conta: " + contaCorrente.numero); 
		System.out.println("Saldo: " +contaCorrente.saldo); 
		System.out.println("Nome do cliente: " +contaCorrente.cliente.nome); 
		System.out.println("Idade do cliente: " + contaCorrente.cliente.idade);
		
		System.out.println();
			
		System.out.println("== CONTA POUPANÇA =="); 
		System.out.println("Número da conta: " + contaPoupanca.numero); 
		System.out.println("Saldo: " + contaPoupanca.saldo); 
		System.out.println("Nome do cliente: " + contaPoupanca.cliente.nome); 
		System.out.println("Idade do cliente: " + contaPoupanca.cliente.idade);
		
		System.out.println(); 
		
		System.out.println("== CONTA INVESTIMENTO =="); 
		System.out.println("Número da conta: " + contaInvestimento.numero); 
		System.out.println("Saldo: " + contaInvestimento.saldo);
		System.out.println("Nome do cliente: " + contaInvestimento.cliente.nome); 
		System.out.println("Idade do cliente: " + contaInvestimento.cliente.idade); 
		
	}

}
