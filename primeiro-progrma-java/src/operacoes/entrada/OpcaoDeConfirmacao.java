package operacoes.entrada;

import javax.swing.JOptionPane;

public class OpcaoDeConfirmacao {
	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("Qual a quantidade de Carros?");
		String pessoas = JOptionPane.showInputDialog("Qual a quantidade de Pessoas?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da Divisão?");
		
		if (resposta == 0) {
			JOptionPane.showConfirmDialog(null, "Divisão para cada pessoa foi de: " + divisao);
		}else {
			System.out.println("Não quis ver o resultado!");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão?");
		
		if(resposta == 0) {
			JOptionPane.showConfirmDialog(null,"O resto da divisão e: " + resto);
		}else {
			System.out.println("Não quis ver o resultado!");
		}
		
		JOptionPane.showConfirmDialog(null, "Divisão para pessoas deu: "
				+"\n" + divisao + " Carro(s)" + "\n Sobrou: " + resto + " Carro(s)");
				
	}

}
