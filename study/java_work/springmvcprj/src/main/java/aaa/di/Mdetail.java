package aaa.di;

import org.springframework.stereotype.Service;

@Service
public class Mdetail implements MyAction {

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return "상세데이터";
	}

}
