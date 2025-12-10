package inter_p;

public interface InDD {

	void meth_1();
//	void meth_2() {
//		
//	}
	
	public void meth_3();
	abstract void meth_4();
	public abstract void meth_5();
	
	//실행구간 정의 가능
	// InDD2에도 같은 이름의 메소드가 정의되어 있음-meth_6() 
	default void meth_6() {
		System.out.println("InDD meth_6() 실행");
	}
	
	//실행구간 정의 가능
	default void meth_7() {
		System.out.println("InDD meth_7() 실행");
	}
	
}
