package aaa.di;

import org.springframework.stereotype.Service;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;

@Service
public class ExamList implements ExamAction{
	
	@Resource
	ExamMapper mapper;

	@Override
	public Object execute(ExamDTO dto, PageInfo pInfo) {
		// TODO Auto-generated method stub
		return mapper.list();
	}

}
