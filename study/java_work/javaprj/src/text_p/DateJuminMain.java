package text_p;

import java.text.SimpleDateFormat;
import java.util.Date;

//DateJuminMain
//주민번호 이용
//생년월일
//나이
//올해생일

//다가올 생일
//다가올 생일파티(토, 일 인경우 전 금요일)
//생일파티 D-day 를 출력하세요

public class DateJuminMain {

	public static void main(String[] args) throws Exception {
		String jumin = "981217-1234567";
		String birthStr = (((jumin.charAt(7)-'0'-1)%4/2+19)+jumin).substring(0,8);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd (E)");
		Date today = new Date();
		Date birth = sdf1.parse(birthStr);
		System.out.println("생년월일:"+sdf2.format(birth));
		System.out.println("나이 : "+(today.getYear()-birth.getYear()+1));
		birth.setYear(today.getYear());
		System.out.println("올해생일:"+sdf2.format(birth));
		if(today.after(birth)) {
			birth.setYear(birth.getYear()+1);
		}
		System.out.println("다가올생일:"+sdf2.format(birth));
		if(birth.getDay()==6) {
			birth.setDate(birth.getDate()-1);
		}
		if(birth.getDay()==0) {
			birth.setDate(birth.getDate()-2);
		}
		System.out.println("생일파티:"+sdf2.format(birth));
		System.out.println("D-Day:"+ (birth.getTime()-today.getTime())/1000/60/60/24  );

	}

}
