package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class JoSuk {

	public String dog1(int aa, String bb) {
		
		System.out.println("dog1 실행 : "+aa+","+bb);
		return "센세이션";
	}
	
	public int dog2(int aa, String bb) {
		
		System.out.println("dog2 실행 : "+aa+","+bb);
		return 1234;
	}
	
	public String dog3(int aa, String bb) {
		
		System.out.println("dog3 실행 : "+aa+","+bb);
		return "애봉이";
	}
	
	public String father(int aa, String bb) {
		
		System.out.println("father 실행 : "+aa+","+bb);
		return "조철왕";
	}
}
