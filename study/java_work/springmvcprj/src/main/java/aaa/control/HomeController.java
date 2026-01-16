package aaa.control;

import aaa.SpringmvcprjApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


	@RequestMapping("/")   //url-mapping  과 같음
	String home() {
		System.out.println("home 진입");
		return "index";		// template( view 파일로 진입:forwarding)  :: 
		
		/*
		 applcation.yml 의 설정으로  view  페이지 진입을 결합하여 주소 설정
		 
		 "/views/" + "index" + ".jsp"  ==> 이 페이지로 진입 ==>  /views/index.jsp
		 
		 src > main > webapp/views/index.jsp 파일이 존재해야 함
		 
spring :
    mvc :
        view :
            prefix : /views/
            suffix : .jsp
*/
		
		
///springtestprj 프로젝트 생성후  8080 포트 로 
///  테스트 스프링 입니다.  출력   

	}
}



