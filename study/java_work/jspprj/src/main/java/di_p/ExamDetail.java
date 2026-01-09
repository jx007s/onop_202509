package di_p;

import db_p.ExamDAO;
import exam_p.Action;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ExamDetail implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		//System.out.println("detail : "+id);
		request.setAttribute("mainData", new ExamDAO().detail(id));

	}

}
