package anno_p.phone;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigScanMain {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigScan.class);
		
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println(context.getBean("bbtt"));
		System.out.println(context.getBean("camera"));
		System.out.println(context.getBean("handPhone"));
		System.out.println(context.getBean("comWatch"));
		System.out.println(context.getBean("mic"));
		
		System.out.println("-----------------------------------------");
		
		System.out.println(context.getBean("arr1"));
		System.out.println(context.getBean("ss1"));
		System.out.println(context.getBean("mm1"));
		
	}

}

/*
ConfigStudMain
학생정보를 가지고 등수를 출력하세요
 
학생
 
이름, 국어, 영어, 수학 , 총점, 평균
 */


