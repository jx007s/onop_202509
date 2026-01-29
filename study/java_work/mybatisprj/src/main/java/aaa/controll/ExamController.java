package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.ExamProvider;
import aaa.di.ExamAction;
import aaa.di.PageInfo;
import aaa.model.ExamDTO;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/exam/{service}")
public class ExamController {
	
	@Resource
	ExamProvider provider;

	//목록
	@ModelAttribute("mainData")
	Object home(
			ExamDTO dto, PageInfo pInfo, 
			HttpServletRequest request,
			HttpServletResponse response
			) {
		Object res = 
				provider.getContext()
				.getBean(pInfo.getService(), ExamAction.class)
				.execute(dto, pInfo, request, response);
		
		return res;
	}
		
	
	@RequestMapping(path = {"", "{id}"})
	String view(PageInfo pInfo) {
		
		return pInfo.getService();
	}
	
	
}
