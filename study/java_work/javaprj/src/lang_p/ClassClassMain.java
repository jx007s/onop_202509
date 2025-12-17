package lang_p;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Arrays;

class ClAAA{
	int a = 10;
	String b = "ClAAA_b";
	private int c = 30, d = 40;
	
	public ClAAA() {
		System.out.println("기본생성자");
	}
	
	ClAAA(int a) {
		this.a = a;
		System.out.println("사용자정의생성자1");
	}

	public ClAAA(int a, String b) {
		this.a = a;
		this.b = b;
		System.out.println("사용자정의생성자2");
	}

	void meth_1() {
		System.out.println("meth_1 실행:"+a+","+b+","+c+","+d);
	}
	void meth_2(int aa, boolean bb) {
		System.out.println("meth_2 실행 :"+aa+","+bb);
	}
	String meth_3() {
		System.out.println("meth_3 실행");
		return "나는무너";
	}
}

public class ClassClassMain {

	public static void main(String[] args) {
		ClAAA a1 = new ClAAA();
		
		System.out.println("[[[정보가져오기]]]");
		Class clzz = a1.getClass();
		System.out.println(clzz);
		System.out.println("getName : "+clzz.getName());
		System.out.println("getSimpleName : "+clzz.getSimpleName());
		Package clpp = clzz.getPackage();
		System.out.println("getPackage : "+clpp);
		System.out.println("getPackage : "+clpp.getName());
		System.out.println("getPackageName : "+clzz.getPackageName());
		
		//멤버변수
		System.out.println("getDeclaredFields : "+
				Arrays.toString(clzz.getDeclaredFields()) );
		
		//메소드
		System.out.println("getDeclaredMethods : "+
				Arrays.toString(clzz.getDeclaredMethods() ) );

		//생성자
		System.out.println("getDeclaredConstructors : "+
				Arrays.toString(clzz.getDeclaredConstructors() ) );
		
		//null 이어서 에러발생
		//Class aa = null;
		//aa.getResource("fff/family1.JPG");
		//static 이 아님
		//Class.getResource("fff/family1.JPG");
		
		// getResource - 파일 URL 리턴 , 
		// ClAAA 와 파일이 관련 없어도 Class 객체를 생성하여 메소드 사용
		URL uu = clzz.getResource("../fff/family1.JPG");
		System.out.println(uu.getPath());
		
		
		
		try {
			
		    
			System.out.println("[[[객체생성]]]");
			
			//Class nn = Class.forName("lang_p.ClA"); 존재하지 않는 클래스명 기재시 에러발생
			//Class nn = Class.forName("ClAAA");   패키지명 생략 불가
			Class nn = Class.forName("lang_p.ClAAA");
			
			Object oo1 = nn.newInstance();
			Object oo2 = nn.newInstance();
			
			System.out.println("oo1 : "+oo1);
			System.out.println("oo2 : "+oo2);
			
			ClAAA a2 = (ClAAA)oo2;
			System.out.println("a2 : "+a2);
			System.out.println(a2.a+","+a2.b);
			a2.meth_1();
			a2.meth_2(100, true);
			String rr = a2.meth_3();
			System.out.println(rr);
			
			//Object oo3 = nn.newInstance(300,"나는상어");  매개변수를 직접넣어 처리 불가
			//생성자 가져오기
			Constructor con2 = nn.getConstructor(int.class, String.class);
			ClAAA a4 = (ClAAA)con2.newInstance(400,"나는고래");
			System.out.println("a4 : "+a4);
			System.out.println(a4.a+","+a4.b);
			a4.meth_1();
			a4.meth_2(100, true);
			
			//ClAAA(int a) ==>  public 이 아니어서 에러발생 
			//Constructor con1 = nn.getConstructor(int.class);
			
			
			
			System.out.println("[[[메소드 실행]]]");
			
			ClAAA a5 = new ClAAA();
			Class n5 = a5.getClass();
			//메소드이름을 문자열로 로드
			Method mm = n5.getDeclaredMethod("meth_1");
			mm.invoke(a5);
			mm = n5.getDeclaredMethod("meth_2",int.class, boolean.class);
			mm.invoke(a5, 678,false);
			mm = n5.getDeclaredMethod("meth_3");
			String rr5 = (String) mm.invoke(a5);
			System.out.println("rr5:"+rr5);
			
			System.out.println("[[[멤버변수]]]");
			System.out.println("[멤버변수 호출]");
			a5.a = 1234;
			a5.b = "캐롤인가";
			Field fa = n5.getDeclaredField("a");
			Field fb = n5.getDeclaredField("b");
			Field fc = n5.getDeclaredField("c");
			Field fd = n5.getDeclaredField("d");
			System.out.println("fa :"+fa);
			System.out.println("fa.get(a5) :"+fa.get(a5));
			System.out.println("fb :"+fb);
			System.out.println("fb.get(a5) :"+fb.get(a5));
			System.out.println("fc :"+fc);
			//private 이라 접근불가
			//System.out.println("fc.get(a5) :"+fc.get(a5));
			System.out.println("fd :"+fd);
			fd.setAccessible(true);  //private 을 접근 가능토록 변경
			System.out.println("fd.get(a5) :"+fd.get(a5));
			//System.out.println("a5.d :"+a5.d);  직접접근 불가
			a5.meth_1();
			System.out.println("[멤버변수 대입]");
			fa.set(a5, 5678);
			fb.set(a5, "흰눈사이로");
			//fc.set(a5, 369);  private 에러
			// fd.setAccessible(true);  private 을 접근 가능토록 변경
			fd.set(a5, 480);  
			a5.meth_1();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
