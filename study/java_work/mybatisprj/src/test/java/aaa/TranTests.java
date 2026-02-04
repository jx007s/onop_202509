package aaa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;

@SpringBootTest
public class TranTests {

	@Resource		// @Resource 사용하기 위해서는 @SpringBootTest 필요
	ExamMapper mapper;
	
	
	//@Transactional  - 없으면 rollback 하지 않음
	@Test
	void tt1() {
		                            //hakgi,  name,  pid,  kor,  eng,  mat,  pw
		mapper.insert(new ExamDTO(1, "쪽지", "aaa", 71, 78, 63, "1111"));
		
	}
	
	@Transactional  // 테스트 후 무조건 rollback
	@Test
	void tt2() {
		                            //hakgi,  name,  pid,  kor,  eng,  mat,  pw
		mapper.insert(new ExamDTO(2, "학력", "bbb", 91, 8, 3, "1111"));
		
	}
}
