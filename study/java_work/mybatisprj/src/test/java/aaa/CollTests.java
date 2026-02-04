package aaa;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class CollTests {

	@Test
	void tt1() {
		List arr = List.of(11,22,33);
		assertThat(arr).hasSize(3);		//길이
		//assertThat(arr).isEmpty();
		assertThat(arr).isNotEmpty();
		assertThat(arr).contains(22);
		//assertThat(arr).contains(1234);
		assertThat(arr).doesNotContain(1234);
		assertThat(arr).containsExactly(11,22,33);  //순서, 갯수, 값 모두 일치
		//assertThat(arr).containsExactly(11,33,22);
		assertThat(arr).containsExactlyInAnyOrder(11,33,22);  // 갯수, 값 일치 - 순서 제외
	}
	
	
	@Test
	void tt2() {
		
		Map mm = Map.of("사자","포유류","악어","파충류","오타니","이도류");
		assertThat(mm).containsKey("사자");
		//assertThat(mm).containsKey("호랑이");
		assertThat(mm).containsValue("파충류");
		//assertThat(mm).containsValue("양서류");
		assertThat(mm).containsEntry("오타니","이도류");
		//assertThat(mm).containsEntry("사자","이도류");
	}
}

