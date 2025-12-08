package pac_2;

public class GGG {
	String a = "p2.GGG.a";
	void mm1() {
		System.out.println("p2.GGG.mm1() 실행");
	}
	
	public String b = "p2.GGG.public_b";
	public void mm2() {
		System.out.println("p2.GGG.public_mm2() 실행");
	}
	
	protected String c = "p2.GGG.protected_c";
	protected void mm3() {
		System.out.println("p2.GGG.protected_mm3() 실행");
	}
	
	private String d = "p2.GGG.private_d";
	private void mm4() {
		System.out.println("p2.GGG.private_mm4() 실행");
	}
}

class HHH extends GGG{
	void meth() {
		System.out.println("HHH.meth  시작 ---------");
		System.out.println("a : "+a);
		System.out.println("b : "+b);	
		System.out.println("c : "+c);	
		//System.out.println("d : "+d);  private 접근불가
		mm1();
		mm2();	
		mm3();	
		//mm4();				//   private 접근불가
		System.out.println("HHH.meth  끝 ---------");
	}
}


