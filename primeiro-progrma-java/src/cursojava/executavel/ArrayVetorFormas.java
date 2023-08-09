package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetorFormas {

	public static void main(String[] args) {

		/*Array pode ser de todo os tipos de daods e objetos tambem*/
		
		String posicoes = JOptionPane.showInputDialog("Qual a quantidade de posições do Array ?");
		/*Array sempre deve ter a quantidade de posições definidas*/
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos ++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição " + (pos + 1) + "?");
			notas[pos] = Double.valueOf(valor);
		}
			
		
		for ( int pos = 0; pos < notas.length; pos ++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}

		
		
		
		
		String[] valores = new String[4];
		valores[0] = "Herculano";
		valores[1] = "98,5";
		valores[2] = "Curso de Java";
		
		
		for (int pos = 0; pos < valores.length; pos ++) {
			System.out.println("Valor na posição " + (pos + 1) + " é igual = " + valores[pos]);
		}
		

	}

}
