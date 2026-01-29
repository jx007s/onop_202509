package aaa.di;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExamDelete implements ExamAction{
	
	@Resource
	ExamMapper mapper;

	@Override
	public Object execute(
			ExamDTO dto, 
			PageInfo pInfo,
			HttpServletRequest request,
			HttpServletResponse response) {
		
		
		ExamDTO delDTO = mapper.detail(dto);
		
		if(delDTO.getFf()!=null && !delDTO.getFf().equals("")) {
			fileDelete(delDTO.getFf(), request);
		}
		
		mapper.delete(dto);
		
		return null;
	}
	
	void fileDelete(String ff, HttpServletRequest request) {
		
		String path = request.getServletContext().getRealPath("/fff");
		path = "D:\\public\\onop\\2025_09\\public\\study\\java_work\\mybatisprj\\src\\main\\webapp\\fff";
		
		new File(path+"//"+ff).delete();
		
	}

}
