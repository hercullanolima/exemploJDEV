package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedDeque<ObjetoFilaThread > pilha_fila = new ConcurrentLinkedDeque<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);		
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando!");
		
		while(true) {
		
		synchronized (pilha_fila) { //Bloquear o acesso a esta lista por outro processos
			
			Iterator iteracao = pilha_fila.iterator();
			while (iteracao.hasNext()) { //Enquanto conter dados na lista irá processar
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); //Pega o objeto atual
				
				//Processar 10 mil notas fiscais
				//Gerar um alits enorme de pdf
				//Gerar um envio em massa de email
				
				
				System.out.println("===========================================");
				
				System.out.println(processar.getNome());
				System.out.println(processar.getEmail());
				
				
				iteracao.remove();
				try {
					Thread.sleep(1000); //Dar um tempo pra descarga de memoria
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		try {
			Thread.sleep(1000); //Processou toda a lista dá um tempo pra limpeza de memo
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
		
	}
		
}
