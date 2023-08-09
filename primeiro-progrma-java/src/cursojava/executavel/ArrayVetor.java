package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {
		
		double[] notas = {8.8, 9.7, 7.9, 9.0};
		double[] notasLogica = {5.8, 5.7, 8.9, 6.5};
		
		Aluno aluno = new Aluno();
		aluno.setNome("Herculano ");
		aluno.setNomeEscola("JDEV Treinamentos");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		
		//OUTRO ALUNO
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Herculano 2");
		aluno2.setNomeEscola("JDEV Treinamentos 2");
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso de Java 2");
		disciplina3.setNota(notas);
		
		aluno2.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Logica de programação");
		disciplina4.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina4);
		
		
		/*Comando para descobrir a maior nota
		 * System.out.println("Nome do aluno = " + aluno.getNome() + "inscrito no curso: " + aluno.getNomeEscola());
		System.out.println("----------- Disciplina do Aluno --------------");
		for(Disciplina d : aluno.getDisciplinas()) {
			System.out.println("Disciplina : " + d.getDisciplina());
			System.out.println("As notas das disciplinas são: ");
			
			System.out.println("============================================");
			
			double notaMax = 0.0;
			for (int pos = 0; pos < d.getNota().length; pos ++) {
				System.out.println("Nota " + (pos + 1)  + " é igual a = " + d.getNota()[pos]);
				if(pos == 0) {
					notaMax = d.getNota()[pos];
				}else {
					if(d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
			}
			System.out.println("A maior nota da disciplina = " +d.getDisciplina() + " e de valor : " + notaMax);
		}*/
		//-------------------------------------------------------------------------------------------------
		
		Aluno[]arrayAlunos = new Aluno[2];
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		
		for (int pos = 0; pos< arrayAlunos.length; pos ++) {
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());
			
			for (Disciplina d: arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é : " + d.getDisciplina());
				
				for (int posnota = 0; posnota < d.getNota().length; posnota ++) {
					System.out.println("A nota número: " + posnota + " é igual = " + d.getNota()[posnota]);
				}
			}
		}
	}

}
