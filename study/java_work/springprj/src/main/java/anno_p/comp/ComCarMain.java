package anno_p.comp;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComCarMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"anno/comCar.xml");
		
		
		System.out.println(context.getBean("F1"));
		System.out.println(context.getBean("limousine"));
		System.out.println(context.getBean("truck"));
		context.close();

	}

}

/*
anno_p.cars 패키지
ComCarMain
자동차를 출력하세요

자동차 종류 - 클래스
 F1 ---  바퀴, 부스터
 리무진 ---- 바퀴, 방음벽, 짐칸
 트럭 ---- 바퀴, 짐칸
 * */


