package aaa.di;

import org.springframework.stereotype.Service;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExamModifyReg implements ExamAction{
	
	@Resource
	ExamMapper mapper;

	@Override
	public Object execute(
			ExamDTO dto, 
			PageInfo pInfo,
			HttpServletRequest request,
			HttpServletResponse response) {
		
		
		System.out.println("ExamModifyReg : "+dto);
		
		mapper.modify(dto);
		
		return dto.getId();
	}
	
	

}
