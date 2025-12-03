package oops_p;

import java.util.Arrays;

class OverAAA{
	void meth(String a, int b) {
		System.out.println("meth : "+a+" , "+b);
	}
	
//	void meth(String a, int b) {
//		System.out.println("meth : "+a+" , "+b);
//	}
	
//	void meth(String a, int c) {
//		System.out.println("매개변수명이 다른것은 오버로딩이 아님 : "+a+" , "+c);
//	}
	
//	int meth(String a, int b) {
//		System.out.println("리턴과 오버로딩은 관계없음 : "+a+" , "+b);
//	}
	
	//오버로딩 :같은클래스, 같은 메소드명 -> 매개변수가 다름 : 다른 메소드로 인식
	void meth(String a, int b, int c) {
		System.out.println("갯수가 다른경우 : "+a+" , "+b+" , "+c);
	}
	
	void meth(String a, String b) {
		System.out.println("자료형이 다른경우 : "+a+" , "+b);
	}
	
	void meth(String a, double b) {
		System.out.println("자료형이 다른경우2 : "+a+" , "+b);
	}
	
	void meth(String a, short b) {
		System.out.println("자료형이 다른경우3 : "+a+" , "+b);
	}
	void meth(String a, int... b) {
		System.out.println("갯수가 다른경우4 : "+a+" , "+Arrays.toString(b));
	}
}

public class OverloadingMain {

	public static void main(String[] args) {
		OverAAA oa = new OverAAA();
		oa.meth("아기상어", 10);
		oa.meth("엄마상어", 111,222);
		oa.meth("이찬혁", "이수현");
		oa.meth("아빠상어", 10.34);
		oa.meth("할머니상어", (short)30);
		oa.meth("할아버지상어");
		oa.meth("삼촌상어",123,456,789);
		//oa.meth();
	}

}



