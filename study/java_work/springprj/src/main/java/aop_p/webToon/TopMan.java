package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class TopMan {

	public int dog4(int aa, String bb) {
		
		System.out.println("dog4 실행 : "+aa+","+bb);
		return 1234;
	}
}
