package operacoes.logicas;

public class WhileDoWhile {
	public static void main(String[] args) {
		
		/*Estrutura de repeti��o while*/
	int numero = 0;
		
		while(numero <= 10) {/*Verifica e depois executa*/
			System.out.println("O numero atual �: " + numero);
			numero ++;
		}
	System.out.println("---------------------------------");
	
	/*primeiro executa e depois verifica*/
	int numero1 = 0;
	do {
		System.out.println("O numero atual �: " + numero1);
		numero1++;
	}while(numero1 <=60);
	}

}
