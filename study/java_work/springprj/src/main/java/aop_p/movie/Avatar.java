package aop_p.movie;

import org.springframework.stereotype.Component;

@Component
public class Avatar {

	public int dog5(int aa, String bb) {
		
		System.out.println("dog5 실행 : "+aa+","+bb);
		return 5678;
	}
}
