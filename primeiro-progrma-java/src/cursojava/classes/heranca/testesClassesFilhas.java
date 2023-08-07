package cursojava.classes.heranca;

import cursojava.classes.Aluno;

public class testesClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Herculano Lima");
		aluno.setNomeEscola("JDEV");
		aluno.setIdade(43);
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("João");
		diretor.setRegistoGeral("33333333333");
		diretor.setCpf("2340983455-00");
		diretor.setIdade(50);
		
		
		Secretario secretario = new Secretario();
		secretario.setNome("José");
		secretario.setExperiencia("Administração");
		secretario.setCpf("1234567889-00");
		secretario.setIdade(17);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		
		System.out.println("Salário Aluno é: " + aluno.salario());
		System.out.println("Salário Diretor é: " + diretor.salario());
		System.out.println("Salário Secretário é: " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
				
	}
	
	public static void teste (Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = "
				+ pessoa.getNome() + " e o salário é de: " + pessoa.salario());
	}

}
