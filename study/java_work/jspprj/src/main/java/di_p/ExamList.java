package di_p;

import db_p.ExamDAO;
import exam_p.Action;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ExamList implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Object res = new ExamDAO().list();
		//System.out.println(res);
		
		request.setAttribute("mainData", res);

	}

}
