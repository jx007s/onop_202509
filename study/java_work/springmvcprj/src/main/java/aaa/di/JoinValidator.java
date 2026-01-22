package aaa.di;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import aaa.mmm.Person;

public class JoinValidator implements Validator {

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
		
		if(per.getPname()==null || !Pattern.matches("[가-힣]{2,5}", per.getPname()) ) {

			errors.rejectValue("pname", "qwdqwd", "이름에러 이지롱");
						
		}
		
		if(per.getAgeStr()==null || !Pattern.matches("[0-9]{1,}", per.getAgeStr()) ) {

			errors.rejectValue("ageStr", "ㄷㄷㅇ", "나이에러 이지롱");
			
		}else {
			per.setAgeGo();
			
			System.out.println(per);
			
			if(per.getAge()<0 || per.getAge()>120) {
				errors.rejectValue("ageStr", "ㄷㄷㅇ", "나이에러 이지롱");	
			}
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			per.setBirth(sdf.parse(per.getBirthStr()));
			
			Date now = new Date();
			if(now.before(per.getBirth())) {
				errors.rejectValue("birthStr", "ㄷㄷㅇ", "생일에러 이지롱");
			}
			
		} catch (ParseException e) {
			errors.rejectValue("birthStr", "ㄷㄷㅇ", "생일에러 이지롱");	
		}
		
		
		if(per.getEmail()==null || !Pattern.matches("[a-zA-Z0-9]{3,}@[a-zA-Z0-9.]{5,}", per.getEmail()) ) {

			errors.rejectValue("email", "ㄷㄷㅇ", "email 에러 이지롱");
			
		}
		if(per.getTel()==null || !Pattern.matches("\\d{2,3}-\\d{3,4}-\\d{4}", per.getTel()) ) {

			errors.rejectValue("tel", "ㄷㄷㅇ", "tel 에러 이지롱");
			
		}
		

	}

}
