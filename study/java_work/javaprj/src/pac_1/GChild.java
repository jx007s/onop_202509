package pac_1;

import pac_2.GGG;

public class GChild extends GGG{

	void meth() {
		System.out.println("GChild.meth  시작 ---------");
		//System.out.println("a : "+a);
		System.out.println("b : "+b);	//public 가능
		System.out.println("c : "+c);	//protected 가능  : 다른 패키지 부모클래스 
		//System.out.println("d : "+d);
		//mm1();
		mm2();	//public 가능
		mm3();	//protected 가능
		//mm4();
		System.out.println("GChild.meth  끝 ---------");
	}
}

