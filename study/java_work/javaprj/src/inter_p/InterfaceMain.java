package inter_p;

// 인터페이스 정의
interface InA{
	// 멤버상수 : static, final 이 기본
	int a = 10, b = 20;
	
	//void meth_1() {}  일반 메소드 정의 불가
	
	//추상메소드 정의
	void meth_2();  //public,  abstract 기본
	void meth_3();  //public,  abstract 기본
}


interface InB{
	int a = 1234, c = 5678;
	
	//추상메소드 정의
	void meth_2();
	void meth_4();
}


// 인터페이스 구현 클래스
// 다중구현 가능
// class 클래스명 implements 인터페이스1, 인터페이스2,...
//class InASDF extends InA{
class InASDF implements InA, InB{
	
	public void meth_2() {
		System.out.println("InASDF 재정의 meth_2()");
	}
	public void meth_3() {
		System.out.println("InASDF 재정의 meth_3()");
	}
	public void meth_4() {
		System.out.println("InASDF 재정의 meth_4()");
	}
}

public class InterfaceMain {

	public static void main(String[] args) {
		InA ia = new InA() {
			public void meth_2() {
				System.out.println("ia 생성시 재정의 meth_2()");
			}
			public void meth_3() {
				System.out.println("ia 생성시 재정의 meth_3()");
			}
		};
		System.out.println("ia : "+ia);
		System.out.println("ia : "+ia.a+","+ia.b);
		//ia.a = 1000;
		System.out.println("InA : "+InA.a+","+InA.b);
		ia.meth_2();
		ia.meth_3();
		
		InASDF asdf = new InASDF();
		System.out.println("asdf : "+asdf);
		//System.out.println("asdf : "+asdf.a+","+asdf.b);
		//   a 는 InA, InB 에서 중첩
		System.out.println("asdf : "+asdf.b+","+asdf.c);
		//asdf.a = 1000;
		asdf.meth_2();
		asdf.meth_3();
		asdf.meth_4();
		
		System.out.println("iia------------------------");
		
		InA iia = asdf;
		System.out.println("iia : "+iia);
		System.out.println("iia : "+iia.a+","+iia.b);
		iia.meth_2();
		iia.meth_3();
		//iia.meth_4();

		System.out.println("iib------------------------");
		
		InB iib = asdf;
		System.out.println("iib : "+iib);
		System.out.println("iib : "+iib.a+","+iib.c);
		iib.meth_2();
		//iib.meth_3();
		iib.meth_4();
	}

}
