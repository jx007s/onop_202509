package oops_p;

class NAParam{
	String a="정의시a";
	int b=10;
	void fn() {
		System.out.println("NAParam fn()"+a+","+b);
	}
}

class NAOuter{
	void meth(NAParam pp) {
		System.out.println("외부 meth() 시작------");
		pp.fn();
		System.out.println("외부 meth() 끝------");
	}
}


public class NestedAnnoMain {

	public static void main(String[] args) {
		NAOuter oo = new NAOuter();
		oo.meth(new NAParam());
		
		//메소드 호출시 새로 정의되고 접근되지 않아 재사용이 불가
		//익명성이 우수하다 : 익명 이너클래스
		// 익명이너 클래스 - 클래스 생성, 인터페이스 생성시 재정의
		// 주로 람다식에서 사용
		oo.meth(new NAParam() {
			@Override
			void fn() {
				System.out.println("매개변수 입력시 재정의 fn()");
			}
		});
		
		

	}

}
