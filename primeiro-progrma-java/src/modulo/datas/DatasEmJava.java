package modulo.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simplesDateFormat = new SimpleDateFormat("ss/MM/yyy");
		
		Date dataVencimentoBoleto = simplesDateFormat.parse("10/04/2023");
		
		Date dataAtualHoje = simplesDateFormat.parse("07/04/2023");
		
		if(dataVencimentoBoleto.after(dataAtualHoje)) { //Posterior ou maior ou depois da data atual
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vendido - PAGAR URGENTE!");
		}
		
	}
		
	}

