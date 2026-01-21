package aaa.di;

import org.springframework.stereotype.Service;

import aaa.mmm.Stud;
import aaa.mmm.StudArrs;
import jakarta.annotation.Resource;

@Service
public class PeInsert implements StudAction {
	
	@Resource
	StudArrs sa;

	@Override
	public Object execute(Stud st) {
		
		sa.getArr().add(st);
		
		return "학생추가완료";
	}

}
