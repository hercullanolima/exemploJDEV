package operacoes.entrada;

import javax.swing.JOptionPane;

public class EntradaDeDados {
	public static void main(String[] args) {
		
	String carros = JOptionPane.showInputDialog("Qual a quantidade de Carros?");
	String pessoas = JOptionPane.showInputDialog("Qual a quantidade de Pessoas?");
	
	double carroNumero = Double.parseDouble(carros);
	double pessoaNumero = Double.parseDouble(pessoas);
	
	int divisao = (int) (carroNumero / pessoaNumero);
	
	double resto = carroNumero % pessoaNumero;
	
	JOptionPane.showConfirmDialog(null, "Divisão para pessoas deu: "
	+"\n" + divisao + " Carro(s)" + "\n Sobrou: " + resto + " Carro(s)");
	
	}
}
