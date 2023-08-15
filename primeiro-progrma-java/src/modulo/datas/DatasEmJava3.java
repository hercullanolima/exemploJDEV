package modulo.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava3 {
	public static void main(String[] args) throws ParseException{
		
		Calendar calendar = Calendar.getInstance();//Pega a data atual
		
		//Simular que a data vem do banco de dados
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("14-08-2023")); //Definindo uma data qualquer
		
		calendar.add(Calendar.DAY_OF_MONTH, 1); //Data de hoje mais 1 dia.
		calendar.add(Calendar.MONTH, 1);// Mês atual, somando mais 1
		calendar.add(Calendar.YEAR, 1);
		
		System.out.println("Somando dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		System.out.println("Somando 1 ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
	}

}
