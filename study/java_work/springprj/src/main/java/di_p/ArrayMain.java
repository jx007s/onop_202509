package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrayMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"di/array.xml");
		System.out.println(context.getBean("arr1"));
		System.out.println(context.getBean("ss1"));
		System.out.println(context.getBean("mm1"));
		context.close();

	}

}

