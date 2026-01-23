package aaa.controll;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.ExamProvider;
import aaa.di.ExamAction;
import aaa.di.PageInfo;
import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/exam/{service}")
public class HomeController {
	
	@Resource
	ExamProvider provider;

	//목록
	@ModelAttribute("mainData")
	Object home(ExamDTO dto, PageInfo pInfo) {
		Object res = 
				provider.getContext().getBean(pInfo.getService(), ExamAction.class).execute(dto, pInfo);
		
		return res;
	}
		
	
	@RequestMapping(path = {"", "{id}"})
	String view(PageInfo pInfo) {
		
		return pInfo.getService();
	}
	
	
}
