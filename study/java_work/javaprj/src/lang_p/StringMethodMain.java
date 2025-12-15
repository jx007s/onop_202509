package lang_p;

import java.util.Arrays;

public class StringMethodMain {

	public static void main(String[] args) {
		String a = "아기상어 뚜루루뚜루 aBCd EfG JavA 만세 ja 12a3a4";
		//          01 23 456 78 90123456789012345 67890123456

		System.out.println(a);
		System.out.println(a.length());
		char ch = a.charAt(2);
		System.out.println(ch);
		
		String b = "a2023LSH";
		int yy = 0;
		for (int i = 1; i <=4; i++) {
			
			yy*=10;
			int c = b.charAt(i)-'0';
			yy += c;
			System.out.println(c+","+b.charAt(i)+","+yy);
		}
		
		String d = a.substring(7);
		System.out.println(d);
		d = a.substring(7,13);
		System.out.println(d);
		
		int pos = a.indexOf("a");
		System.out.println(pos);
		pos = a.indexOf("a",11);
		System.out.println(pos);
		pos = a.indexOf("a",12);
		System.out.println(pos);
		
		pos = a.indexOf("a",12,22);
		System.out.println(pos);
		pos = a.indexOf("a",12,21); //12 -21  
		System.out.println(pos);
		pos = a.indexOf("k");
		System.out.println(pos);
		pos = a.indexOf("av");
		System.out.println(pos);
		pos = a.indexOf("A");
		System.out.println(pos);
		
		pos = a.lastIndexOf("a");
		System.out.println(pos);
		pos = a.lastIndexOf("a",34);
		System.out.println(pos);
		
		
		String fff = "aasseedd.파일.최종.진짜.마지막.끝.수정.1.ppt";
		pos = fff.lastIndexOf(".");
		String ext = fff.substring(pos+1);
		System.out.println(ext);
		
		System.out.println(a.contains("fG"));
		System.out.println(a.contains("나는무너"));
		System.out.println(a.startsWith("아기"));
		System.out.println(a.startsWith("상어"));
		System.out.println(a.endsWith("3a4"));
		System.out.println(a.endsWith("aBCd"));
		
		a = "농구-축구,배구.탁구,,야구,족구";
		String [] arr = a.split(",");
		for (String tt : arr) {
			System.out.println(tt);
		}
		System.out.println("--------------------");
		for (String tt : a.split(",-")) {
			System.out.println(tt);
		}
		System.out.println("--------------------");
		for (String tt : a.split(".")) {
			System.out.println(tt);
		}
		System.out.println("--------------------");
		for (String tt : a.split("[.]")) {
			System.out.println(tt);
		}
		System.out.println("--------------------");
		for (String tt : a.split("[.,-]")) {
			System.out.println(tt);
		}
		
		String [] arr2 = {"달리기","줄다리기","줄넘기","기러기"};
		d = String.join("연결", arr2);
		System.out.println(d);
		
		a = "아기상어 뚜루루뚜루 aBCd EfG JavA 만세 ja 12a3a4";
		d = a.replace("a","에이");
		System.out.println(d);
		d = a.replaceAll("a","에이");
		System.out.println(d);
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		char [] arr5 = a.toCharArray();
		System.out.println(Arrays.toString(arr5)  );
		
		a = "레고";
		System.out.println(a.repeat(5));
		d = a.concat("놀이");
		System.out.println(d);
		a = "     onop 12기     ";
		System.out.println(a+","+a.length());
		d = a.trim();
		System.out.println(d+","+d.length());
		
		 /*
		StringJuminMain
		950320-1234567
		주민번호를 이용하여
		성별, 국적(내국인/외국인), 생년월일, 한국나이, 만나이를
		 출력하세요
		1. 1900 년대 내국인 남성
		2. 1900 년대 내국인 여성
		########################
		3. 2000 년대 내국인 남성
		4. 2000 년대 내국인 여성
		########################
		-----------------------------------------------------
		5. 1900 년대 외국인 남성
		6. 1900 년대 외국인 여성
		########################
		7. 2000 년대 외국인 남성
		8. 2000 년대 외국인 여성
		*/		
		
	}

}
