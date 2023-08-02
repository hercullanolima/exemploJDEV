package operacoes.logicas;

public class WhileDoWhile {
	public static void main(String[] args) {
		
		/*Estrutura de repetição while*/
	int numero = 0;
		
		while(numero <= 10) {/*Verifica e depois executa*/
			System.out.println("O numero atual é: " + numero);
			numero ++;
		}
	System.out.println("---------------------------------");
	
	/*primeiro executa e depois verifica*/
	int numero1 = 0;
	do {
		System.out.println("O numero atual é: " + numero1);
		numero1++;
	}while(numero1 <=60);
	}

}
