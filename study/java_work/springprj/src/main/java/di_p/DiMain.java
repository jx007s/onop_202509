package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiMain {

	public static void main(String[] args) {
		System.out.println("일반 인스턴스---------------");
		HandPhone ph1 = new HandPhone();
		Camera cc1 = new Camera();
		Battery bb1 = new Battery();
		
		
		cc1.name = "캐논50";
		cc1.pixel = 3000;
		
		bb1.name = "로케트";
		bb1.remoeable = true;
		
		ph1.name = "푸른하늘";
		ph1.price = 99;
		ph1.fc = cc1;
		ph1.bat = bb1;
		
		System.out.println(cc1);
		System.out.println(bb1);
		System.out.println(ph1);
		System.out.println("DI---------------");
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di/first.xml");
		
		Object oo = context.getBean("c2");
		System.out.println(oo);
		
		Camera c3 = context.getBean("c3", Camera.class);
		System.out.println(c3);
		
		HandPhone ph2 = context.getBean("ph2", HandPhone.class);
		System.out.println(ph2);
		
		context.close();
	}

}
