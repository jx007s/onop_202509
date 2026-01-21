package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.MyProvider;
import aaa.di.MyAction;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/pc/{service}")
public class PathContextController {

	@Resource
	MyProvider provider;
	
	@ModelAttribute("mData")
	Object mainData(@PathVariable("service") String service) {
		MyAction action = provider.getContext().getBean(service, MyAction.class);
		return action.execute();
	}
	

	
	@RequestMapping
	String view() {
		return "pc";
	}
}
