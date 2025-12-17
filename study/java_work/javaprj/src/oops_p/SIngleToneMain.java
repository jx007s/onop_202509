package oops_p;

class SIngleTTT{
	
	String a="장동건";
	int b = 10;
	
	private static SIngleTTT me = null;
	
	private SIngleTTT() {
		System.out.println("기본생성자 실행");
	}
	
	public static SIngleTTT getInstance() {
		
		if(me==null) {
			me = new SIngleTTT();
		}
		return me;
	}

	@Override
	public String toString() {
		return "SIngleTTT [a=" + a + ", b=" + b + "]";
	}
	
	
}

public class SIngleToneMain {

	public static void main(String[] args) {
		//SIngleTTT st = new SIngleTTT();
		//System.out.println(SIngleTTT.me);
		
		SIngleTTT st1 = SIngleTTT.getInstance();
		System.out.println("------------");
		SIngleTTT st2 = SIngleTTT.getInstance();
		System.out.println("------------");
		st1.a = "원빈";
		st2.b = 20;
		System.out.println(st1==st2);
		System.out.println(st1);
		System.out.println(st2);

	}

}
