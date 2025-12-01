package basic_p;

public class CastingMain {

	public static void main(String[] args) {
		System.out.println("자동형변환 (upcasting, 묵시적형변환)");
		byte bb = 123;
		int a = bb;
		long lo = a;
		
		System.out.println(bb);
		System.out.println(a);
		System.out.println(lo);
		lo = 9223372036854775807L;
		System.out.println(lo);
		
		float ff = bb;
		System.out.println(ff);
		ff = a;
		System.out.println(ff);
		ff = lo;
		System.out.println(ff);
		
		char ch = 'c';
		System.out.println(ch);
		a = ch;
		System.out.println(a);		//ASCII
		
		System.out.println("강제 형변환 (downcasting, 명시적 형변환)");
		
		a = 100;
		//bb = a;
		bb = (byte)a;
		System.out.println(bb);
		a = 254;
		bb = (byte)a;
		System.out.println(a);
		System.out.println(bb);
		
		
		double dd = 123.456;
		a = (int)dd;
		System.out.println(dd);
		System.out.println(a);
		a = 100;
		ch = (char)a;
		System.out.println(a);
		System.out.println(ch);
		
		boolean bo = true;
		//a = (int)bo;     boolean 형변환 불가
		a = 1;
		//bo = (boolean)a;
		
		
		
	}

}



/*
클래스 이름 ExamMain
번호, 성명, 국어, 영어, 수학, 총점, 평균(소숫점 2자리)을 선언하고 출력하세요
번호, 성명, 국어, 영어, 수학 정보 입력후 처리

출력 형태
반 : 2
성명 : 홍길동
영어 : 89
수학 : 78
국어 : 67
총점 : ?
평균 : ?
*/
