package operacoes.logicas;

public class LogicaAninhadas {
	public static void main(String[] args) {
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 30;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		/*Operações lógicas aninhadas: São operações dentro de operações*/
		
		if(media >= 50) {
			if (media >= 70) {
				if(media > 90) {
					System.out.println("Aluno está aprovado direto - PARABENS!! " + media);
				}else {
					System.out.println("Aluno está Aprovado " + media);
				}
			}else {
				System.out.println("Aluno está em recuperação " + media);
			}
		}else {
			System.out.println("Aluno reprovado direto - " + "Média: "  + media);
		}
	}

}
