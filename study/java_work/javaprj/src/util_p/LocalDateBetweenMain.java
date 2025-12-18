package util_p;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateBetweenMain {

	public static void main(String[] args) {
		LocalDateTime ld1 = LocalDateTime.of(783,12,10,0,1,5); 
		LocalDateTime ld2 = LocalDateTime.of(2025,12,15,2,2,6);
		
		System.out.println("ChronoUnit >>>>> ");
		long cnt = ChronoUnit.DAYS.between(ld1, ld2);
		System.out.println("cnt : "+cnt);
		System.out.println("MILLENNIA : "+ChronoUnit.MILLENNIA.between(ld1, ld2));
		System.out.println("CENTURIES : "+ChronoUnit.CENTURIES.between(ld1, ld2));
		System.out.println("DECADES : "+ChronoUnit.DECADES.between(ld1, ld2));
		System.out.println("YEARS : "+ChronoUnit.YEARS.between(ld1, ld2));
		System.out.println("MONTHS : "+ChronoUnit.MONTHS.between(ld1, ld2));
		System.out.println("DAYS : "+ChronoUnit.DAYS.between(ld1, ld2));
		System.out.println("HALF_DAYS : "+ChronoUnit.HALF_DAYS.between(ld1, ld2));
		System.out.println("HOURS : "+ChronoUnit.HOURS.between(ld1, ld2));
		System.out.println("MINUTES : "+ChronoUnit.MINUTES.between(ld1, ld2));
		System.out.println("SECONDS : "+ChronoUnit.SECONDS.between(ld1, ld2));
		System.out.println("MILLIS : "+ChronoUnit.MILLIS.between(ld1, ld2));
		System.out.println("MICROS : "+ChronoUnit.MICROS.between(ld1, ld2));
		
		ld1 = LocalDateTime.of(2003,12,10,0,1,5); 
		
		System.out.println("YEARS : "+ChronoUnit.NANOS.between(ld1, ld2));
		
		System.out.println("Period >>>>> ");
		LocalDate ld3 = LocalDate.of(2003,9,10);
		LocalDate ld4 = LocalDate.of(2025,12,15);
		Period pp = Period.between(ld3, ld4);
		
		System.out.println("Years : "+pp.getYears());
		System.out.println("Months : "+pp.getMonths());
		System.out.println("Days : "+pp.getDays());
		
		
		System.out.println("Duration >>>>> ");
		ZoneId zone = ZoneId.of("Asia/Seoul");
		ld1 = LocalDateTime.of(2025,12,10,0,1,5,111_222_333); 
		ld2 = LocalDateTime.of(2025,12,15,2,2,6,334_456_789);
		ZonedDateTime zd1 = ld1.atZone(zone);
		ZonedDateTime zd2 = ld2.atZone(zone);
		
		Duration dd = Duration.between(zd1, zd2);
		
		System.out.println("Seconds : "+dd.getSeconds());
		System.out.println("Nano : "+dd.getNano());
		System.out.println("Millis : "+dd.toMillis());
		
		
		System.out.println("Instant >>>>> ");
		//UTC 기준 타임스탬프
		Instant inst1 = zd1.toInstant();
		Instant inst2 = zd2.toInstant();
		
		System.out.println("inst1 : "+inst1);
		System.out.println("초단위 : "+inst1.getEpochSecond());
		System.out.println("밀리초단위 : "+inst1.toEpochMilli());
		System.out.println("inst2 : "+inst2);
		System.out.println("초단위 : "+inst2.getEpochSecond());
		System.out.println("밀리초단위 : "+inst2.toEpochMilli());
		

	}

}

