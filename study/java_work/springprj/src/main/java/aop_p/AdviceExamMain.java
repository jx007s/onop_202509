package aop_p;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.movie.Avatar;
import aop_p.movie.TopMan1;
import aop_p.movie.sf.TopMan2;
import aop_p.webToon.AopExamService;
import aop_p.webToon.AopStud;
import aop_p.webToon.JoSuk;
import aop_p.webToon.Shape;
import aop_p.webToon.Tiger;
import aop_p.webToon.TopMan;

public class AdviceExamMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop/adviceExam.xml");
		
		AopExamService aes = context.getBean("aopExamService",AopExamService.class);
		
		ArrayList<AopStud> studs = new ArrayList<>();
		
		studs.add(aes.semi("삼광재", 51, 53, 57));
		studs.add(aes.semi("사광재", 71, 73, 77));
		studs.add(aes.ffinal("이광재", 94, 83, 77));
		studs.add(aes.ffinal("오광재", 84, 83, 87));
		studs.add(aes.semi("강동양", 91, 93, 97));
		studs.add(aes.semi("강동가", 41, 43, 47));
		studs.add(aes.ffinal("강동수", 64, 63, 47));
		studs.add(aes.ffinal("강동미", 74, 73, 77));
		
		System.out.println("학생======>");
		studs.stream().forEach(System.out::println);
		
		System.out.println("시험결과======>");
		System.out.println(context.getBean("aopExamRes"));
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



