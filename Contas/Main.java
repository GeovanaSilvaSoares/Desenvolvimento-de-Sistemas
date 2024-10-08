import java.util.Scanner;
public class Main extends Generica {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Corrente Corrente1 = new Corrente(); 
		Poupanca Poupanca1 = new Poupanca(); 
		String respAcao, respConta;
		
		// M�todos
		System.out.println("Qual tipo de conta voc� deseja criar? ('Corrente' ou 'Poupan�a')");
		respConta = in.next(); 
					

		if (respConta.equalsIgnoreCase("Corrente")) {
			
			// Nome
			System.out.println("Qual o seu nome?");
			Corrente1.setNome(in.next());
			
			// Cpf 
			System.out.println("Qual o seu cpf?");
			Corrente1.setCpf(in.next());
			
			System.out.println("Qual a��o voc� deseja realizar em sua conta? (Dep�sito, Saque, Consultar saldo)");
			respAcao = in.next();
			
			
			
			// A��es ------------------------------------------------
			if (respAcao.equalsIgnoreCase("Sacar") || respAcao.equalsIgnoreCase("Saque")) {
				System.out.println("Qual a quantia que deseja sacar?");
				Corrente1.setQuantia(in.nextDouble());
				System.out.println(Corrente1.sacar(Corrente1.getQuantia()));
				System.out.println(Corrente1.imprimirSaldo());
							
							
			} else if (respAcao.equalsIgnoreCase("Depositar") || respAcao.equalsIgnoreCase("Dep�sito")) {
				System.out.println("Qual a quantia que deseja depositar?");
				Corrente1.setQuantia(in.nextDouble());
						
				Corrente1.depositar(Corrente1.getQuantia());
				System.out.println(Poupanca1.imprimirSaldo()); 
							
							
							
			} else if (respAcao.equalsIgnoreCase("Consultar saldo") || respAcao.equalsIgnoreCase("Saldo") ||
				respAcao.equalsIgnoreCase("Consultar")) {
				System.out.println(Poupanca1.imprimirSaldo());
									
			} else {
				System.out.println("Resposta inv�lida!");
			}
			
			
		} else if (respConta.equalsIgnoreCase("Poupan�a")) {
			
			Poupanca1.atualizarSaldo(Poupanca1.getTaxaRendimento());
			
			// Nome
			System.out.println("Qual o seu nome?");
			Poupanca1.setNome(in.next());
						
			// Cpf 
			System.out.println("Qual o seu cpf?");
			Poupanca1.setCpf(in.next());
			
			System.out.println("Qual a��o voc� deseja realizar em sua conta? (Dep�sito, Saque, Consultar saldo)");
			respAcao = in.next();
			
			
			
			// A��es ------------------------------------------------
			if (respAcao.equalsIgnoreCase("Sacar") || respAcao.equalsIgnoreCase("Saque")) {
				System.out.println("Qual a quantia que deseja sacar?");
				Poupanca1.setQuantia(in.nextDouble());
				System.out.println(Poupanca1.sacar(Poupanca1.getQuantia()));
				System.out.println(Poupanca1.imprimirSaldo());
				
				
				
			} else if (respAcao.equalsIgnoreCase("Depositar") || respAcao.equalsIgnoreCase("Dep�sito")) {
				System.out.println("Qual a quantia que deseja depositar?");
				Poupanca1.setQuantia(in.nextDouble());
			
				Poupanca1.depositar(Poupanca1.getQuantia());
				System.out.println(Poupanca1.imprimirSaldo()); 
				
				
				
			} else if (respAcao.equalsIgnoreCase("Consultar saldo") || respAcao.equalsIgnoreCase("Saldo") ||
				respAcao.equalsIgnoreCase("Consultar")) {
				System.out.println(Poupanca1.imprimirSaldo());
						
			} else {
				System.out.println("Resposta inv�lida!");
			}

			
		} else {
			System.out.println("Resposta inv�lida!");
		}
		
		
		
		
		

	}

}
