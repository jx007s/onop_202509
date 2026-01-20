package aaa.control;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.mmm.Person;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/coo")
public class CookieLogController {
	
	List<Person> pers;
	
	public CookieLogController() {
		pers = List.of(
				
				new Person("aaa", "장동건" ,  "1111"),
				new Person("bbb", "장서건" ,  "2222"),
				new Person("ccc", "장동건" ,  "3333"),
				new Person("ddd", "장남건" ,  "1111"),
				new Person("eee", "북두신건" , "3333")
		);
	}

	@RequestMapping("logMain")
	String logMain(Model mm,
			@CookieValue(value = "pid" , defaultValue = "" )String pid,
			@CookieValue(value = "pname", defaultValue = "")String pname
			) {
		
		//로그인 안됀 상태
		String viewPage = "coo/logForm";
		
		//로그인 상태
		if(!pid.equals("")) {
			viewPage = "coo/logIn";
			mm.addAttribute("pid", pid);
			mm.addAttribute("pname", pname);
		}
		
		return viewPage;
	}
	
	
	@RequestMapping("logReg")
	String logReg(Model mm, Person reqPer, HttpServletResponse response) {
		
		Person res = pers.stream()
		.filter(pp-> pp.equals(reqPer))
		.findFirst()
		.orElse(null);
		
		String msg = "로그인 실패";
		if(res!=null) {
			msg = res.getPname()+"님 로그인하였습니다.";
			response.addCookie(new Cookie("pid", res.getPid()));
			response.addCookie(new Cookie("pname", res.getPname()));
		}
		
		mm.addAttribute("msg", msg);
		
		return "coo/logReg";
	}
	
	@RequestMapping("logout")
	String logout(Model mm, HttpServletResponse response,
			@CookieValue(value = "pname")String pname) {
		
		mm.addAttribute("msg", pname+"님 로그아웃돼었습니다.");	
		
		Cookie coo = new Cookie("pid", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		coo = new Cookie("pname", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		return "coo/logReg";
	}
}
