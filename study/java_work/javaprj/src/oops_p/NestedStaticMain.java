package oops_p;


class NSOuter{
	String a;
	int b;
	
	static String sa = "외부스태틱sa";
	static int sb = 1000;
	
	
	void meth_1() {	
		System.out.println("외부meth_1() ----------- 시작");
		System.out.println(mm1);
		System.out.println(mm1.b+","+mm1.c);
		System.out.println(mm1.sb+","+mm1.sc);
		System.out.println(NSInner.sb+","+NSInner.sc);
		mm1.meth_4();
		mm1.meth_s4();
		System.out.println("외부meth_1() ----------- 끝");
	}
	void meth_2() {
		System.out.println("외부meth_2()");
	}
	void meth_3() {
		System.out.println("외부meth_3()");
	}
	static void meth_s1() {
		System.out.println("외부스태틱meth_s1() : ");
		
	}
	static void meth_s2() {
		System.out.println("외부스태틱meth_s2()");
	}
	static void meth_s4() {
		System.out.println("외부스태틱meth_s4()");
	}
	NSOuter(String a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "NSOuter [a=" + a + ", b=" + b + "]";
	}
	
	NSInner mm1 = new NSInner("멤버c", 234);
	//스태틱 멤버변수 선언으로 스태틱이너클래스 가능
	static NSInner mm2 =  new NSInner("s멤버c", 678);
	
	static class NSInner{
		String c;
		int b;
		static String sc = "스태틱내부스태틱sc";
		static int sb = 2222;
		NSInner(String c, int b) {
			this.c = c;
			this.b = b;
		}
		void meth_1() {	
			System.out.println("스태틱내부meth_1() 시작----------");
			//인스턴스메소드 일지라도 외부의 static 만 가능
			//System.out.println(NSOuter.this);
			//System.out.println(NSOuter.this.a+","+NSOuter.this.b);
			// 중첩된 경우에는 클래스명 기재 필요
			System.out.println(sa+","+NSOuter.sb);
			meth_s2();
			NSOuter.meth_s4();
			//내부 자신의 것은 모두 가능
			System.out.println(this);
			System.out.println(c+","+b);
			System.out.println(sc+","+sb);
			meth_4();
			meth_s4();
			System.out.println("스태틱내부meth_1() 끝----------");
		}
		void meth_4() {
			System.out.println("스태틱내부meth_4()");
		}
		static void meth_s1() {	
			System.out.println("스태틱내부static meth_s1() 시작-------------");
			//외부의 static 만 가능
			//System.out.println(NSOuter.this);
			//System.out.println(NSOuter.this.a+","+NSOuter.this.b);
			// 중첩된 경우에는 클래스명 기재 필요
			System.out.println(sa+","+NSOuter.sb);
			meth_s2();
			NSOuter.meth_s4();
			//내부 스태틱만 가능
			//System.out.println(this);
			//System.out.println(c+","+b);
			System.out.println(sc+","+sb);
			//meth_4();
			meth_s4();
			System.out.println("스태틱내부static meth_s1() 끝-------------");
		}
		static void meth_s4() {
			System.out.println("스태틱내부static meth_s4()");
		}
		@Override
		public String toString() {
			return "NSInner [c=" + c + ", b=" + b + "]";
		}
	}
	
}

public class NestedStaticMain {

	public static void main(String[] args) {
		NSOuter oo1 = new NSOuter("정우성", 11);
		NSOuter oo2 = new NSOuter("정좌성", 22);
		
		System.out.println("NSOuter.NSInner :"+NSOuter.NSInner.sc+","+NSOuter.NSInner.sb);
		NSOuter.NSInner.meth_s1();
		NSOuter.NSInner.meth_s4();
		//System.out.println("NSOuter.NSInner :"+NSOuter.NSInner.c+","+NSOuter.NSInner.b);
//		NSOuter.NSInner.meth_1();
//		NSOuter.NSInner.meth_4();
		NSOuter.NSInner.sc = "sssc";
		NSOuter.NSInner.sb = 2468;
		oo1.mm1.c = "mmc";
		oo2.mm1.b = 135;
		System.out.println("NSOuter.mm2 : "+NSOuter.mm2);
		System.out.println("NSOuter.mm2 : "+NSOuter.mm2.b+","+NSOuter.mm2.c+","+NSOuter.mm2.sb+","+NSOuter.mm2.sc);
		NSOuter.mm2.meth_1();
		NSOuter.mm2.meth_4();
		NSOuter.mm2.meth_s1();
		NSOuter.mm2.meth_s4();
		System.out.println("oo1 :"+oo1);
		System.out.println("oo1 :"+oo1.mm1);
		System.out.println("oo1 :"+oo1.mm1.c+","+oo1.mm1.b);
		System.out.println("oo1 :"+oo1.mm1.sc+","+oo1.mm1.sb);
		oo1.mm1.meth_1();
		oo1.mm1.meth_4();
		oo1.mm1.meth_s1();
		oo1.mm1.meth_s4();
		System.out.println("oo2 :"+oo2);
		System.out.println("oo2 :"+oo2.mm1);
		System.out.println("oo2 :"+oo2.mm1.c+","+oo2.mm1.b);
		System.out.println("oo2 :"+oo2.mm1.sc+","+oo2.mm1.sb);
		oo2.mm1.meth_1();
		oo2.mm1.meth_4();
		oo2.mm1.meth_s1();
		oo2.mm1.meth_s4();
		
		oo1.meth_1();
		
		NSOuter.NSInner ns1 = new NSOuter.NSInner("ns_c1", 9988);
		NSOuter.NSInner ns2 = new NSOuter.NSInner("ns_c2", 7766);
		//NSOuter.NSInner ns3 = oo1.new NSInner("ns_c3", 5544);

	}

}
