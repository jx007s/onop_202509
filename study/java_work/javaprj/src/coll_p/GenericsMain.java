package coll_p;

// generic : <QQ,EE>  ==> 타입의 추상화
class GenAAA<QQ,EE>{
	String a;
	QQ b;
	
	GenAAA() {
		System.out.println("GenAAA 기본 생성자 실행");
	}

	GenAAA(String a, QQ b) {
		this.a = a;
		this.b = b;
		System.out.println("GenAAA 사용자 정의 생성자 실행");
	}
	
	void meth_1(int c, EE e) {
		System.out.println("meth_1 : "+c+","+e);
	}

	@Override
	public String toString() {
		return "GenAAA [a=" + a + ", b=" + b + "]";
	}
	
	
	
	
}


public class GenericsMain {

	public static void main(String[] args) {
		GenAAA a1 = new GenAAA(); // generic 명시하지 않을 경우 Object
		a1.a = "아기상어";
		a1.b = "엄마상어";
		a1.b = new int[] {11,22,33};
		a1.b = true;
		System.out.println(a1);
		a1.meth_1(123, 123.456);
		a1.meth_1(456,"나는무너");
		System.out.println("--------------------------");
		GenAAA a2 = new GenAAA<String, String>();	//생성시 generic 지정
		a2.a = "채치수";
		a2.b = "정대만";
		a2.b = 789;		//선언시 generic 지정이 아니므로 Object 대입 가능
		int c = (int)a2.b;
		a2.b = false;
		System.out.println(a2);
		a2.meth_1(333, 444);
		a2.meth_1(555,"나는고래");
		System.out.println("--------------------------");
		GenAAA a3 = new GenAAA<Integer, Integer>("서태웅",666);	//생성시 generic 지정
		System.out.println(a3);
		//GenAAA a4 = new GenAAA<Integer, Integer>("송태섭","강백호");	//Generic 지정된 생성자 호출시 타입이 맞아야 함
		System.out.println("--------------------------");
		GenAAA<Integer, Boolean> a5 = new GenAAA();	//선언시 generic 지정
		a5.a = "신준섭";
		//a5.b = "성현준";	선언시 지정한 generic으로 대입
		a5.b = 777;
		c = a5.b;		//generic으로 지정되어 형변환이 필요없음
		System.out.println(a5);
		//a5.meth_1(888, 999);	선언시 지정한 generic으로 대입
		a5.meth_1(135, true);
	}

}
