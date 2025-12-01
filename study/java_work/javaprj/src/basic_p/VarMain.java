package basic_p;

public class VarMain {

	public static void main(String[] args) {
		var a1 = 10;			//가변 자료형 - int
		//let a2 = 20;		존재하지 않음
		//a3 = 30;			존재하지 않음
		//const int a4 = 40;		//존재하지 않음
		final int a5 = 50;		//상수화
		System.out.println(a1);
		System.out.println(a5);
		//a1 = 123.456;		// 최초 대입되는 변수 값으로 자료형 결정
		a1 = 123;
		//a5 = 60;		대입불가
		System.out.println(a1);
		
		
		byte bb = 123;
		//System.out.println(``);  ` 허용안함
		System.out.println("bb : "+bb);
		//bb = 128;   byte : -128~127
		
		short sh = 128;
		System.out.println("sh : "+sh);
		sh = 32767;
		System.out.println("sh : "+sh);
		//sh = 32768;	short : -32768 ~ 32767
		
		int ii = 32768;
		System.out.println("ii : "+ii);
		ii = 2147483647;
		System.out.println("ii : "+ii);
		//ii = 2147483648;
		//System.out.println(2147483648);  정수 기본 자료형 :  int -> 
						//int의 범주를 넘어갈 경우 long 으로 처리  정수L 
		System.out.println(2147483648L);
		//ii = 2147483648L;
		
		long lo = 2147483648L;
		System.out.println(lo);
		lo = 9223372036854775807L;
		System.out.println(lo);
		//lo = 9223372036854775808L;
		
		
		//ii = 123.456;  int : 실수 대입불가
		
		float ff = 123.456F;  // 실수의 기본 자료형 double
		System.out.println(ff);
		ff = 678;
		System.out.println(ff);
		
		double dd = 123.456;
		System.out.println(dd);
		dd = 789;
		System.out.println(dd);
		
		
		char ch = 'a';  // 한글자만 허용
		System.out.println(ch);
		//ch = "a";  " 문자열
		//ch = '';
		//ch = 'ab';
		ch = '가';
		System.out.println(ch);
		
		boolean bo = true;
		System.out.println(bo);
		bo = false;
		System.out.println(bo);
		
		//bo = 1;
		
		String tt = "아기상어";
		System.out.println(tt);
		String tt2 = new String("엄마상어");
		System.out.println(tt2);
	}

}
