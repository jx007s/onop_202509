package aop_p.webToon;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdvAdvice {

	// ProceedingJoinPoint -- around  만 가능
	//void beforeee(ProceedingJoinPoint joinPoint) {
	void beforeee(JoinPoint joinPoint) {
		System.out.println("before : "+joinPoint.toShortString());
//		System.out.println(joinPoint);
//		System.out.println(joinPoint.toShortString());
//		System.out.println(joinPoint.getSignature());
//		System.out.println(joinPoint.getSignature().getName());
//		System.out.println(joinPoint.getSignature().toShortString());
//		System.out.println(joinPoint.getTarget());
//		System.out.println(Arrays.toString(joinPoint.getArgs()) );
//		System.out.println(joinPoint.getThis());
		try {
			//joinPoint.proceed();  
			//proceed() 불가 -->실제 메소드 실행여부를 설정할 수 없다
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	
	//void returning(ProceedingJoinPoint joinPoint) {
	void returning(JoinPoint joinPoint, Object ret) {
		System.out.println("returning : "+ret);
	}
	
	void excepp(JoinPoint joinPoint, Throwable ee) {
		System.out.println("excepp : "+ee.getMessage());
	}
	
	void finallyyy(JoinPoint joinPoint) {
		System.out.println("finallyyy  ");
	}
	
	
}
