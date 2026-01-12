package anno_p.phone;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"anno/autowire.xml");
		
		//System.out.println(context.getBean("fc"));
		//System.out.println(context.getBean("bb1"));
		System.out.println(context.getBean("hp1"));
		context.close();

	}

}
