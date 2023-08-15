package modulo.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormasDatas {
	
public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("Dia do mês: " + date.getDate());
		System.out.println("Calendar Dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Calendar Dia da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
		
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Calendar Hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minuto da hora: " + date.getMinutes());
		System.out.println("Calendar Minuto da hora: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundos: " + date.getSeconds());
		System.out.println("Calendar Segundos: " + calendar.get(Calendar.SECOND));
		
		System.out.println("Ano: " + (date.getYear() + 1900));
		System.out.println("Calendar em Ano: " + calendar.get(Calendar.YEAR));
		
		
		System.out.println("\n/*-------------------- Simple Date Format ---------------------*/");
		
		SimpleDateFormat simplesDateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm.ss");
		
		System.out.println("Data atual em formado padrão e String: " + simplesDateFormat.format(date));
		System.out.println("Calendar Data atual em formado padrão e String: " + simplesDateFormat.format(calendar.getTime()));
		
		simplesDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm.ss");
		System.out.println("Data em formato para banco de dados: " + simplesDateFormat.format(date));
		System.out.println("Calendar Data em formato para banco de dados: " + simplesDateFormat.format(calendar.getTime()));
		
		System.out.println("Objeto Date: " + simplesDateFormat.parse("2023-08-11 11:46.34"));
		
	}

}
