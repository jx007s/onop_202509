package oops_p;

/*
1. 클래스 영역
    >static 영역
      static 변수 공간할당 (초기값:0, null)   			--1
      static 메소드                            		--2
      static 변수 값 대입                           	--3
    >method 영역
      instance 메소드                               	--5

2. Heap 영역
      1.  instance 변수 공간할당 (초기값:0, null)  		--4
      2.  instance 변수 값대입                      	--6
      3.  생성자 실행              						--7

3. Stack 영역
   메소드의 지역 변수
 * */


class StaticCla{
	String a = "인스턴스a";
	int b = setB();
	int c = setC();
	int d = 40;
	int e = setE();
	int f = setF();
	
	
	StaticCla() {
		System.out.println("생성자");
	}
	
	int setB() {
		System.out.println("인스턴스 setB() 실행");
		return 10;
	}
	
	int setC() {
		System.out.println("인스턴스 setC() 실행");
		return 20;
	}
	int setE() {
		System.out.println("인스턴스 setE() 실행 : "+d);
		return d;
	}
	
	int setF() {
		System.out.println("인스턴스 setF() 실행 : "+g);
		return g;
	}
	void meth_1() {
		System.out.println("인스턴스 meth_1() 실행 : "+a+","+b+","+c+","+d+","+e+","+f+","+g);
		System.out.println("인스턴스 meth_1() 스태틱 : "+sa+","+sb+","+sc+","+sd+","+se+","+sf);
		meth_2();
		meth_s2();
		System.out.println("인스턴스 meth_1 끝--------------- ");
		
	}
	void meth_2() {
		int i = 1357;
		//static int j = 9988;  스태틱은 지역변수 선언 불가
		System.out.println("인스턴스 meth_2 실행 :"+i);
		
		/* 메소드 안에서 메소드 정의불가
		void methSub() {
			
		} 
		
		static void methSS() {
			
		}*/
		
	}
	
	static void meth_s2() {
		int i = 2468;
		//static int j = 7766;  //스태틱은 지역변수 선언 불가
		System.out.println("스태틱 meth_s2 실행 :"+i);
		
		/* 메소드 안에서 메소드 정의불가
		void methSubss() {
			
		} 
		
		static void methSSss() {
			
		}*/
	}
	
	
	int g = 70;
	
	
	static int sa = 100;
	//static int sb = setB();
	static int sb = setSB();
	static int sc = 300;
	static int sd = setSD();
	static int se = setSE();
	static int sf = 600;
	
	static int setSB() {
		int rr = 200;
		System.out.println("스태틱 setSB() 실행 : "+rr);
		return rr;
	}
	static int setSD() {
		System.out.println("스태틱 setSD() 실행 :"+sc);
		return sc;
	}
	static int setSE() {
		System.out.println("스태틱 setSE() 실행 :"+sf);
		return sf;
	}
	
	static void meth_s1() {
		System.out.println("스태틱 meth_s1() 실행 : "+sa+","+sb+","+sc+","+sd+","+se+","+sf);
		//System.out.println("인스턴스 접근 불가 : "+a+","+b+","+c+","+d+","+e+","+f+","+g);
		//meth_2();  인스턴스 접근 불가
		meth_s2();
		System.out.println("스태틱 meth_s1 끝--------------- ");
		
	}
}

public class StaticMain {
	
	int a = 2345;
	static int sb = 5678;
	
	public StaticMain() {
		System.out.println("main 생성자");
		System.out.println(a+","+sb);
	}

	public static void main(String[] args) {
		//System.out.println(StaticCla);
		//System.out.println(StaticCla.sa);
		StaticCla.meth_s1();
		StaticCla.sa = 1111;
		StaticCla.meth_s1();
		System.out.println("---------------------");
		StaticCla s1 = new StaticCla();
		System.out.println("---------------------");
		StaticCla s2 = new StaticCla();
		System.out.println("---------------------");
		s1.b = 101010;
		s2.c = 2345;
		s1.sb = 2468;
		s2.sc = 3210;
		s1.meth_1();
		s2.meth_1();
		System.out.println("---------------------");
		//System.out.println(a);
		System.out.println(sb);
		
		new StaticMain();
	}

}
