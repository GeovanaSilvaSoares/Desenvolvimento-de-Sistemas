
public abstract class Generica {

	//Atributos
	
	private String nome;
	private String cpf;
	private double saldo;
	private double quantia;
	
	//SET e GET 
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	String getNome() {
		return this.nome;
	}
	
	void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	String getCpf() {
		return this.cpf;
	}
	
	void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	void setQuantia(double quantia) {
		this.quantia = quantia;
	}
	
	double getQuantia() {
		return this.quantia;
	}
	
	
	//Metódos 
	
	String criarConta(String nome, String cpf, String numeroConta, double quantia) {
		this.nome = nome;
		this.cpf = cpf;
		this.quantia = quantia;
		return "Conta criada com sucesso!!! Seu saldo é de R$" + getSaldo();
	}
	
	
	double depositar (double getQuantia) {
		this.saldo = getSaldo() + getQuantia;
		return getSaldo();	
	}
	
	String sacar (double getQuantia) {
		this.saldo = getSaldo() - getQuantia;
		return "Seu novo saldo é de R$" + getSaldo();	
	}
	
	String imprimirSaldo () {
		return "Seu saldo é de R$" + getSaldo();	
	}

	
	
	
}
