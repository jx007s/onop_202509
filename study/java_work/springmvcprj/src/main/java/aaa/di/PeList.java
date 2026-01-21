package aaa.di;

import org.springframework.stereotype.Service;

import aaa.mmm.Stud;
import aaa.mmm.StudArrs;
import jakarta.annotation.Resource;

@Service
public class PeList implements StudAction {
	
	@Resource
	StudArrs sa;

	@Override
	public Object execute(Stud st) {
		
		return sa.getArr();
	}

}
