package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireComMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"di/autowireParts.xml",
						"di/autowireCom.xml");
		
		System.out.println(context.getBean("dd"));
		System.out.println(context.getBean("nn"));
		
		context.close();

	}

}
