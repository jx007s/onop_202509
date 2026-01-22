package aaa.control;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aaa.mmm.Person;


@RestController
@RequestMapping("/initGo")
public class InitController {


	@RequestMapping
	void gogogo(Person per) {
		System.out.println("gogo 실행:"+per);
	}
	
	@InitBinder
	void wdfwerftgewf(WebDataBinder binder) {
		System.out.println("wdfwerftgewf 실행:");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(sdf, true);
		
		binder.registerCustomEditor(Date.class, "birth", editor);
				
		
		
		
	}
}



// initGo2  -->  reg_date : LocalDate
