import java.util.Scanner;
public class mainCalculadora {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Calculadora calculadora1 = new Calculadora();
			
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.print("Escolha uma das opc�es: ");
			int opcao = in.nextInt();

			
			switch(opcao) {
			
			case 1: //Soma
				
				System.out.print("Quantos valores voc� ir� usar?: ");
				calculadora1.n = in.nextInt();
				
				if(calculadora1.n == 2) {
					
					System.out.println("Entre com o 1� valor:");
					double a = in.nextDouble();
					
					System.out.println("Entre com o 2� valor:");
					double b = in.nextDouble();
					
					System.out.println(calculadora1.soma(a, b));
					
				}else {
					
					double vetorSoma[] = new double[calculadora1.n];
				
						for (int i=0; i<calculadora1.n; i++) {
							System.out.println("Entre com o " + (i+1) + "� valor:");
							vetorSoma[i] = in.nextDouble();
						}
	
					System.out.println(calculadora1.soma(vetorSoma));
				}
			
				break;
				
			case 2: //Subtra��o
				
				
				System.out.print("Quantos valores voc� ir� usar?: ");
				calculadora1.n = in.nextInt();
				
				if(calculadora1.n == 2) {
					
					System.out.println("Entre com o 1� valor:");
					double a = in.nextDouble();
					
					System.out.println("Entre com o 2� valor:");
					double b = in.nextDouble();
					
					System.out.println(calculadora1.subtracao(a, b));
					
				}else {
					
					double vetorSub[] = new double[calculadora1.n];
					
						for (int i=0; i<calculadora1.n; i++) {
							System.out.println("Entre com o " + (i+1) + "� valor:");
							vetorSub[i] = in.nextDouble();
						}

					System.out.println(calculadora1.subtracao(vetorSub));
					

				}
				
				break;
				
			default:
				System.out.println("Op��o Inv�lida!");
			
			}
			
			
			
		}

	}



