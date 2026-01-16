package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.mmm.Stud;

@Controller
@RequestMapping("/req/exam")
public class RequestExamController {

	@GetMapping
	String form() {
		return "req/examForm";
	}
	
	@PostMapping
	String complete(Stud st) {
		return "req/examReg";
	}
}
