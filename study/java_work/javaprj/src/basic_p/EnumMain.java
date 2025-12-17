package basic_p;

enum AAA{
	aa,bb,cc,dd  //열거 상수
//   0  1  2  3
}

enum BBB{
	PICA("qw","피카츄",56), BUTTER("er","버터플",45),CHARM("ty","파이리",23);
	
	final String id;
	String pname;
	int age;
	
	BBB(String id, String pname, int age) {
		this.id = id;
		this.pname = pname;
		this.age = age;
		System.out.println(name()+" 생성자 실행");
	}
	
	void meth() {
		System.out.println("BBB "+name()+" meth() 실행");
	}
	
	@Override
	public String toString() {
		
		return name()+":"+id+","+pname+","+age;
	}
}

public class EnumMain {

	public static void main(String[] args) {
		//System.out.println(AAA);
		System.out.println(AAA.aa);
		System.out.println(AAA.bb);
		System.out.println(AAA.cc);
		System.out.println(AAA.dd);
		
		AAA a1;
		//a1 = aa;
		a1 = AAA.aa;
		a1 = AAA.cc;
		String ttt;
		//ttt = a1;
		ttt = a1.name();
		System.out.println(a1);
		System.out.println(a1.name());
		System.out.println(a1.ordinal());
		a1 = AAA.valueOf("bb");
		System.out.println(a1);
		
		System.out.println("---------------");
		
		AAA [] arr = AAA.values();
		for (AAA aaa : arr) {
			System.out.println(aaa);
		}
		
		System.out.println("---------------");
		a1 = AAA.bb;
		AAA a2 = AAA.cc;
		// 위치비교 : 작다  같다  크다 
		//  			음수 < 0 < 양수
		System.out.println(a1.compareTo(a2));  	// -1
		System.out.println(a1.compareTo(a1));	// 0
		System.out.println(a2.compareTo(a1));	// 1
		
		System.out.println("BBB >>>");
		System.out.println(BBB.PICA);
		System.out.println(BBB.PICA.name());
		System.out.println(BBB.PICA.id);
		System.out.println(BBB.PICA.pname);
		System.out.println(BBB.PICA.age);
		BBB.PICA.meth();
		//BBB.PICA.id = "zx";
		BBB.PICA.pname = "라이츄";
		BBB.PICA.age = 19;
		System.out.println(BBB.PICA);
		BBB b1 = BBB.BUTTER;
		System.out.println(b1);
		System.out.println(b1.name());
		System.out.println(b1.id);
		System.out.println(b1.pname);
		System.out.println(b1.age);
		System.out.println("---------------");
		
		for (BBB b : BBB.values()) {
			System.out.println(b);
		}
		
		System.out.println("---------------");
	}

}
