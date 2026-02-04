package aaa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


// @SpringBootTest 없음
public class NumberTests {

			// 	@SpringBootTest 없이
	@Test   // 단위 테스트시에는 spring 실행하지 않음 - 처리속도가 빠르다
	void tt1() {
		//System.out.println("숫자 tt1 진입");
		assertThat(20).isGreaterThan(10);  	//20 > 10
		assertThat(20).isGreaterThan(20);	//20 > 20  에러
		assertThat(20).isGreaterThan(30);	//20 > 30  에러
	}
	
	@Test   // 단위 테스트시에는 spring 실행하지 않음 - 처리속도가 빠르다
	void tt2() {
		assertThat(20).isGreaterThanOrEqualTo(20);  	//20 >= 20
		assertThat(20).isGreaterThanOrEqualTo(30);  	//20 >= 30
	}
	
	@Test   
	void tt3() {
		assertThat(20).isLessThan(30);			//20 < 30
		assertThat(20).isLessThanOrEqualTo(20);	//20 <= 30
	}
	
	
	@Test   
	void tt4() {
		assertThat(7).isBetween(5, 10);  // 5 <= n <= 10
		assertThat(5).isBetween(5, 10);
		assertThat(10).isBetween(5, 10);
		assertThat(11).isBetween(5, 10);
	}
	
	@Test   
	void tt5() {
		assertThat(7).isPositive();  // 양수인가?  7 > 0
		//assertThat(0).isPositive();
		//assertThat(-7).isPositive();
	}
	
	@Test   
	void tt6() {
		assertThat(-7).isNegative();  // 음수인가?  -7 < 0
		//assertThat(0).isNegative();
		//assertThat(7).isNegative();
	}
	
	@Test   
	void tt7() {
		assertThat(0).isZero();	// 0 == 0
		//assertThat(1).isZero();	// 1 == 0
		
		assertThat(1).isNotZero();	// 1 != 0
		assertThat(0).isNotZero();	// 0 != 0
	}
}
