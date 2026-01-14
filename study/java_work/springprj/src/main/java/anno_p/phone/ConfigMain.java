package anno_p.phone;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigMain {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanInit.class);
		
		//context.close();  없음
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
		System.out.println(context.getBean("cam1"));
		System.out.println(context.getBean("cam2"));
		System.out.println(context.getBean("dr1"));
		System.out.println(context.getBean("aaa"));
	}

}
