package anno_p.phone;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"anno/bean.xml");
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
		System.out.println(context.getBean("cam1"));
		System.out.println(context.getBean("cam2"));
		System.out.println(context.getBean("dr1"));
		context.close();

	}

}

/*
anno_p.phone 패키지
BeanCarMain
자동차를 출력하세요

자동차 종류 - 클래스
 F1 ---  바퀴, 부스터
 리무진 ---- 바퀴, 방음벽, 짐칸
 트럭 ---- 바퀴, 짐칸
 * */



