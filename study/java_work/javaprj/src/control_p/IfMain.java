package control_p;

public class IfMain {

	public static void main(String[] args) {


		boolean bo = true;
		int b = 20;
		int c;
		int d;
		
		if(bo) {
			int a  = 10; // 구간내에서 선언한 변수 구간 외부에서 사용불가
			c = 30;
			d = 40;
			System.out.println("참이지롱"+a+","+c);
		}else {
			d = 1234;
			System.out.println("거짓부렁");
		}
		
		System.out.println("if 종료 --------------");
		//System.out.println(a);
		System.out.println(b);
		//System.out.println(c);  //초기화 되지 않은 변수 호출불가
		System.out.println(d);
	}

}
