package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrayStudMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"di/arrayStud.xml");
		
		context.getBean("studData",StudentData.class).ppp();
		context.close();

	}

}

/*
학생정보를 가지고 등수를 출력하세요
 
학생
 
이름, 국어, 영어, 수학 , 총점, 평균
 */

