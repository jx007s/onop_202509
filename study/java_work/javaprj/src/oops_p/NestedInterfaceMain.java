package oops_p;

class NInOuter{
	
	public void meth_2() {  //외부 클래스의 메소드로 오버라이딩 불가
		System.out.println("외부 meth_2()");
	}
	public void meth_4() {
		System.out.println("외부 meth_4()");
	}
	
	//이너 인터페이스
	interface In1{
		String a = "이너a";
		void meth_1();
		void meth_2();
		default void meth_3() {
			 System.out.println("이너인터페이스meth_3()");
		}
	}
	
	In1 mm1 = new In1() {	
		@Override
		public void meth_2() {  //필수
			System.out.println("mm1 생성시 재정의 meth_2()");
		}
		
		@Override
		public void meth_1() {
			System.out.println("mm1 생성시 재정의 meth_1()");
		}
	}; 
	

}


public class NestedInterfaceMain {

	public static void main(String[] args) {
		
		NInOuter oo1 = new NInOuter();
		System.out.println(oo1.mm1);
		System.out.println(oo1.mm1.a);
		oo1.mm1.meth_1();
		oo1.mm1.meth_2();
		oo1.mm1.meth_3();
	}

}
