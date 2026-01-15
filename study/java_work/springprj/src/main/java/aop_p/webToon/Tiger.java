package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class Tiger {

	public String meth1(int a) {
		System.out.println("meth1 시작 : "+a);
		int b = 1234/a;
		System.out.println("meth1 끝 : "+a+","+b);
		return "나는무너";
	}
}
