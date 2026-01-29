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
public class ExamInsertReg implements ExamAction{
	
	@Resource
	ExamMapper mapper;

	@Override
	public Object execute(
			ExamDTO dto, 
			PageInfo pInfo,
			HttpServletRequest request,
			HttpServletResponse response) {
		
		
		dto.setFf(fileSave(dto.getUpff(), request));
		
		mapper.insert(dto);
		
		// 리턴이 1개 일때 기본자료형으로 리턴 가능
		int maxId = mapper.maxId();
		
		System.out.println("ExamInsertReg : "+maxId);
		
		return maxId;
	}
	
	String fileSave(MultipartFile mf, HttpServletRequest request) {
		
		String path = request.getServletContext().getRealPath("/fff");
		path = "D:\\public\\onop\\2025_09\\public\\study\\java_work\\mybatisprj\\src\\main\\webapp\\fff";
		
		File saveFile = new File(path, mf.getOriginalFilename());
		
		String newFileName = mf.getOriginalFilename();
		try {
			mf.transferTo(saveFile);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newFileName;
		
	}

}
