package util_p;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain {

	public static void main(String[] args) {
		//Calendar qwer = new Calendar();
		Calendar today = Calendar.getInstance();
		
		System.out.println(today);
		System.out.println(today.get(0));
		System.out.println(today.get(1));
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1);
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		// 일 월 화 수 목 금 토
		//  1 2 3  4 5  6 7
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println(today.get(Calendar.AM_PM));
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.MILLISECOND));
		
		//출력 방식 1984 년 3 월 20일 (수요일) 13:34:56.789
		cdToStr(today);
		
		System.out.println(today.getTimeInMillis());
		System.out.println(today.getTimeInMillis()/1000/60/60/24/365+1970);
		System.out.println(today.getActualMaximum(Calendar.YEAR));
		System.out.println(today.getActualMaximum(Calendar.MONTH));
		System.out.println(today.getActualMaximum(Calendar.DATE));
		System.out.println(today.getActualMaximum(Calendar.HOUR_OF_DAY));
		
		today.set(1997, 3-1, 20);
		cdToStr(today);
		today.set(1997, 3-1, 20,16,23);
		cdToStr(today);
		today.set(1997, 3-1, 20,16,23, 45);
		cdToStr(today);
		today.set(Calendar.YEAR, 2002);
		cdToStr(today);
		today.set(2000, 68-1, -200,1234,-8765, 11223344);
		cdToStr(today);
		today.setTimeInMillis(0);
		cdToStr(today);
		
		today = Calendar.getInstance();
		cdToStr(today);
		today.add(Calendar.MONTH, 5);
		cdToStr(today);
		today.add(Calendar.MONTH, -8);
		cdToStr(today);
		
		Calendar now = Calendar.getInstance();
		cdToStr(now);
		System.out.println(now.after(today));
		System.out.println(now.before(today));
		
		Date dd;
		
		dd = today.getTime();
		System.out.println(dd);
		
		dd = new Date();
		System.out.println(dd);
		today.setTime(dd);
		cdToStr(today);
		
	}
	
	static void cdToStr(Calendar aaa) {
		String ttt = aaa.get(Calendar.YEAR)+" 년 ";
		ttt += (aaa.get(Calendar.MONTH)+1)+" 월 ";
		ttt += aaa.get(Calendar.DATE)+" 일 (";
		ttt += "*일월화수목금토".charAt(aaa.get(Calendar.DAY_OF_WEEK))+"요일) ";
		ttt += aaa.get(Calendar.HOUR_OF_DAY)+":";
		ttt += aaa.get(Calendar.MINUTE)+":";
		ttt += aaa.get(Calendar.SECOND)+".";
		ttt += aaa.get(Calendar.MILLISECOND);
		System.out.println(ttt);
	}

}
