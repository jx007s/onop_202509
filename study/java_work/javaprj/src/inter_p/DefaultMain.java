package inter_p;

interface InDD2 {

	void meth_2();

	void meth_3();	
	
	// InDD에도 같은 이름의 메소드가 정의되어 있음-meth_6() 
	default void meth_6() {
		System.out.println("InDD2 meth_6() 실행");
	}
	
	default void meth_8() {
		System.out.println("InDD2 meth_8() 실행");
	}
}

interface InDDToT extends  InDD, InDD2{

	// 중첩된 default 메소드 재정의 필수
	@Override
	default void meth_6() {
		System.out.println("InDDToT meth_6() 실행");
	}
	
}



class ClaInDD implements InDD, InDD2{

	@Override
	public void meth_1() {
		System.out.println("ClaInDD meth_1() 실행");
	}

	@Override
	public void meth_3() {
		System.out.println("ClaInDD meth_3() 실행");
	}

	@Override
	public void meth_4() {
		System.out.println("ClaInDD meth_4() 실행");
	}

	@Override
	public void meth_5() {
		System.out.println("ClaInDD meth_5() 실행");
	}
	
	@Override
	public void meth_2() {
		System.out.println("ClaInDD meth_2() 실행");
	}

	// 구현하는 인터페이스의 default 메소드가 중첩될 경우 반드시 재정의하여 충돌을 피해야 한다.
	@Override
	public void meth_6() {
		System.out.println("ClaInDD meth_6() 실행");
	}
	
}

public class DefaultMain {

	public static void main(String[] args) {
		ClaInDD cdd = new ClaInDD();
		cdd.meth_1();
		cdd.meth_3();
		cdd.meth_4();
		cdd.meth_5();
		// default 메소드가 중첩되어 있어 구현 클래스에서 재정의한 메소드 호출
		cdd.meth_6();
		cdd.meth_7();
		cdd.meth_8();
		cdd.meth_2();

	}

}
