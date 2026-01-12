package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrayMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"di/array.xml",
						"di/array2.xml");
		System.out.println(context.getBean("arr1"));
		System.out.println(context.getBean("ss1"));
		System.out.println(context.getBean("mm1"));
		
		System.out.println(context.getBean("ad11"));
		System.out.println(context.getBean("ad12"));
		System.out.println(context.getBean("ad21"));
		System.out.println(context.getBean("ad22"));
		System.out.println(context.getBean("ad31"));
		System.out.println(context.getBean("ad32"));
		
		System.out.println(context.getBean("ad41"));
		//System.out.println(context.getBean("ad42"));
		
		System.out.println(context.getBean("ad51"));
		//System.out.println(context.getBean("ad52"));
		
		System.out.println(context.getBean("ad61"));
		//System.out.println(context.getBean("ad62"));
		context.close();

	}

}

