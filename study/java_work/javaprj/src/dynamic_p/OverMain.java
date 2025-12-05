package dynamic_p;

class OverPar{
	String a = "부모a", b = "부모b";
	
	void meth_1() {
		System.out.println("부모 meth_1 실행 : "+a+","+b);
	}
	void meth_2() {
		System.out.println("부모 meth_2 실행 : "+a+","+b);
	}
}

class OverChild  extends OverPar{
	String a = "자식a", c = "자식c";
	
	void meth_1() {
		System.out.println("자식 meth_1 실행 : "+a+","+b+","+c);
	}
	void meth_3() {
		System.out.println("자식 meth_3 실행 : "+a+","+b+","+c);
	}
}

class OverUncle{
	
}

public class OverMain {

	public static void main(String[] args) {
		OverPar pp = new OverPar();
		OverPar pc = new OverChild();
		//OverChild cp = new OverPar();
		OverChild cc = new OverChild();
		
		
		System.out.println("pp >>>>>");
		System.out.println(pp.a);
		System.out.println(pp.b);
		//System.out.println(pp.c);
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3();
		System.out.println("pc >>>>>");
		System.out.println(pc.a);
		System.out.println(pc.b);
		//System.out.println(pc.c);
		pc.meth_1();
		pc.meth_2();
		//pc.meth_3();
		
		System.out.println("cc >>>>>");
		cc.c = "아들c";
		System.out.println(cc.a);
		System.out.println(cc.b);
		System.out.println(cc.c);
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		
		OverPar pcc = cc;
		System.out.println("pcc >>>>>");
		System.out.println(pcc.a);
		System.out.println(pcc.b);
		//System.out.println(pcc.c);
		pcc.meth_1();
		pcc.meth_2();
		//pcc.meth_3();
		
		OverChild cpcc = (OverChild)pcc;  // down casting
		System.out.println("cpcc >>>>>");
		System.out.println(cpcc.a);
		System.out.println(cpcc.b);
		System.out.println(cpcc.c);
		cpcc.meth_1();
		cpcc.meth_2();
		cpcc.meth_3();
		
		//OverChild cpp =  (OverChild)pp;
		
		// instanceof 형변환 확인 - 상속관계에서만 가능
		System.out.println(pp instanceof OverPar);
		System.out.println(pp instanceof OverChild);
		System.out.println(cc instanceof OverPar);
		System.out.println(cc instanceof OverChild);
		
		//System.out.println(pp instanceof OverUncle);
	}

}
