package cursojava.classes;

public class EqualsHashCode {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos sãos iguais");
		}else {
			System.out.println("Alunos são diferentes");
		}
	}

}
