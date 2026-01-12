package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di/autowire.xml","di/autowire2.xml");
		
		System.out.println(context.getBean("fc"));
		System.out.println(context.getBean("hp1"));
		System.out.println(context.getBean("hp2"));
		System.out.println(context.getBean("hp3"));
		
		context.close();

	}

}

/*
AutowireComMain
부품, 완성품 xml 를 분리하여 context 작업할 것
--  autowire 로 작업 요망


데스크탑   - 본체 1, 모니터 1, 키보드 1, 마우스 1
노트북    - 본체 1, 마우스 1

 * */
