package anno_p.phone;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import anno_p.conffiigg.ConfigStud;
import anno_p.conffiigg.StudentData;

public class ConfigStudMain {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigStud.class);
		
		
		context.getBean("studentData", StudentData.class).ppp();
		
		
	}

}

/*
ConfigStudMain
학생정보를 가지고 등수를 출력하세요
 
학생
 
이름, 국어, 영어, 수학 , 총점, 평균
 */


