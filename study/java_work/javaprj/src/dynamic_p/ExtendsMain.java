package dynamic_p;

class ExPar{
	String a = "부모a";
	int b = 10;
	
	void meth_1() {
		System.out.println("부모 meth_1()  실행 : "+a +", "+b);
		
	}
	void meth_2() {
		System.out.println("부모 meth_2()  실행");
		
	}
}

class Uncle{}

class ExChild1 extends ExPar{ //, Uncle{ 다중상속 불가
	String c = "자식1c";
	int d = 400;
	
	void meth_3() {
		System.out.println("자식1 meth_3()  실행 : "+c +", "+d);
		//System.out.println("자식1 meth_3()  실행 : "+c +", "+e);
	}
	void meth_4() {
		System.out.println("자식1 meth_4()  실행");
		
	}
}

class ExChild2 extends ExPar{
	String e = "자식2e";
	int d = 4040;
	
	void meth_5() {
		//System.out.println("자식2 meth_5()  실행 : "+c +", "+d);
		System.out.println("자식2 meth_5()  실행 : "+e +", "+d);
		
	}
	void meth_4() {
		System.out.println("자식2 meth_4()  실행");
		
	}
}

public class ExtendsMain {

	public static void main(String[] args) {
		ExPar pp = new ExPar();
		ExChild1 cc1 = new ExChild1();
		ExChild2 cc2 = new ExChild2();
		
		System.out.println("pp : "+pp.a+","+pp.b);
		//System.out.println("pp : "+pp.c+","+pp.d);
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3();
		//pp.meth_4();
		System.out.println("cc1 : "+cc1.c+","+cc1.d);
		System.out.println("cc1 : "+cc1.a+","+cc1.b);
		//System.out.println("cc1 : "+cc1.e);
		cc1.meth_1();
		cc1.meth_2();
		cc1.meth_3();
		cc1.meth_4();
		//cc1.meth_5();
		//System.out.println("cc2 : "+cc2.c+","+cc2.d);
		System.out.println("cc2 : "+cc2.a+","+cc2.b);
		System.out.println("cc2 : "+cc2.e);
		cc2.meth_1();
		cc2.meth_2();
		//cc2.meth_3();
		cc2.meth_4();
		cc2.meth_5();

	}

}
