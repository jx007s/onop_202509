package util_p;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

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
		DayOfWeek dd = nn.getDayOfWeek();  //요일
		System.out.println(dd);
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
	}

}
