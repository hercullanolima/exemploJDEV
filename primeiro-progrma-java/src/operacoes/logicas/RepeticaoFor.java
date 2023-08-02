package operacoes.logicas;

public class RepeticaoFor {
	public static void main(String[] args) {
		
		System.out.println("Exibe em ordem crescente");
		/*Estrutura de repetição FOR*/
		for(int numero = 0; numero <= 10; numero ++) {
			System.out.println("Número atual é: " + numero);
			
		}
		
		System.out.println("-----------------------");
		System.out.println("Exibe em ordem decrescente");
		
		for(int numero = 10; numero >= 0; numero --) {
			System.out.println("Número atual é: " + numero);
		}
		
		System.out.println("----------------------");
		/*Estrutura de repetição FOR com Break (Parada)*/
		
		for(int numero = 0; numero <= 10; numero ++) {
			if(numero == 7) {
				System.out.println("Obaaaaa, encontrei o numero 7");
				System.out.println("estou parando de executar...");
				break;
			}
		}

		System.out.println("----------------------");
		/*Estrutura de repetição FOR e continue)*/
		/*Estrutura de repetição FOR e continue, 
		 * usando para pesquisa um determinado produto em uma lista, onde encontra e continua)*/
		
		for(int numero = 0; numero <= 10; numero ++) {
			if(numero == 3 || numero ==6 || numero ==9) {
				System.out.println("Obaaaaa, encontrei o numero: " + numero);
				continue;
			}
		}
		System.out.println(" Processando laço de repetição");
		
	}

}
