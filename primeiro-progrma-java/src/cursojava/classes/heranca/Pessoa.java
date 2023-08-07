package cursojava.classes.heranca;

/*Classe pai ou classse master ou superclasse -  atributo comum a todas as outras classes*/
public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String registoGeral;
	protected String cpf;
	protected String nomeMae;
	protected String nomePai;
	
	/*Método abstrato é que fica na classe pai, é obrigatporio para as classes filhas*/
	public abstract double salario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	
	

}
