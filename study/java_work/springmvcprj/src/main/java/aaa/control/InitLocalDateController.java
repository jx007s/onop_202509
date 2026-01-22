package aaa.control;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aaa.mmm.Person;

class MyEditerSupport extends PropertyEditorSupport{
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	@Override
	public void setAsText(String text) {
		
		setValue(LocalDate.parse(text, dtf));
	}
}


@RestController
@RequestMapping("/initGo2")
public class InitLocalDateController {


	@RequestMapping
	void gogogo2(Person per) {
		System.out.println("gogo2 실행:"+per);
	}
	
	@InitBinder
	void wdfwerftgewf(WebDataBinder binder) {
		System.out.println("wdfwerftgewf 실행:");
		
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		
		binder.registerCustomEditor(LocalDate.class, "reg_date", new MyEditerSupport());
				
		
		
		
	}
}



// initGo2  -->  reg_date : LocalDate
