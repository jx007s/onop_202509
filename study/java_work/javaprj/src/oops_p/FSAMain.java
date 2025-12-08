package oops_p;

abstract class FSAPar{
	public int pa = 10;
	protected int pb = 20;
	int pc = 30;
	private int pd = 40;
	
	// 멤버변수인 경우 : 대입불가
	final public int fpa = 10;
	final protected int fpb = 20;
	final int fpc = 30;
	final private int fpd = 40;
	
	static public int spa = 10;
	static protected int spb = 20;
	static int spc = 30;
	static private int spd = 40;
	
//	abstract public int apa = 10;
//	abstract protected int apb = 20;
//	abstract int apc = 30;
//	abstract private int apd = 40;
	
	// 자료형 앞에는 순서가 정해져 있지 않음
	final static public int fspa = 10;
	protected static final int fspb = 20;
	final static int fspc = 30;
	static final private int fspd = 40;
	
	
	public void 		m1()    	{ System.out.println("m1 실행"); }
	protected void 	m2()		{ System.out.println("m2 실행"); }
	public void 		m3()    	{ System.out.println("m3 실행"); }
	private void 	m4()		{ System.out.println("m4 실행"); }
	
	//메소드인 경우 overriding 불가
	final public void fm1()    	{ System.out.println("fm1 실행"); }
	final protected void fm2() 	{ System.out.println("fm2 실행"); }
	final public void fm3()    	{ System.out.println("fm3 실행"); }
	final private void fm4()		{ System.out.println("fm4 실행"); }
	
	static public void sm1()    	{ System.out.println("sm1 실행"); }
	static protected void sm2() 	{ System.out.println("sm2 실행"); }
	static public void sm3()    	{ System.out.println("sm3 실행"); }
	static private void sm4()	{ System.out.println("sm4 실행"); }
	
	abstract public void 		am1();
	abstract protected void 		am2();
	abstract public void 		am3();
	//abstract private void 		am4();		불가 - 오버라이딩을 할 수 없음
	
	
	static final public void fsm1()    	{ System.out.println("fsm1 실행"); }
	static final protected void fsm2() 	{ System.out.println("fsm2 실행"); }
	static final public void fsm3()    	{ System.out.println("fsm3 실행"); }
	static final private void fsm4()		{ System.out.println("fsm4 실행"); }
	
	//재정의와 상수화를 동시에 할 수 없음
//	final abstract public void 		fam1();
//	final abstract protected void 	fam2();
//	final abstract public void 		fam3();
	
	//정적 요청시 재정의 불가
//	static abstract public void 		sam1();
//	static abstract protected void 	sam2();
//	static abstract public void 		sam3();
	
	
}

class FSAChild extends FSAPar{
	
	public int pa = 1000;
	protected int pb = 2000;
	int pc = 3000;
	private int pd = 4000;
	
	final public int fpa = 1000;
	final protected int fpb = 2000;
	final int fpc = 3000;
	final private int fpd = 4000;
	
	static public int spa = 1000;
	static protected int spb = 2000;
	static int spc = 3000;
	static private int spd = 4000;
	
	public void 		m1()    	{ System.out.println("m1 자식 실행"); }
	protected void 	m2()		{ System.out.println("m2 자식 실행"); }
	public void 		m3()    	{ System.out.println("m3 자식 실행"); }
	private void 	m4()		{ System.out.println("m4 자식 실행"); }
	
//  final 재정의 불가	
//	final public void fm1()    	{ System.out.println("fm1 자식 실행"); }
//	final protected void fm2() 	{ System.out.println("fm2 자식 실행"); }
//	final public void fm3()    	{ System.out.println("fm3 자식 실행"); }
	//  fm4()- 재정의가 아님
	final private void fm4()		{ System.out.println("fm4 자식 실행"); }
	
	static public void sm1()    	{ System.out.println("sm1 자식 실행"); }
	static protected void sm2() 	{ System.out.println("sm2 자식 실행"); }
	static public void sm3()    	{ System.out.println("sm3 자식 실행"); }
	static private void sm4()	{ System.out.println("sm4 자식 실행"); }
	
	public void 		am1()    	{ System.out.println("am1 재정의 실행"); }
	protected void 	am2()		{ System.out.println("am2 재정의 실행"); }
	public void 		am3()    	{ System.out.println("am3 재정의 실행"); }
}

// 클래스 상수화
final class FSAFF{
	
}

/* 상수화 클래스 상속 불가
class FSAFFChild extends FSAFF{
	
}*/


public class FSAMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

