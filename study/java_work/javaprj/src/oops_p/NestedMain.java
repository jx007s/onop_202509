package oops_p;


class NNOuter{
	String name;
	int age;
	
	static String sa = "외부스태틱sa";
	static int sb = 1000;
	
	void meth_1() {
		System.out.println("외부meth_1() : "+name+","+age+","+mm1);
		System.out.println(mm1.name+","+mm1.bb);
		System.out.println(mm1.sa+","+mm1.sb);
		mm1.meth_2();
		mm1.meth_3();
		System.out.println("외부meth_1() ----------- ");
	}
	void meth_2() {
		System.out.println("외부meth_2()");
	}
	void meth_4() {
		System.out.println("외부meth_4()");
	}
	static void meth_s1() {
		System.out.println("외부스태틱meth_s1() : ");
		//System.out.println(mm1.name+","+mm1.bb);
		
		// mm1 인스턴스 변수 이므로 접근 불가
		//System.out.println(mm1.sa+","+mm1.sb);
		//System.out.println(mm1);
		
		// 클래스로 직접접근하여 static 접근 가능
		System.out.println(InnMM.sa+","+InnMM.sb);
		InnMM.meth_s2();
		InnMM.meth_s3();
		System.out.println("외부스태틱meth_s1() ----------- ");
	}
	static void meth_s2() {
		System.out.println("외부스태틱meth_s2()");
	}
	static void meth_s4() {
		System.out.println("외부스태틱meth_s4()");
	}
	
	NNOuter(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("NNOuter 생성자 실행");
	}
	@Override
	public String toString() {
		return "NNOuter [" + name + ", " + age + "]";
	}
	
	//멤버 이너 클래스 정의
	class InnMM{
		String name;
		int bb;
		
		static String sa = "InnMMsa";
		static int sb = 2222;
		InnMM(String name, int bb) {
			
			this.name = name;
			this.bb = bb;
			System.out.println("InnMM 생성자 실행");
		}
		
		void meth_2() {
			System.out.println("InnMM.meth_2()");
		}
		void meth_3() {
			System.out.println("InnMM.meth_3() 시작----------");
			//System.out.println("외부 : "+super.name+","+age);
			// 외부 클래스의 멤버 접근 : 외부클래스.this.멤버요소
			System.out.println("외부 : "+NNOuter.this.name+","+age);
			System.out.println("외부 : "+NNOuter.this);
			NNOuter.this.meth_2();
			meth_4();
			NNOuter.meth_s2();
			meth_s4();
			
			System.out.println("내부 : "+name+","+age);
			System.out.println("내부 : "+this);
			meth_2();
			meth_s2();
			
			System.out.println("InnMM.meth_3() 끝----------");
		}
		
		static void meth_s2() {
			System.out.println("InnMM.스태틱 meth_s2()");
		}
		static void meth_s3() {
			System.out.println("InnMM.스태틱 meth_s3()");
		}
		
		@Override
		public String toString() {
			return "InnMM [" + name + ", " + bb + "]";
		}		
		
		
	}
	
	//멤버변수 = 멤버이너인스턴스(클래스)생성
	InnMM mm1 = new InnMM("서태웅",17);
	
	
}

public class NestedMain {

	public static void main(String[] args) {
		
		NNOuter oo1 = new NNOuter("장동건", 55);
		NNOuter oo2 = new NNOuter("장서건", 47);
		
		System.out.println(oo1);
		System.out.println(oo2);
		
		oo1.meth_1();
		oo1.meth_2();
		
		System.out.println(oo1.mm1);
		System.out.println(oo2.mm1);
		oo1.mm1.meth_2();
		oo1.mm1.meth_3();
		oo1.meth_s1();
		System.out.println("oo1 : "+oo1.name+","+oo1.age);
		System.out.println("oo1.mm1 : "+oo1.mm1.name+","+oo1.mm1.bb);
		//System.out.println("oo1.mm1 : "+oo1.mm1.age); //외부인스턴스멤버 접근 불가
		System.out.println("oo1 스태틱 : "+oo1.sa+","+oo1.sb);
		System.out.println("oo1.mm1 스태틱 : "+oo1.mm1.sa+","+oo1.mm1.sb);
		//System.out.println("oo1.InnMM 스태틱 : "+oo1.InnMM.sa+","+oo1.InnMM.sb);
		//System.out.println("InnMM 스태틱 : "+InnMM.sa+","+InnMM.sb);
		// 외부에서 이너클래스의 스태틱 접근방법 : 아우터클래스.이너클래스.스태틱요소
		System.out.println("NNOuter.InnMM 스태틱 : "+NNOuter.InnMM.sa+","+NNOuter.InnMM.sb);
		NNOuter.InnMM.meth_s2();
		NNOuter.InnMM.meth_s3();
		
		
		System.out.println("[[[멤버 이너 클래스 메인에서 생성]]]");
		//NNOuter.InnMM ni1 = new NNOuter.InnMM("강백호",19);
		NNOuter.InnMM ni11 = oo1.new InnMM("송태섭",19);
		NNOuter.InnMM ni12 = oo1.new InnMM("정대만",20);
		
		NNOuter.InnMM ni21 = oo2.new InnMM("윤대협",21);
		NNOuter.InnMM ni22 = oo2.new InnMM("변덕규",22);
		
		oo1.age = 32;
		oo2.age = 27;
		System.out.println("ni11 >>>>");
		ni11.meth_3();
		System.out.println("ni12 >>>>");
		ni12.meth_3();
		System.out.println("ni21 >>>>");
		ni21.meth_3();
		System.out.println("ni22 >>>>");
		ni22.meth_3();
		
	}

}
