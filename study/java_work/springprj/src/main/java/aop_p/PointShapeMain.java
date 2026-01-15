package aop_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.movie.Avatar;
import aop_p.movie.TopMan1;
import aop_p.movie.sf.TopMan2;
import aop_p.webToon.JoSuk;
import aop_p.webToon.Shape;
import aop_p.webToon.TopMan;

public class PointShapeMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop/pointShape.xml");
		
		Shape sh = context.getBean("shape",Shape.class);
		System.out.println(sh.circle(5));
		System.out.println(sh.rectangle(5,6));
		System.out.println(sh.triangle(5,6,8));
		System.out.println(sh.triangle(10,15,21));
		System.out.println(sh.triangle(10,7,15));
		System.out.println(sh.circle(10));
		System.out.println(sh.rectangle(10,10));
		System.out.println("-------------------");
		
		System.out.println(context.getBean("shapeDataRes"));
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



