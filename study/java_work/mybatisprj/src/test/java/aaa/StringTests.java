package aaa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StringTests {

	@Test
	void tt1() {
		assertThat("").isEmpty();
		//assertThat("   ").isEmpty();
		assertThat("   ").isNotEmpty();
		//assertThat("").isNotEmpty();
		
		assertThat("").isBlank();
		assertThat("   ").isBlank();
		//assertThat("a").isBlank();
	}
	
	@Test
	void tt2() {
		assertThat("아기상어 뚜루루뚜루").contains("기상");
		//assertThat("아기상어 뚜루루뚜루").contains("고래");
		assertThat("아기상어 뚜루루뚜루").doesNotContain("고래");
		//assertThat("아기상어 뚜루루뚜루").doesNotContain("기상");
	}
	
	@Test
	void tt3() {
		assertThat("아기상어 뚜루루뚜루").startsWith("아기");
		//assertThat("아기상어 뚜루루뚜루").startsWith("상어");
		assertThat("아기상어 뚜루루뚜루").endsWith("뚜루");
		//assertThat("아기상어 뚜루루뚜루").endsWith("상어");
		assertThat("아기상어 a 뚜루루뚜루").matches(".*[a-z].*");
		assertThat("아기상어 뚜루루뚜루").matches(".*[a-z].*");
	}
	
	@Test
	void tt4() {
		assertThat("asdfg@ert.com")
		.contains("@")
		.endsWith(".com");
	}
}
