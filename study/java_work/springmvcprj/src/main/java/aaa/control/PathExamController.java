package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.MyProvider;
import aaa.di.MyAction;
import aaa.di.StudAction;
import aaa.mmm.PathData;
import aaa.mmm.Stud;
import jakarta.annotation.Resource;



@Controller
@RequestMapping("/pe/{service}")
public class PathExamController {
	
	@Resource
	MyProvider provider;
	
	@ModelAttribute("mData")
	Object mData(PathData pd, Stud st) {
		return provider.getContext().getBean(pd.getService(),StudAction.class).execute(st);
	}
	

	@RequestMapping(path = {"","{id}"})
	String view() {
		return "pe";
	}
}
