package aaa.di;

import org.springframework.stereotype.Service;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExamInsertForm implements ExamAction{
	
	@Resource
	ExamMapper mapper;

	@Override
	public Object execute(
			ExamDTO dto, 
			PageInfo pInfo,
			HttpServletRequest request,
			HttpServletResponse response) {
		
		return null;
	}

}
