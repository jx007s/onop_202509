package util_p;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LocalDateTimeMain {

	public static void main(String[] args) {
		
		//불변데이터
		LocalDateTime nn = LocalDateTime.now(); 
		System.out.println(nn);
		// 2025-12-18T14:13:08.531761700   : 중간에 T 가 있음
		
		// OS/JVM 의 TimeZone 기준
		nn = LocalDateTime.now(Clock.systemDefaultZone()); 
		System.out.println(nn);
		
		System.out.println("ZoneId.of >>>>>");
		nn = LocalDateTime.now(ZoneId.of("Asia/Seoul")); 
		System.out.println(nn);
		System.out.println(LocalDateTime.now(ZoneId.of("Europe/London")));
		System.out.println(LocalDateTime.now(ZoneId.of("Europe/Rome")));
		System.out.println(LocalDateTime.now(ZoneId.of("America/New_York")));
		System.out.println(LocalDateTime.now(ZoneId.of("America/Los_Angeles")));
		
		System.out.println("of >>>>>");
		// 월 표시를 일반상태로 입력
		nn = LocalDateTime.of(2025,12,10,16,23);
		System.out.println(nn);
		nn = LocalDateTime.of(2025,12,10,16,23,45);
		System.out.println(nn);
		nn = LocalDateTime.of(2025,12,10,16,23,45,1234567);
		System.out.println(nn);
		
		//문자열로 생성(파싱)
		nn = LocalDateTime.parse("2002-06-02T19:43:58.987654321");
		System.out.println(nn);
		
		System.out.println("getXXX >>>>>");
		System.out.println(nn.getYear());
		System.out.println(nn.getMonthValue()); // 1~12
		Month mm = nn.getMonth();  // Month : enum
		System.out.println(mm);
		DayOfWeek dd = nn.getDayOfWeek();  //요일 enum
		System.out.println(dd);
		System.out.println("DayOfWeek 값----------------------");
		for (DayOfWeek dw : DayOfWeek.values()) {
			System.out.println(dw+"   \t"+dw.ordinal()+"\t"+dw.getValue());
		}
		System.out.println("DayOfWeek ----------------------");
		System.out.println(nn.getDayOfYear());
		
		System.out.println(nn.getHour());
		System.out.println(nn.getMinute());
		System.out.println(nn.getSecond());
		System.out.println(nn.getNano());
		
		//nn.setYear(2005);   불변데이터  - set 이 없음
		
		System.out.println("withXXX >>>>>");
		//  withXXX()  자신을 바꾸는 것이 아니라 바뀐 날짜데이터를 리턴
		LocalDateTime aa = nn.withYear(2005);
		System.out.println(aa);
		System.out.println(nn.withMonth(4));
		System.out.println(nn.withDayOfMonth(17));
		System.out.println(nn.withDayOfYear(100));
		
		System.out.println(nn.withHour(21));
		System.out.println(nn.withMinute(37));
		System.out.println(nn.withSecond(21));
		System.out.println(nn.withNano(192837465));
		
		aa = nn.withYear(1982)
				.withMonth(7)
				.withDayOfMonth(8)
				.withHour(13)
				.withMinute(15)
				.withSecond(19)
				.withNano(333444555);
		System.out.println(aa);
		
		// ChronoField : enum
		System.out.println("ChronoField >>>>>");
		System.out.println(nn.with(ChronoField.YEAR, 1988));
		System.out.println(nn.with(ChronoField.MONTH_OF_YEAR, 9));
		System.out.println(nn.with(ChronoField.DAY_OF_MONTH, 13));
		System.out.println(nn.with(ChronoField.HOUR_OF_DAY, 16));
		System.out.println(nn.with(ChronoField.MINUTE_OF_HOUR, 36));
		System.out.println(nn.with(ChronoField.SECOND_OF_MINUTE, 24));
		System.out.println(nn.with(ChronoField.NANO_OF_SECOND, 888777666));
		
		System.out.println("TemporalAdjusters >>>>>");
		System.out.println(nn.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(nn.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println(nn.with(TemporalAdjusters.firstDayOfYear()));
		System.out.println(nn.with(TemporalAdjusters.lastDayOfYear()));
		System.out.println(nn.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println(nn.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println(nn.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));
		System.out.println(nn.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
		
		System.out.println("plusXXX >>>>>");
		System.out.println(nn);
		System.out.println(nn.plusYears(5));
		System.out.println(nn.plusMonths(5));
		System.out.println(nn.plusWeeks(5));
		System.out.println(nn.plusDays(5));
		System.out.println(nn.plusHours(5));
		System.out.println(nn.plusMinutes(5));
		System.out.println(nn.plusSeconds(5));
		System.out.println(nn.plusNanos(5));
		
		System.out.println("minusXXX >>>>>");
		System.out.println(nn);
		System.out.println(nn.minusYears(5));
		System.out.println(nn.minusMonths(5));
		System.out.println(nn.minusWeeks(5));
		System.out.println(nn.minusDays(5));
		System.out.println(nn.minusHours(5));
		System.out.println(nn.minusMinutes(5));
		System.out.println(nn.minusSeconds(5));
		System.out.println(nn.minusNanos(5));;
		
		LocalDateTime n1 = LocalDateTime.of(2025,10,10,10,10);
		LocalDateTime n2 = LocalDateTime.of(2025,11,11,11,11);
		LocalDateTime n3 = LocalDateTime.of(2025,11,11,11,11);
		LocalDateTime n4 = LocalDateTime.of(2025,12,12,12,12);
		System.out.println("isAfter >>>>>");
		System.out.println(n2.isAfter(n1));
		System.out.println(n2.isAfter(n3));
		System.out.println(n2.isAfter(n4));
		System.out.println("isBefore >>>>>");
		System.out.println(n2.isBefore(n1));
		System.out.println(n2.isBefore(n3));
		System.out.println(n2.isBefore(n4));
		System.out.println("isEqual >>>>>");
		System.out.println(n2.isEqual(n1));
		System.out.println(n2.isEqual(n3));
		System.out.println(n2.isEqual(n4));
		System.out.println("compareTo >>>>>");
		System.out.println(n2.compareTo(n1));
		System.out.println(n2.compareTo(n3));
		System.out.println(n2.compareTo(n4));
		
		System.out.println("LocalDate, LocalTime >>>>>");
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now(); 
		System.out.println(ld);
		System.out.println(lt);
		ld = LocalDate.of(2013, 10, 11);
		lt = LocalTime.of(15, 14, 13, 111222333);
		System.out.println(ld);
		System.out.println(lt);
		nn = LocalDateTime.of(ld, lt);
		System.out.println(nn);
		nn = LocalDateTime.of(2009,9,9,8,8,8,888777666);
		System.out.println(nn);
		ld = nn.toLocalDate();
		lt = nn.toLocalTime();
		System.out.println(ld);
		System.out.println(lt);
		
		
		System.out.println("formatter >>>>>");
		DateTimeFormatter dtf;
		nn = LocalDateTime.of(2009,6,3,16,06,27,987456321);
		ZoneId zone = ZoneId.of("Asia/Seoul");
		ZonedDateTime zt = nn.atZone(zone);
		dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss");
		String ttt = nn.format(dtf);
		System.out.println(ttt);
		
		String [] ppArr={
			"y", "yy","yyy","yyyy",
			"u", "uuuu",  //ISO 연도
			"M","MM","MMM","MMMM",
			"d","dd",
			"D","DD",
			"e","ee",  // 요일 숫자 1~7
			"E","EE","EEE","EEEE",
			"w","ww",  //년단위 주
			"W",			//월단위 주
			"H","HH",	//0~23
			"h","hh",	// 12시간
			"m","mm",
			"s","ss",
			"S","SS","SSS","SSSS","SSSSSS","SSSSSSSSS",	// 밀리초, 나노초
			"n",			// 나노초
			"a",			// AM/PM
			"z","Z","X"	// timeZone  
		};
		
		for (String pp : ppArr) {
			//dtf = DateTimeFormatter.ofPattern(pp);
			//dtf = DateTimeFormatter.ofPattern(pp,Locale.KOREAN);
			dtf = DateTimeFormatter.ofPattern(pp,Locale.ENGLISH);
			System.out.println(pp +":"+zt.format(dtf));
		}
		
		String asdf = "2015-08-26 10:23:49";
		dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		nn = LocalDateTime.parse(asdf, dtf);
		System.out.println(nn);
		
		//LocalDateJuminMain
		//주민번호를 이용하여 
		//생년월일
		//나이
		//올해생일

		//다가올 생일
		//다가올 생일파티(토, 일 인경우 전 금요일)
		//생일파티 D-day 를 출력하세요
		
	}

}
