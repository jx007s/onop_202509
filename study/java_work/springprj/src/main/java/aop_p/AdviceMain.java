package aop_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.movie.Avatar;
import aop_p.movie.TopMan1;
import aop_p.movie.sf.TopMan2;
import aop_p.webToon.JoSuk;
import aop_p.webToon.Shape;
import aop_p.webToon.Tiger;
import aop_p.webToon.TopMan;

public class AdviceMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop/advice.xml");
		
		Tiger tg = context.getBean("tiger",Tiger.class);
		
		try {
			Object rr = tg.meth1(10);
			System.out.println("rr : "+rr);
			System.out.println("----------------------");
			
			rr = tg.meth1(0);
			System.out.println("rr : "+rr);
			System.out.println("----------------------");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		context.close();

	}

}

/*

AdviceExamMain
* 중간고사, 기말고사 시험을 구현하세요
 * 각 시험 리턴은 학생정보 클래스로 처리할 것
 * 학생정보 클래스 구성요소 : 이름, 시험종류, 과목점수, 총점, 평균
 * 시험 메소드는 이름, 과목 점수를 매개변수로 받아 처리할 것
 * 
 각 중간고사, 기말고사 의 평균점수의
 0 < 60, 60<= 80, 80<=100 구간별 인원수를 aop를 이용하여 구분 

*/



