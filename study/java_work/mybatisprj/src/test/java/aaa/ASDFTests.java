package aaa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest  //스프링테스트시 스프링 자동으로 실행 - 통합테스트 : 시간이 오래 걸림
public class ASDFTests {

	@Test
	void tt1() {
		System.out.println("나도 테스트");
	}
	
	Object oo = null;
	
	@Test
	void tt2() {
		
		assertThat(oo).isNull();
	}
	
	@Test
	void tt3() {
		
		assertThat(oo).isNotNull();
	}
	
	@Test
	void tt4() {
		
		assertThat("아기상어").isEqualTo("아기상어");
	}
	
	@Test
	void tt5() {
		
		assertThat("엄마상어").isEqualTo("아기상어");
	}
	
	@Test
	void tt6() {
		String tt = "아기상어";
		assertThat("아기상어").isSameAs(tt);
	}
	
	@Test
	void tt7() {
		String tt = new String("아기상어");
		assertThat("아기상어").isSameAs(tt);
	}
}
