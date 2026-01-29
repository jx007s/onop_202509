package aaa.di;

import aaa.model.ExamDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface ExamAction {

	Object execute(
			ExamDTO dto, 
			PageInfo pInfo,
			HttpServletRequest request,
			HttpServletResponse response);
}
