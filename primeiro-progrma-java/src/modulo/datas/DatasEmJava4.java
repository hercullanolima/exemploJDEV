package modulo.datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmJava4 {

	public static void main(String[] args) {
		
	
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2023-08-02"), LocalDate.now());
		
		System.out.println("Possui " + dias + " entre a faixa de datas");
	}

}
