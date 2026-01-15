package aop_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.movie.Avatar;
import aop_p.movie.TopMan1;
import aop_p.movie.sf.TopMan2;
import aop_p.webToon.JoSuk;
import aop_p.webToon.TopMan;

public class ExecutionMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop/execution.xml");
		
		Object rr = context.getBean("joSuk",JoSuk.class).dog1(10, "아기상어");
		System.out.println("rr : "+rr);
		System.out.println("---------------------------------");
		rr = context.getBean("joSuk",JoSuk.class).father(20, "엄마상어");
		System.out.println("rr : "+rr);
		System.out.println("---------------------------------");
		rr = context.getBean("topMan",TopMan.class).dog4(30, "아빠상어");
		System.out.println("rr : "+rr);
		System.out.println("---------------------------------");
		rr = context.getBean("avatar",Avatar.class).dog5(30, "아빠상어");
		System.out.println("rr : "+rr);
		System.out.println("---------------------------------");
		rr = context.getBean("topMan1",TopMan1.class).dog6();
		System.out.println("rr : "+rr);
		System.out.println("---------------------------------");
		rr = context.getBean("topMan2",TopMan2.class).dog7(40);
		System.out.println("rr : "+rr);
		System.out.println("---------------------------------");
		context.getBean("topMan2",TopMan2.class).dog8(11,22);
		System.out.println("---------------------------------");
		context.close();

	}

}

/*

PointShapeMain
도형 클래스를 구현하세요 
            넓이			둘레

    원 		r*r*PI 		r*2*PI 
직사각형 		가로*세로 		(가로 + 세로) *2
직각삼각형 	가로*세로/2 	가로+세로+빗변

aop를 이용하여 계산 할 때마다 각 도형의 넓이,둘레의 합계, 평균을 계산하세요

*/



