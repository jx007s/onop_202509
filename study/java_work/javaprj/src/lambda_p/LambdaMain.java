package lambda_p;

@FunctionalInterface		// 람다식 : 추상메소드가 1개인 인터페이스 (함수형 인터페이스)
						//         2개이상의 추상메소드를 선언할 수 없다
interface QwerP2{
	
	// 리턴 O, 매개변수 2개
	String mmm(int a, int b);
	
	//String mmm2(int a, int b);  
}

interface QwerP1{
	
	// 리턴 O, 매개변수 1개
	String mmm(int a);
}

interface QwerP0{
	
	// 리턴 O, 매개변수 0개
	String mmm();
}

interface QwerRX{
	
	// 리턴 X, 매개변수 0개
	void mmm();
}

class LamMem{
	String pid;
	int age;
	boolean marriage;
	
	@Override
	public String toString() {
		return "LamMem [pid=" + pid + ", age=" + age + ", marriage=" + marriage + "]";
	}
}

interface QwerMem{
	
	// 리턴 LamMem, 매개변수 X
	LamMem mmm();
}





class LamAAA{
	void meth_1() {
		System.out.println("meth_1() 이지롱");
	}
	
	void meth_2(QwerP2 qq) {
		System.out.println("meth_2() 시작 ---------------");
		
		String rr = qq.mmm(10, 20);
		
		System.out.println("meth_2() 끝 "+rr);
	}
	
	void meth_11(QwerP1 qq) {
		System.out.println("meth_11() 시작 ---------------");
		
		String rr = qq.mmm(100);
		
		System.out.println("meth_11() 끝 "+rr);
	}
	
	void meth_00(QwerP0 qq) {
		System.out.println("meth_00() 시작 ---------------");
		
		String rr = qq.mmm();
		
		System.out.println("meth_00() 끝 "+rr);
	}
	
	void meth_rx(QwerRX qq) {
		System.out.println("meth_rx() 시작 ---------------");
		
		qq.mmm();
		
		System.out.println("meth_rx() 끝 ");
	}
	
	void meth_mem1(QwerMem qq) {
		
		LamMem mem = qq.mmm();
		mem.pid = "루키아";
		mem.age = 27;
		mem.marriage = false;
		
		System.out.println("meth_mem1() "+mem);
	}
	
	void meth_mem2(QwerMem qq) {
		
		LamMem mem = qq.mmm();
		mem.pid = "켄파치";
		mem.age = 38;
		mem.marriage = true;
		
		System.out.println("meth_mem2() "+mem);
	}
}

class LamQQ implements QwerP2{
	
	@Override
	public String mmm(int a, int b) {
		System.out.println("LamQQ.mmm() 이지롱 : "+(a-b));
		return "아기상어";
	}
}


class MyLamb{
	public String wsxcde(int a, int b) {
		System.out.println("MyLamb.인스턴스 wsxcde() 이지롱 : "+a+","+b);
		return "이치고";
	}
	
	public static String mm_s(int a, int b) {
		System.out.println("MyLamb.스태틱 mm_s() 이지롱 : "+a+","+b);
		return "아이젠소스케";
	}
	
}


public class LambdaMain {

	public static void main(String[] args) {
		LamAAA la = new LamAAA();
		la.meth_1();
		
		LamQQ lq = new LamQQ();
		la.meth_2(lq);
		
		
		
		la.meth_2(new QwerP2() {
			
			@Override
			public String mmm(int a, int b) {
				System.out.println("생성시 재정의 mmm() 이지롱 :"+(a+b));
				return "엄마상어";
			}
		});
		
		
		// 람다식
		la.meth_2((a,b)->{
			System.out.println("람다식 mmm() :"+a*b);
			return "아빠상어";
		});
		
		// 람다식 : 메소드 정의 구간 {} 생략 및 리턴값 바로 정의
		la.meth_2((a,b)->"할머니상어"+(b/a));

		la.meth_11((a)->"할아버지상어"+a);
		
		//매개변수 1개인 경우 () 생략 가능
		la.meth_11(a->"삼촌상어"+a);
		
		la.meth_00(()->"고모상어");
		
		//매개변수 0 () 생략 불가
		//la.meth_00(->"고모상어");
		
		la.meth_rx(()->{ 
			System.out.println("리턴없이 람다식");
		});
		//리턴 X {} 없이 리턴값 불가
		//la.meth_rx(()->"고모상어");
		
		
		// 메소드 참조
		MyLamb myL = new MyLamb();
		
		//인스턴스 메소드 참조
		la.meth_2(myL::wsxcde);
		
		//스태틱 메소드 참조
		la.meth_2(MyLamb::mm_s);
		
		
		
		//생성 참조
		la.meth_mem1(LamMem::new);
		la.meth_mem2(LamMem::new);
	}

}

/*
Lambda3Main
정수3개를 매개변수로 받고 정수1개를 리턴하는 람다식 가능한 인터페이스를 구현하세요

계산식은 3개를 구현하세요
1. 3개의 합 리턴
2. 3개중 가장 큰수를 리턴
3. 첫번째 두번째 매개변수를 곱하고 3번째 매개변수로 뺀 수 리턴
* */







