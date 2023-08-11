package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		/*Thread processamento em paralelo do encio de mail*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
			
		
		/*Thread processamento em paralelo do envio de nota fiscal*/
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		
		//C�digo do sistema do usu�rio contnua o fluxo de trabalho
		System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE DA THREAD");
		JOptionPane.showConfirmDialog(null, "Sistema continua executando apra o usu�rio");

	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			/*C�digo da rotina que eu quero executar em paralelo*/
			for ( int pos = 0; pos < 10; pos ++) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}//D� um tempo
				/*Executar com um tempo determinado*/
				
				System.out.println("Executando uma rotina, envio de nota fiscal...");
			}
			//Fim do coodigo em paralelo
			
		}
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			/*C�digo da rotina que eu quero executar em paralelo*/
			for ( int pos = 0; pos < 10; pos ++) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}//D� um tempo
				/*Executar com um tempo determinado*/
				
				System.out.println("Executando uma rotina, envio de email...");
			}
			//Fim do coodigo em paralelo
			
		}
	};

}
