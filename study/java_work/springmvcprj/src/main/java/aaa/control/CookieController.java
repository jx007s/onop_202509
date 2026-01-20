package aaa.control;

import java.util.Map;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/coo")
public class CookieController {

	@RequestMapping("make")
	String make(HttpServletResponse response) {
		response.addCookie(new Cookie("pid","aaa"));
		response.addCookie(new Cookie("pname","말랑말랑"));
		return "쿠키생성";
	}
	
	@RequestMapping("view")
	Object view(
			@CookieValue(value = "pid") String pid,
			@CookieValue(value = "pname") String pname,
			@CookieValue(value = "nick", defaultValue = "아기상어") String nick,
			@CookieValue(value = "age", defaultValue = "43") int age
			) {
		
		return Map.of(
				"pid",pid, 
				"pname",pname,
				"nick",nick,
				"age",age);
	}
	
	@RequestMapping("modify")
	String modify(HttpServletResponse response) {
		response.addCookie(new Cookie("pid","bbb"));
		response.addCookie(new Cookie("age","29"));
		return "쿠키수정";
	}
	
	@RequestMapping("delete")
	String delete(HttpServletResponse response) {
		Cookie coo = new Cookie("pid","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		coo = new Cookie("pname","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		coo = new Cookie("nick","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		coo = new Cookie("age","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		return "쿠키삭제";
	}
}
/*
쿠키 기반의 로그인 로그아웃을 구현해 주세요

페이지 : 로그인메인화면, 로그아웃, 로그인처리

회원 정보

id    name    pw
aaa, 장동건 , 1111
bbb, 장서건 , 2222
ccc, 장동건 , 3333
ddd, 장남건 , 1111
eee, 북두신건 , 3333


로그인시 확인 정보 : 아이디, 암호
로그인후 노출 정보 : 아이디, 이름
로그아웃 노출 정보 : 이름
 * */



