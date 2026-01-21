package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.mmm.PathData;

@Controller
@RequestMapping("/path/{cate}")
public class PathController {
	
	@ModelAttribute("mmm")
	Object mmm(@PathVariable("cate") String cate) {
		return cate+">>>>";
	}

	//  @PathVariable는 request.attribute 로 사용됨
	@RequestMapping("aaa/{service}")
	String aaa(@PathVariable("cate") String cate,
			@PathVariable("service") String service) {
		System.out.println("aaa : "+cate+","+service);
		return "path";
	}
	
	
	// depth 가 같을 경우 정적(명시적)으로 고정된 mapping 이 우선
	@RequestMapping("bbb")
	String bbb(@PathVariable("cate") String cate) {
		System.out.println("bbb : "+cate);
		return "path";
	}
	
	@RequestMapping("{pid}")
	String ccc(@PathVariable("cate") String cate,
			@PathVariable("pid") int pid) {
		System.out.println("ccc : "+cate+","+pid);
		return "path";
	}
	
	
	@RequestMapping("ddd/{service}")
	String ddd(PathData pd) {
		System.out.println("ddd : "+pd);
		return "path";
	}
	
	
	/* /path/info/eee/detail/20?pNo=30
	 * @PathVariable , parameter 중첩될 경우
	   pNo : 30 으로 설정  ::  @PathVariable < parameter  우선순위
	 */
	@RequestMapping("eee/{service}/{pNo}")
	String eee(PathData pd) {
		System.out.println("eee : "+pd);
		return "path";
	}
}

/*
학생 목록, 학생상세, 학생추가  를 구현하세요
학생정보 : id, 국어,영어,수학  ,총점, 평균


 * */




