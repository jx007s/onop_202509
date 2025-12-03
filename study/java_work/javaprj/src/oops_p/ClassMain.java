package oops_p;

import java.util.Arrays;

class AAA{
	String a = "아기상어";
	int b = 10;
	char d = '가';
	int [] arr = {11,22,33};
	
	void meth_1() {
		System.out.println("AAA.meth_1() 실행");
	}
	
	int meth_2() {
		System.out.println("AAA.meth_2() 실행");
		return 1234;
	}
	
	int meth_3(int a, boolean b) {
		//int a = 556677;  매개변수와 지역변수 중첩불가
		double d = 123.456;
		System.out.println("AAA.meth_3() 실행 : "+a+" , "+b+","+d+","+this.a+","+this.b+","+this.d);
		return 5678;
	}
}


public class ClassMain {

	public static void main(String[] args) {
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		
		System.out.println("a1 :"+a1+","+a1.a+","+a1.b+","+a1.arr+","+Arrays.toString(a1.arr));
		System.out.println("a2 :"+a2+","+a2.a+","+a2.b+","+a2.arr+","+Arrays.toString(a2.arr));
		
		a1.a = "엄마상어";
		a2.b = 20;
		a1.arr[0] = 135;
		a2.arr[1] = 246;

		System.out.println("a1 :"+a1+","+a1.a+","+a1.b+","+a1.arr+","+Arrays.toString(a1.arr));
		System.out.println("a2 :"+a2+","+a2.a+","+a2.b+","+a2.arr+","+Arrays.toString(a2.arr));
		
		//int rr = a1.meth_1();
		a1.meth_1();
		int rr = a1.meth_2();
		System.out.println(rr);
		rr = a1.meth_3(99,true);
		System.out.println(rr);
		rr = a2.meth_3(88,false);
		System.out.println(rr);
	}

}


