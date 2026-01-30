package aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling				// 스케줄 사용
public class MybatisprjApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisprjApplication.class, args);
	}

}
