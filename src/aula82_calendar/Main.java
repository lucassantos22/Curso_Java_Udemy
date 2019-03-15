package aula82_calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date dataUTC = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(dataUTC));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataUTC);
		cal.add(Calendar.HOUR, 4);
		
		System.out.println(cal.getTime());
		
		System.out.println("Minutes: " + cal.get(Calendar.MINUTE));

	}

}
