
public class Funcionario {
	String nome;
	double salarioBruto;
	double imposto;
	double salarioLiquido;
	double aumentaSalario;
	
	String salarioLiquido (double salarioBruto, double imposto, String nome) {
		salarioLiquido = salarioBruto - imposto;
		return "O sal�rio l�quido do " + nome + " � de R$" + salarioLiquido;
		
	}
	
	String aumentaSalario (double salarioLiquido, double aumento) {
		aumentaSalario = salarioLiquido + aumento;
		return  "O novo sal�rio do " + nome + " ser� de R$" + aumentaSalario;
		
	}
}
