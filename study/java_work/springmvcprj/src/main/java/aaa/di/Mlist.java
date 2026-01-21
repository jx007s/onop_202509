package aaa.di;

import org.springframework.stereotype.Service;

@Service
public class Mlist implements MyAction {

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return "리스트데이터";
	}

}
