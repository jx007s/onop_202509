package util_p;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//생년월일
//나이
//올해생일

//다가올 생일
//다가올 생일파티(토, 일 인경우 전 금요일)
//생일파티 D-day 를 출력하세요
public class LocalDateJuminMain {

	public static void main(String[] args) {
		
		DateTimeFormatter dft= DateTimeFormatter.ofPattern("yyyy-MM-dd (E)");
		
		String jumin = "981217-1234567";
		//String birthStr = (((j-1)%4/2+19)+jumin).substring(0,8);
		//System.out.println(birthStr);
		LocalDate birth = LocalDate.parse(
				(((jumin.charAt(7)-'0'-1)%4/2+19)+jumin).substring(0,8), 
				DateTimeFormatter.ofPattern("yyyyMMdd")
				);
		LocalDate today = LocalDate.now();
		System.out.println("생년월일 : "+birth.format(dft));
		//System.out.println(today);
		int age = today.getYear()- birth.getYear()+1;
		System.out.println("나이 : "+age);
		birth = birth.withYear(today.getYear());
		System.out.println("올해생일 : "+birth.format(dft));

		if(birth.isBefore(today)) {
			//System.out.println("지남");
			birth = birth.plusYears(1);
		}
		System.out.println("다가올생일 : "+birth.format(dft));
		if(birth.getDayOfWeek().ordinal()==5) {
			birth = birth.minusDays(1);
		}else if(birth.getDayOfWeek().ordinal()==6) {
			birth = birth.minusDays(2);
		}
		System.out.println("다가올생일 : "+birth.format(dft));
		
		int cnt = 0;
		while(today.isBefore(birth)) {
			today=today.plusDays(1);
			cnt++;
		}
		System.out.println("D-day : "+cnt);
		
	}

}
