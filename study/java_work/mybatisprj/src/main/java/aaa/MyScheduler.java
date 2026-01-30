package aaa;


import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class MyScheduler {



	//@Scheduled(fixedRate = 5000)
	public void gogogo1() {
		System.out.println("5 초마다 실행");
	}
	
	
	//       *         *　　　　    *　　　　　　  *　　　　　　 *　　　　　　* 
    //   초(0-59)    분(0-59)　　시간(0-23)　　일(1-31)　　월(1-12)　　요일(0-7)
	
	
	//@Async		//비동기로 처리  --> @Configuration에서 @EnableAsync 필수
	//@Scheduled(cron = "0 * * * * *")
	public void gogogo2() {
		System.out.println("0초 정각 실행");
	}
}
