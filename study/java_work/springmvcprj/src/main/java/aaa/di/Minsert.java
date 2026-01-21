package aaa.di;

import org.springframework.stereotype.Service;

@Service
public class Minsert implements MyAction {

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return "쓰기데이터";
	}

}
