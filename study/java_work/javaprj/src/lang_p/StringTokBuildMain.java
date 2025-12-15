package lang_p;

import java.util.StringTokenizer;

public class StringTokBuildMain {

	public static void main(String[] args) {
		String a = "농구-축구,배구.탁구,,야구,족구";

		//java.util
		StringTokenizer stk = new StringTokenizer(a, ",.-");
		
		System.out.println(stk);
		
		while(stk.hasMoreElements()) {
			String bb = stk.nextToken();
			System.out.println(bb);
		}
		System.out.println("stk 종료--------------");
		
		
		//String : 불변 문자열 클래스
		a = "아기상어";
		String b = a+" 엄마상어";
		System.out.println(b);
		
		System.out.println("StringBuilder--------------");
		//StringBuilder : 가변 문자열 클래스 -- 단일쓰레드 환경에서 우수
		//java.lang
		StringBuilder sbr = new StringBuilder("아기상어");
		sbr.append(" 엄마상어").append(" 뚜루루뚜루 귀여운");
		System.out.println(sbr);
		sbr.insert(6,"1234");
		System.out.println(sbr);
		sbr.replace(7, 11, "세로"); // 7~10 ==> "세로"
		System.out.println(sbr);
		sbr.delete(13,19); // 13~18
		System.out.println(sbr);
		sbr.deleteCharAt(3);
		System.out.println(sbr);
		sbr.reverse();
		System.out.println(sbr);
		
		
		System.out.println("StringBuffer--------------");
		//StringBuffer : 가변 문자열 클래스  -- 멀티쓰레드 환경에서 우수
		//java.lang
		StringBuffer sbuf = new StringBuffer("아기상어");
		sbuf.append(" 엄마상어").append(" 뚜루루뚜루 귀여운");
		System.out.println(sbuf);
		sbuf.insert(6,"5678");
		System.out.println(sbuf);
		sbuf.replace(7, 11, "가로"); // 7~10 ==> "가로"
		System.out.println(sbuf);
		sbuf.delete(13,19); // 13~18
		System.out.println(sbuf);
		sbuf.deleteCharAt(3);
		System.out.println(sbuf);
		sbuf.reverse();
		System.out.println(sbuf);
		
	}

}
