package operacoes.logicas;

public class LogicaAninhadas {
	public static void main(String[] args) {
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 30;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		/*Opera��es l�gicas aninhadas: S�o opera��es dentro de opera��es*/
		
		if(media >= 50) {
			if (media >= 70) {
				if(media > 90) {
					System.out.println("Aluno est� aprovado direto - PARABENS!! " + media);
				}else {
					System.out.println("Aluno est� Aprovado " + media);
				}
			}else {
				System.out.println("Aluno est� em recupera��o " + media);
			}
		}else {
			System.out.println("Aluno reprovado direto - " + "M�dia: "  + media);
		}
	}

}
