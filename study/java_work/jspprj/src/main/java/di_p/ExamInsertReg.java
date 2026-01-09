package di_p;

import db_p.ExamDAO;
import db_p.ExamDTO;
import exam_p.Action;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

public class ExamInsertReg implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		ExamDTO dto = new ExamDTO();
		dto.setHakgi(Integer.parseInt(request.getParameter("hakgi")));
		dto.setKor(Integer.parseInt(request.getParameter("kor")));
		dto.setEng(Integer.parseInt(request.getParameter("eng")));
		dto.setMat(Integer.parseInt(request.getParameter("mat")));
		dto.setName(request.getParameter("name"));
		dto.setPid(request.getParameter("pid"));
		dto.setPw(request.getParameter("pw"));
		
		// 저장할 폴더 위치
		//배포시
		String dst = request.getServletContext().getRealPath("up")+"\\";
		//이클립스 작업시
		dst = "D:\\public\\onop\\2025_09\\public\\study\\java_work\\jspprj\\src\\main\\webapp\\up\\";
		//System.out.println("dst:"+dst);
		
		try {
			Part ff = request.getPart("ff"); 			
			
			//파일이 업로드 되었다면
			if(!ff.getSubmittedFileName().equals("")) {
			
				dto.setFf(ff.getSubmittedFileName());
				
				
					// 파일 쓰기 --> 저장
					ff.write(dst+ff.getSubmittedFileName());
					
					//임시폴더에 업로드된 파일 삭제
					ff.delete();

			}else {
				dto.setFf(null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		//System.out.println("insertReg : "+dto);
		new ExamDAO().insert(dto);
		//request.setAttribute("mainData", new ExamDAO().detail(id));

	}

}
