package aaa.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aaa.mmm.Person;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/session")
public class SessionController {
	
	@RequestMapping("make")
	String make(HttpSession session) {
		
		session.setAttribute("pid", "aaa");
		session.setAttribute("per", new Person("bbb", "현빈", "1357"));
		session.setAttribute("arr", new int[] {11,22,33,44});
		return "세션생성";
	}

	@RequestMapping("view")
	Object view(HttpSession session) {
		
		ArrayList res = new ArrayList<>();
		
		res.add(session.getAttribute("pid"));
		res.add(session.getAttribute("per"));
		res.add(session.getAttribute("arr"));
		res.add(session.getAttribute("marriage"));
		
		return res;
	}
	
	@RequestMapping("modify")
	String modify(HttpSession session) {
		
		session.setAttribute("pid", "bbb");
		session.setAttribute("marriage", true);
		return "세션수정";
	}
	
	@RequestMapping("delete")
	String delete(HttpSession session) {
		
		session.invalidate();
		return "세션삭제";
	}
}
