package aaa.di;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class EventINterCeptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("EventINterCeptor 진입");
		
		Date endDate = new Date(2026-1900,1-1,21);
		
		if(new Date().after(endDate)) {
			response.sendRedirect("/inter/expire");
			return false;
		}
		
		
		
		return true;
	}
}
