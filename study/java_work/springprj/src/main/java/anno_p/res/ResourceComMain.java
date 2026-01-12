package anno_p.res;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceComMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"anno/resourceCom.xml");
		
		System.out.println(context.getBean("dd"));
		System.out.println(context.getBean("nn"));
		
		context.close();

	}

}
