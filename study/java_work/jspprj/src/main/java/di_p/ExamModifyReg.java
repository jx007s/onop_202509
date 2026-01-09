package di_p;

import db_p.ExamDAO;
import db_p.ExamDTO;
import exam_p.Action;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

public class ExamModifyReg implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		ExamDTO dto = new ExamDTO();
		dto.setId(Integer.parseInt(request.getParameter("id")));
		dto.setHakgi(Integer.parseInt(request.getParameter("hakgi")));
		dto.setKor(Integer.parseInt(request.getParameter("kor")));
		dto.setEng(Integer.parseInt(request.getParameter("eng")));
		dto.setMat(Integer.parseInt(request.getParameter("mat")));
		dto.setName(request.getParameter("name"));
		dto.setPid(request.getParameter("pid"));
		dto.setPw(request.getParameter("pw"));

		
		new ExamDAO().modify(dto);
		
		request.setAttribute("id", dto.getId());
	}

}
