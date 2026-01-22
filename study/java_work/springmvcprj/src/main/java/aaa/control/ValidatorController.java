package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.di.JoinValidator;
import aaa.di.PersonValidator;
import aaa.mmm.Person;

@Controller
@RequestMapping("/val")
public class ValidatorController {

	@GetMapping
	String form() {
		return "val/form";
	}
	
	
	@PostMapping
	String complete(Person pp, BindingResult res) {
		
		
		new PersonValidator().validate(pp, res);
		
		if(res.hasErrors()) {  //에러가 존재하면
							// validate(pp, res) 에서 errors.rejectValue 가 실행됐다면
			
			return "val/form";		// form으로  view 페이지 변경
		}
		
		
		
		return "val/complete";
	}
	
	
	
	@GetMapping("join")
	String joinForm() {
		return "val/joinform";
	}
	
	
	@PostMapping("join")
	String joincomplete(Person pp, BindingResult res) {
		
		
		new JoinValidator().validate(pp, res);
		
		if(res.hasErrors()) {  //에러가 존재하면
							// validate(pp, res) 에서 errors.rejectValue 가 실행됐다면
			
			return "val/joinform";		// form으로  view 페이지 변경
		}
		
		
		
		return "val/joincomplete";
	}
}

/*
회원가입 유효성 검사 하세요
id, 이름, 나이, 생일, 이메일, 전화번호
 * 
 * */






