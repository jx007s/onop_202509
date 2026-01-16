package aop_p.webToon;

import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

@Component
public class AopExamService {

	@Resource
	AopExamRes aer;
	
	public AopStud semi(String name, int kor, int eng, int mat) {
		AopStud res = new AopStud("중간",name, kor, eng, mat);
		return res;
	}
	
	public AopStud ffinal(String name, int kor, int eng, int mat) {
		AopStud res = new AopStud("기말",name, kor, eng, mat);
		return res;
	}
}
