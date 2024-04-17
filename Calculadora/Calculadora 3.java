
public class Calculadora {
	//Atributos
		private String nome;
		private double resultado;
		int n;
		double a;
		double b;
		double vetor[];

		
		//get e set 
		
		void setNome(String nome) {
			this.nome = nome;
		}
		
		String getNome() {
			return this.nome;
		}
		
		void setResultado(double resultado) {
			this.resultado = resultado;
		}
		
		double getResultado() {
			return this.resultado;
		}
		
		//m�todo soma
		
		String soma(double a, double b) {
			double total = a + b;
			setResultado(total);
			return "O resultado � " + getResultado();
		}
		
		
		String soma(double vetor[]) {
			
			double total = 0;
			
			for(int i=0; i<n; i++) {
				total = vetor[i] + total;
			}

			setResultado(total);
			return "O resultado desta soma � " + getResultado();
		}
		
		
		//m�todo subtra��o
		
		String subtracao(double a, double b) {
			double total = a - b;
			setResultado(total);
			return "O resultado � " + getResultado();
		}
		
		String subtracao(double vetor[]) {
			
			double total =  vetor[0];
			
			for(int i=1; i<n; i++) {
				total =  total - vetor[i];
			}

			setResultado(total);
			return "O resultado desta subtra��o � " + getResultado();
		}
		
		
	}
