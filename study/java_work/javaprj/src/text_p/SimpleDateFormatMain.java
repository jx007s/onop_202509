package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

	public static void main(String[] args) throws Exception {
		Date today = new Date();
		System.out.println(today);
		
		String [] ppArr = {
			"y","yy","yyyy",
			"M","MM","MMM", "MMMM",
			"d","dd","DD","DDD",
			"w","ww","W","WW",
			"E","EE","EEE","EEEE",
			"F",
			"z","Z",
			
			"a", "H","HH","h","hh",
			"m","mm",
			"s","ss",
			"S","SSS"
		};
		
		//Locale loc = new Locale("en");
		
		for (String pp : ppArr) {
			
			//SimpleDateFormat sdf = new SimpleDateFormat(pp, loc);
			SimpleDateFormat sdf = new SimpleDateFormat(pp, Locale.ENGLISH);
			
			System.out.println(pp +" : "+sdf.format(today));
			
		}
		
		// '89年  nov 28일 (화) 05:07:30  형태로 출력해 주세요
		
		String ttt = new SimpleDateFormat("''yy年 MMM 28일 (",  Locale.ENGLISH).format(today);
		ttt += new SimpleDateFormat("E) HH:mm:ss").format(today);
		System.out.println(ttt);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		today = sdf.parse("1988-06-05 15:32:45.23");
		System.out.println(today);
		today = sdf.parse("1988-194-89 98:65:85.153");
		System.out.println(today);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		today = sdf.parse("2020-02-20");
		System.out.println(today);
		
		sdf = new SimpleDateFormat("HH:mm:ss");
		today = sdf.parse("19:23:16");    //날짜 명시하지 않을 경우 1970-1-1
		System.out.println(today);
		
		//DateJuminMain
		//주민번호 이용
		//생년월일
		//나이
		//올해생일

		//다가올 생일
		//다가올 생일파티(토, 일 인경우 전 금요일)
		//생일파티 D-day 를 출력하세요

	}

}
