package aaa.di;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import aaa.mmm.Person;

public class PersonValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("validate 진입 : "+target );
		
		Person per = (Person)target;
		
		if(per.getPid()==null || per.getPid().equals("")) {
			// 에러상태 추가
			errors.rejectValue("pid", "invalid.pid", "id가 null 이지롱");
						//   에러필드,  에러코드,       에러메세지
						//   3개가 있어야함
		}
		
		if(per.getPw()==null || per.getPw().equals("")) {
			// 에러상태 추가
			errors.rejectValue("pw", "qwdqwd", "pw가 null 이지롱");
						//   에러필드,  에러코드,       에러메세지
						//   3개가 있어야함
		}

	}

}
