package operacoes.logicas;

public class logicaIfElse {

	public static void main(String[] args) {
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		/*Condições lógicas com IF e ELSE*/
		if(media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		}else if( media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media);
		}else {
			System.out.println("Aluno reprovado: " + media);
		}
		
		
		/*Operadores Ternários são para micro validações*/
		System.out.println("\nOperadores Ternários são para micro validações");
		String saidaResultado = saidaResultado = media >= 70 ? "Aluno Aprovado: " + media : (media >= 40 && media <= 69) ? "Aluno em recuperação:" + media : "Aluno Reprovado: " + media;
		
		System.out.println(saidaResultado);
		
		
	}
}
