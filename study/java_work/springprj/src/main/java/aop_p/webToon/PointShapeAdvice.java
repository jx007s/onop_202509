package aop_p.webToon;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

@Component
public class PointShapeAdvice {
	
	@Resource
	ShapeDataRes sdr;

	Object shSA(ProceedingJoinPoint joinPoint) {
		ShapeData res = null;
		
		try {
			res = (ShapeData)joinPoint.proceed();
			//System.out.println(sdr);
			sdr.add(res);
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	
}
