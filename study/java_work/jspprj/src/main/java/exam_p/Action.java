package exam_p;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Action {

	void execute(HttpServletRequest request, HttpServletResponse response);
}
