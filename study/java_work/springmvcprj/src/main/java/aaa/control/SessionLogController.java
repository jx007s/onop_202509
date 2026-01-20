package aaa.control;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.mmm.Person;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/session")
public class SessionLogController {
	
	List<Person> pers;
	
	public SessionLogController() {
		pers = List.of(
				
				new Person("aaa", "장동건" ,  "1111"),
				new Person("bbb", "장서건" ,  "2222"),
				new Person("ccc", "장동건" ,  "3333"),
				new Person("ddd", "장남건" ,  "1111"),
				new Person("eee", "북두신건" , "3333")
		);
	}

	@RequestMapping("logMain")
	String logMain(HttpSession session) {
		
		Person pp = (Person)session.getAttribute("pid");
		
		//로그인 안됀 상태
		String viewPage = "session/logForm";
		
		//로그인 상태
		if(pp!=null) {
			viewPage = "session/logIn";
		}
		
		return viewPage;
	}
	
	
	@RequestMapping("logReg")
	String logReg(Model mm,Person reqPer, HttpSession session) {
		
		Person res = pers.stream()
		.filter(pp-> pp.equals(reqPer))
		.findFirst()
		.orElse(null);
		
		String msg = "로그인 실패";
		if(res!=null) {
			msg = res.getPname()+"님 로그인하였습니다.";
			session.setAttribute("pid", res);
		}
		
		mm.addAttribute("msg", msg);
		
		return "session/logReg";
	}
	
	@RequestMapping("logout")
	String logout(Model mm,  HttpSession session) {
		Person pp = (Person)session.getAttribute("pid");
		mm.addAttribute("msg", pp.getPname()+"님 로그아웃돼었습니다.");	
		
		session.invalidate();
		
		return "session/logReg";
	}
}
