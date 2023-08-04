package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class Aluno {
			
		private String nome;
		private int idade;
		private String dataNascimento;
		private String registoGeral;
		private String cpf;
		private String nomeMae;
		private String nomePai;
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculado;
		
		private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		
		public void setDisciplinas(List<Disciplina> disciplinas) {
			this.disciplinas = disciplinas;
		}
		public List<Disciplina> getDisciplinas() {
			return disciplinas;
		}
		
		public Aluno() {/*Cria os dados na memoria - sendo padrão do java*/
			
		}
		public Aluno(String nomePadrao) {
			nome = nomePadrao;
		}
		
		public Aluno (String nomePadrao, int idadePadrao) {
			nome = nomePadrao;
			idade = idadePadrao;
		}
		
		/*Veremos os metodos SETTERS e GETTERS do Objeto*/
		/*SET é para adicionar ou receber dados para os atributos*/
		/*GET é para resgatar ou obter o valor do atributo*/
		
		/*Recebe dados*/
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNome() {
			return nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public String getRegistoGeral() {
			return registoGeral;
		}
		public void setRegistoGeral(String registoGeral) {
			this.registoGeral = registoGeral;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getNomeMae() {
			return nomeMae;
		}
		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}
		public String getNomePai() {
			return nomePai;
		}
		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}
		public String getDataMatricula() {
			return dataMatricula;
		}
		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}
		public String getNomeEscola() {
			return nomeEscola;
		}
		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}
		public String getSerieMatriculado() {
			return serieMatriculado;
		}
		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}
		
		
	
		/*Método que retorna a média do aluno*/
		public double getMediaNota() {
			
			double somaNotas = 0.0;
			
			for (Disciplina disciplina : disciplinas) {
				somaNotas += disciplina.getNota();
			}
			
			return somaNotas / disciplinas.size();
		}
		
		/*Método que retorna true para aprovado e false para reprovado*/
		public boolean getAlunoAProvado() {
			double media = this.getMediaNota();
			if(media>= 70) {
				return true;
			}else {
				return false;
			}
		}
		
		/*Outra forma de do método acima */
		public String getAlunoAprovado2() {
			double media = this.getMediaNota();
			if (media >= 50) {
				if(media >= 70) {
					return StatusAluno.APROVADO;
				}else {
					return StatusAluno.RECUPERACAO;
				}
			}else {
				return StatusAluno.REPROVADO;
			}
		}
		
		
		
		
		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registoGeral="
					+ registoGeral + ", cpf=" + cpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
					+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
					+ serieMatriculado + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			return true;
		}
		
		
	
		
	}


