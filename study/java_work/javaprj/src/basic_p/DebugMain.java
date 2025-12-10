package basic_p;

class DeCla{
	
	
	
	String name = setName(), title;
	int age = setAge();
	String setName() {
		System.out.println("setName() 실행");
		return "조석";
	}
	int setAge() {
		int nn = 50;
		System.out.println("setAge() 실행 :"+nn);
		return 38;
	}
	public DeCla(String title) {
		System.out.println("생성자 이지롱");
		this.title = title;
	}
	
	static String toon = setToon();
	
	static String setToon(){
		System.out.println("setToon() 실행");
		return "네이버웹툰";
	}
}


public class DebugMain {

	public static void main(String[] args) {
		System.out.println("메인 1 -------");
		
		int a = 10;
		
		System.out.println("a : "+a);
		
		System.out.println("메인 2 -------");
		int b = 1000;
		a = 20;
		
		DeCla dc1 = new DeCla("마음의 소리");
		DeCla dc2 = new DeCla("조의영역");
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		System.out.println("메인 3 -------");
		
		a = 30;
		b = 3000;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);

	}

}
