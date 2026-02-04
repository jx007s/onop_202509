package aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling				// 스케줄 사용
//  war 배포시  SpringBootServletInitializer 상속 받아야 함
public class MybatisprjApplication extends SpringBootServletInitializer{


	public static void main(String[] args) {
		SpringApplication.run(MybatisprjApplication.class, args);
	}

}
