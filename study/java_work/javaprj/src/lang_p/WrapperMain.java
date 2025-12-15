package lang_p;

public class WrapperMain {

	public static void main(String[] args) {
		int i = new Integer(123);
		
		System.out.println(i);
		
		Integer i2 = 345;
		System.out.println(i2);
		i = i2;
		System.out.println(i);
		
		//i = null;
		i2 = null;
		
		i = 789;
		i2 = i;
		System.out.println(i2);
		
		i2 = Integer.parseInt("135");
		System.out.println(i2);
		i2 = Integer.parseInt("101");
		System.out.println(i2);
		i2 = Integer.parseInt("101",2);
		System.out.println(i2);
		i2 = Integer.parseInt("13");
		System.out.println(i2);
		i2 = Integer.parseInt("13",8);
		System.out.println(i2);
		i2 = Integer.parseInt("13",16);
		System.out.println(i2);
		i2 = Integer.parseInt("1B",16);
		System.out.println(i2);
		
		byte bb = Byte.parseByte("123");
		System.out.println(bb);
		short ss = Short.parseShort("123",8);
		System.out.println(ss);
		long ll = Long.parseLong("1234567890987");
		System.out.println(ll);
		
		float ff = Float.parseFloat("123.456");
		System.out.println(ff);
		double dd = Double.parseDouble("987.654");
		System.out.println(dd);
		
		boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		//char ch = Character.parseCharacter("A"); 없음
		char ch = "A".charAt(0);
		System.out.println(ch);


		//Integer.parseInt("123.456"); 에러
		 Double.parseDouble("456");
		 //Double.parseDouble("456.asd234");
		 
		 
		 // WrapperMemberMain
		//사진 파일을 확인하세요 ex) 영업_홍길동_20110823.jpg
		//이미지파일만 가능토록 - jpg,bmp,gif (대소문자 구분안함)
		//파일명이 부서명, 회원 이름, 입사일이 될 것
		//입사년도는 숫자만 입력토록 함(8자리만 가능)
		//호봉수를 계산할 것 (년도단위에서 절삭)
		//성명은 2-4자만 기록 가능 
	}

}
