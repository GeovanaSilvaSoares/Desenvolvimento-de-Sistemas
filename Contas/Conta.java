
public interface Conta {
	
	
	//Met�dos 
	
	double depositar (double getQuantia);
	
	double sacar (double getQuantia);
	
	String imprimirSaldo();
		
	String criarConta(String nome, String cpf, String numeroConta, double quantia);
}
