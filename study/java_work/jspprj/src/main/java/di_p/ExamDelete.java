package di_p;

import java.io.File;

import db_p.ExamDAO;
import db_p.ExamDTO;
import exam_p.Action;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

public class ExamDelete implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		ExamDTO dto = new ExamDTO();
		dto.setId(Integer.parseInt(request.getParameter("id")));
		
		//삭제하기 전 파일 정보를 얻어온다
		ExamDTO delDTO = new ExamDAO().detail(dto.getId());
		
		//폴더 위치
		//배포시
		String dst = request.getServletContext().getRealPath("up")+"\\";
		//이클립스 작업시
		dst = "D:\\public\\onop\\2025_09\\public\\study\\java_work\\jspprj\\src\\main\\webapp\\up\\";
		//System.out.println("dst:"+dst);
		
		//파일이 존재한다면
		if(delDTO.getFf()!=null && !delDTO.getFf().equals("")) {
			new File(dst+delDTO.getFf()).delete();
		}
		
		
		
		new ExamDAO().delete(dto);

	}

}
