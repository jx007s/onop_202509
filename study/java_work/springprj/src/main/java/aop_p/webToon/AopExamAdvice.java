package aop_p.webToon;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

@Component
public class AopExamAdvice {
	
	@Resource
	AopExamRes aer;

	
	void semiRet(JoinPoint joinPoint, Object ret) {
		//System.out.println("semiRet : "+ret);
		aer.semiAdd(ret);
	}
	
	void finalRet(JoinPoint joinPoint, Object ret) {
		//System.out.println("finalRet : "+ret);
		aer.finalAdd(ret);
	}
	
}
