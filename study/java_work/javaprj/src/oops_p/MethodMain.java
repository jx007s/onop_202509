package oops_p;

class MeAAA{
	void meth_1() {
		System.out.println("매개변수X, 리턴 X");
	}
	
	void meth_2(String aa, int bb) {
		System.out.println("매개변수 : "+aa+","+bb+", 리턴 X");
	}
	
	int meth_3() {
		System.out.println("매개변수X, 리턴 int");
		return 1234;
	}
	
	String meth_4(String aa, int bb) {
		System.out.println("매개변수 : "+aa+","+bb+", 리턴 String");
		return "밥은먹고다니냐?";
	}
	
	ClaStud makeSt() {
		System.out.println("학생생성");
		ClaStud res = new ClaStud();
		res.init("손사공",  77,79,91);
		return res;
	}
	
	
	//overloading
	ClaStud makeSt(String name, int...jum) {
		System.out.println("학생생성2");
		ClaStud res = new ClaStud();
		res.init(name, jum);
		return res;
	}
}

public class MethodMain {

	public static void main(String[] args) {
		MeAAA ma = new MeAAA();
		ma.meth_1();
		ma.meth_2("나는반딧불", 10);
		int r1 = ma.meth_3();
		System.out.println("r1 : "+r1);
		String r2 = ma.meth_4("나는레드불",20);
		System.out.println("r2 : "+r2);
		ClaStud r3 = ma.makeSt();
		r3.ppp();
		ClaStud r4 = ma.makeSt("차오즈",78,89,92,88);
		r4.ppp();
		System.out.println("------------------------");
		ClaStud [] stArr = {
				ma.makeSt("손오공",  97,69,31),
				ma.makeSt("베지터",  97,99,91),
				ma.makeSt("크리링",  97,79,51,34),
				ma.makeSt("피콜로",  37,59,71,92),
				ma.makeSt("천진반",  67,69,61),
				ma.makeSt("무천도사", 87,89,81)	
		};
		for (ClaStud st : stArr) {
			st.ppp();
		}
	}

}

