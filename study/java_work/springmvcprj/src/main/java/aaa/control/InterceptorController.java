package aaa.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inter")
public class InterceptorController {

	
	@RequestMapping("event/abc")
	String event1() {
		return "abc 이벤트중";
	}
	
	@RequestMapping("event/efg")
	String event2() {
		return "efg 이벤트중";
	}
	@RequestMapping("event/hij")
	String event3() {
		return "hij 이벤트중";
	}
	
	
	@RequestMapping("expire")
	String expire() {
		return "이벤트종료";
	}
}

/*
  /path 이후의 경로는 로그인 : aaa 만 접근가능
  /path/info/ddd/insert  제외
 * 
 * 
 * */


