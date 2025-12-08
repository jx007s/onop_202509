package pac_1;



// 			클래스내부	 	같은패키지	 	다른패키지		 전체
//									자손클래스			
//public 	 	O	 		O	 		O	 	  O
//protected	 	O	 		O	 		O	 
//default (생략)	O	 		O	 	 
//private 	 	O

/*
우선순위
 
1. 선언 및 생성시 직접명시
    pac.pac_1.CCC p1c = new pac.pac_1.CCC();

2. import 시 클래스 직접 호출
     import pac_2.CCC;

3. 같은 패키지 내 클래스 호출

4. import 시 패키지내 클래스 자동 호출
      import pa_2.*; 
 * */


import pac_2.CCC;	// 다른 패키지 의 public 클래스 사용시  import 필요
//import pac_2.EEE;  // 다른 패키지 의 기본 클래스 import 불가
//import pac_2.FFF;
import pac_2.*;		// pac_2 의 접근 가능한 모든 클래스 허용

class AAA{
	String a = "p1.AAA.a";
	private String d = "p1.AAA.private_d"; // 클래스 내부에서만 접근가능
	
	void mm1() {
		System.out.println("p1.AAA.mm1() 실행");
	}
	private void mm4() {
		System.out.println("p1.AAA.private_mm4() 실행");
	}
	
	void meth() {
		System.out.println("AAA.meth  시작 ---------");
		System.out.println(a+","+d);
		mm1();
		mm4();
		System.out.println("AAA.meth  끝 ---------");
	}
}

public class PacMain {

	public static void main(String[] args) {
		System.out.println("메인 시작 ---------------");
		
		AAA p1a = new AAA();
		BBB p1b = new BBB();  // 같은 패키지 내 정의된 클래스 사용가능
		pac_1.CCC p1c = new pac_1.CCC();
		CCC p2c = new CCC();		// 다른 패키지 의 클래스 사용시  import 필요
		FFF p2f = new FFF();		// 다른 패키지 의 클래스 사용시  import 필요
		
		
			
		
		System.out.println("p1a.a : "+p1a.a);
		p1a.mm1();
//		System.out.println("p1a.d : "+p1a.d);   private 접근 불가
//		p1a.mm4();
		p1a.meth();
		System.out.println("p1b.a : "+p1b.a);
		p1b.mm1();
		
		System.out.println("p1c : "+p1c);
		System.out.println("p1c.a : "+p1c.a);  //다른패키지 클래스의 기본 멤버접근불가
		p1c.mm1();
		System.out.println("p1c.b : "+p1c.b);  //다른패키지 클래스의 public 멤버접근 가능
		p1c.mm2();
		
		System.out.println("p2c : "+p2c);
//		System.out.println("p2c.a : "+p2c.a);  다른패키지 클래스의 기본 멤버접근불가
//		p2c.mm1();
		System.out.println("p2c.b : "+p2c.b);  //다른패키지 클래스의 public 멤버접근 가능
		p2c.mm2();
		System.out.println("p2f.b : "+p2f.b);  //다른패키지 클래스의 public 멤버접근 가능
		p2f.mm2();
		
		
		GChild gc = new GChild();
		//System.out.println("gc.a : "+gc.a);
		System.out.println("gc.b : "+gc.b);	//public 만 가능
		//System.out.println("gc.c : "+gc.c);
		//System.out.println("gc.d : "+gc.d);
		//gc.mm1();
		gc.mm2();
		//gc.mm3();
		//gc.mm4();
		gc.meth();
	}

}
