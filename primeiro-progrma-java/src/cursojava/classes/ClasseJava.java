package cursojava.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.constantes.StatusAluno;

public class ClasseJava {
public static void main(String[] args) {
	
	String login = JOptionPane.showInputDialog("Informe o Login!");
	String senha = JOptionPane.showInputDialog("Informe a Senha!");
	
	/*Criando validação de acesso*/
	if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*-e uma list que dentro dela temos uma chave que identifica uma sequencia de valores também*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		
		for (int qtd = 1; qtd <= 4; qtd ++) {
			
			/*new Aluno() é uma instancia (criação de objeto)*/
			/*aluno1 é uma referencia para o objeto aluno*/
			
			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno "+ qtd + "?");
			/*String idade = JOptionPane.showInputDialog("Qual a Idade ?");
			String dataNascimento = JOptionPane.showInputDialog("Informe a data de Nascimento !");
			String registroGeral = JOptionPane.showInputDialog("Qual o RG?");
			String cpf = JOptionPane.showInputDialog("Qual o CPF?");
			String nomeMae = JOptionPane.showInputDialog("Qual o nome da Mâe?");
			String nomePai = JOptionPane.showInputDialog("Qual o nome do Pai ?");
			String dataMatricula = JOptionPane.showInputDialog("Qual a data da Matrícula ?");
			String nomeEscola = JOptionPane.showInputDialog("Qual o Nome da Escola ?");
			String serieMatriculada = JOptionPane.showInputDialog("Qual a Série Matriculada ?");*/
			
				
			Aluno aluno1 = new Aluno();
			
			aluno1.setNome(nome);
			/*aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistoGeral(registroGeral);
			aluno1.setCpf(cpf);
			aluno1.setNomeMae(nomeMae);
			aluno1.setNomePai(nomePai);
			aluno1.setDataMatricula(dataMatricula);
			aluno1.setNomeEscola(nomeEscola);
			aluno1.setSerieMatriculado(serieMatriculada);*/
			
			for ( int pos = 1; pos <=1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Discipliva"+pos+"?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Discipliva"+pos+"?");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplinas().add(disciplina);
			}
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplica?");
			
			if(escolha == 0) {
				
				int continuarRemover = 0;
				int posicao = 1;
				
				while(continuarRemover == 0){
					String disciplinaRemover = JOptionPane.showInputDialog("Informe a disciplina: 1, 2, 3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao ++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");			
				}		
			}
			
			alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		for (Aluno aluno : alunos) {
			
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			
		}
		
		System.out.println("----------------------- Lista dos Aprovados --------------");
		for(Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Aluno: " + aluno.getNome() + " Resultado: " + aluno.getAlunoAprovado2()+  " com média de: " + aluno.getMediaNota());
		}
		
		System.out.println("----------------------- Lista dos Recuperação --------------");
		for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Aluno: " + aluno.getNome() + " Resultado: " + aluno.getAlunoAprovado2()+  " com média de: " + aluno.getMediaNota());
		}
		
		System.out.println("----------------------- Lista dos Reprovados --------------");
		for(Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Aluno: " + aluno.getNome() + " Resultado: " + aluno.getAlunoAprovado2()+  " com média de: " + aluno.getMediaNota());
		}
		
		
	}
}
}
