package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import aaa.mmm.Person;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/req")
public class RequestController {

	@GetMapping("getGo")  ///      /req/getGo  의 get방식 진입
	String form() {
		return "req/form";
	}
	
	@GetMapping("mem")  
	String mem1(HttpServletRequest request,
			@RequestParam("pname")String pn,
			@RequestParam(name="age", defaultValue="20") int aaa,  // defaultValue="20" 값이 없을 경우 20
			@RequestParam("marriage") boolean mmm,
			Model md		//requestAttribute 설정할수 있는 객체
			) {
		System.out.println("mem1 : "+
							request.getParameter("pname")+","+
							request.getParameter("age")+","+
							request.getParameter("marriage")
				);
		System.out.println("mem1 @RequestParam: "+ pn+","+aaa+","+mmm	);
		
		md.addAttribute("pn", pn);  //request.setAttribute("pn", pn)
		request.setAttribute("aaa", aaa);
		return "req/mem1";
	}
	
	@PostMapping("mem")  
	String mem2(HttpServletRequest request,
			@RequestParam("pname") String pn,
			@RequestParam(name="age", defaultValue="27") int aaa,  // defaultValue="27" 값이 없을 경우 27
			@RequestParam("marriage") boolean mmm) {
		
		System.out.println("mem2 : "+
							request.getParameter("pname")+","+
							request.getParameter("age")+","+
							request.getParameter("marriage")
				);
		System.out.println("mem2 @RequestParam: "+ pn+","+aaa+","+mmm	);
		return "req/mem1";
	}
	
	@RequestMapping(value="mem3" , method = RequestMethod.GET)
	String mem31(	@ModelAttribute("pname") String pn,   //parameter:pname ==> attribute 로 인지
					@ModelAttribute(name = "age") int aaa  //초기값을 줄수 없다
					//@ModelAttribute("mmm") boolean mmm   parameter 이름을 맞춰줄수 없다 
			) {
		System.out.println("mem31 : "+pn+","+aaa);
		return "req/mem3";
	}
	
	@RequestMapping(value="mem3" , method = RequestMethod.POST)
	String mem32(
			//String pname   어노테이션 없이 기본 자료형태 대입불가
			Person pr	// 멤버setter 에 맞게 param 대입, attribute 이름 클래스명
			) {
		System.out.println("mem32 : "+pr);
		return "req/mem4";
	}
	
	
	
	@RequestMapping("mem4")
	String mem4(@ModelAttribute("pr") Person pr) {	// 멤버setter 에 맞게 param 대입,attribute 설정
										//attribute : pr
			
		System.out.println("mem4 : "+pr);
		return "req/mem4";
	}
}


/*  RequestExamController
 *폼입력 : 이름, 국어,영어,수학
 * 
 * 출력 : 이름, 국어,영어,수학, 총점, 평균, 등급
 * 
 * */


