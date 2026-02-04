package aaa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import aaa.test.Calcul;
import jakarta.annotation.Resource;

@SpringBootTest  //스프링테스트시 스프링 자동으로 실행 - 통합테스트 : 시간이 오래 걸림
class MybatisprjApplicationTests {
	
	@Resource
	Calcul ccl;
	
	@BeforeEach
	void bbb() {
		System.out.println("테스트 전");
	}
	
	@AfterEach
	void afff() {
		System.out.println("테스트 후");
	}
	

	@Test  // 단위테스트
	void contextLoads() {
		int res = ccl.add(10, 20);
		
		assertThat(res).isEqualTo(40);
	}

}
