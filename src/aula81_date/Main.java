package aula81_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String dataConvertida = sdf1.format(new Date());
		String dataConvertidaComMinutos = sdf2.format(new Date());
		
		System.out.println(dataConvertida);
		System.out.println(dataConvertidaComMinutos);
		
		try {
			Date dataConvertidaParse1 = sdf1.parse("10/10/2010");
			sdf1.format(dataConvertidaParse1);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		
		try {
			Date dataConvertidaParse2 = sdf2.parse("10/10/2010 12:58:19");
			System.out.println(sdf2.format(dataConvertidaParse2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date dataCriadaEmMilisegundos = new Date(System.currentTimeMillis());
		System.out.println(sdf2.format(dataCriadaEmMilisegundos));
		
		Date dataConvertidaPadraoUTC = Date.from(Instant.parse("2019-02-22T12:07:17Z"));
		System.out.println(dataConvertidaPadraoUTC);

	}

}
