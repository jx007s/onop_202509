package aaa.di;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import aaa.mmm.Person;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class AAAInterCeptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		Person per = (Person)request.getSession().getAttribute("pid");
		
		
		if(per==null || !per.getPid().equals("aaa")) {
			response.sendRedirect("/inter/expire");
			return false;
		}
		
		
		
		return true;
	}
}
