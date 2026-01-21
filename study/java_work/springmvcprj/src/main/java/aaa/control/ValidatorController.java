package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		
		return "val/complete";
	}
}
