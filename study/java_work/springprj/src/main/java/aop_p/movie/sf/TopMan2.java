package aop_p.movie.sf;

import org.springframework.stereotype.Component;

@Component
public class TopMan2 {

	public boolean dog7(int a) {
		
		System.out.println("dog7 실행 : "+a);
		return true;
	}
	
	public void dog8(int a, int b) {
		
		System.out.println("dog8 실행 : "+a+","+b);
	}
}
