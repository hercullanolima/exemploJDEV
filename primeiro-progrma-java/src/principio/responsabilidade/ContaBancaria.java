package principio.responsabilidade;

public class ContaBancaria {
	
	private String decricao;
	private double saldo = 8.000;
	
	
	public void dimi100Reais() {
		saldo += 100;
	}
	
	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}
	
	public void depositarDinheiro(double depositar) {
	saldo += depositar;
		
	}
	

}
