package aaa;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@EnableAsync  // 비동기 사용가능 설정 -- @Async 동작 가능케함
@Configuration
public class AsyncConfig {

	@Bean  // Executor 빈 등록
	// @Async 메소드는 Executor를 사용해서 실행
	public Executor taskExecutor() {
		
		// 쓰레드 풀 기반 비동기 Executer 생성
		ThreadPoolTaskExecutor res = new ThreadPoolTaskExecutor();
		
		// 기본 유지 스레드 수
		 //  기본유지 - 항상 존재, 요청없이도 유지, 초기 로딩시 생성
		res.setCorePoolSize(5);
		
		// 최대 생성 스레드 수
		// CorePoolSize + queue 가 꽉 찼을때 추가로 생성 ,  이 숫자 넘으면 작업 거절
		res.setMaxPoolSize(20);
		
		// 작업 대기 큐 크기
		// core 스레드 모두 사용중일때 , 새 작업 큐에 쌓임
		res.setQueueCapacity(50);
		
		// 설정 완료 후 실제 스레드풀 초기화
		//    -  res 사용시 오류 발생 안함
		res.initialize();
		
		return res;
	}
}
