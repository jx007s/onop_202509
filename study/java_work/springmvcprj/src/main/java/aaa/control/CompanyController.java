package aaa.control;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/company")
public class CompanyController {

	String viewPage = "company/template";
	
	@ModelAttribute("topMenu")
	Object topMenu() {
		LinkedHashMap< String , String> res = new LinkedHashMap<>();
		res.put("info", "회사소개");
		res.put("gall", "갤러리");
		res.put("product", "제품");
		res.put("notice", "공지사항");
		
		return res;
	}
	
	@RequestMapping
	String home() {
		
		return "redirect:/company/info";
	}
	
	@RequestMapping("info")
	String info(Model mm) {
		mm.addAttribute("mainUrl", "info");
		return viewPage;
	}
	
	@RequestMapping("gall")
	String gall(Model mm) {
		mm.addAttribute("mainUrl", "gall");
		mm.addAttribute("mainData", List.of(
				"delete.png",
				"family1.JPG",
				"family3.JPG",
				"family6.JPG"
				));
		return viewPage;
	}
	
	
	@RequestMapping("product")
	String product(Model mm) {
		mm.addAttribute("mainUrl", "product");
		return viewPage;
	}
	
	
	@RequestMapping("notice")
	String notice(Model mm) {
		mm.addAttribute("mainUrl", "notice");
		mm.addAttribute("mainData", List.of(
				"첫글이다",
				"두번째지",
				"삼시",
				"너구리",
				"오징어",
				"육개장",
				"칠뜨기"));
		return viewPage;
	}
}
