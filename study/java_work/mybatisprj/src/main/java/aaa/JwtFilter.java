package aaa;

import java.io.IOException;
import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtFilter extends OncePerRequestFilter{

	private final JwtUtil jwtUtil;

	public JwtFilter(JwtUtil jwtUtil) {
		
		this.jwtUtil = jwtUtil;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, 
			FilterChain filterChain)
			throws ServletException, IOException {

		
		//Http 헤더 에서 Authorization 읽기
		String authHeader = request.getHeader("Authorization");
		
		if(authHeader != null && authHeader.startsWith("Bearer ")) {
			
			String token = authHeader.substring(7);
			
			//토큰 검증
			if(jwtUtil.validate(token)) {
			
				//토큰에서 pid 추출
				String pid = jwtUtil.getPid(token);
				
				// Security 인증객체 생성
				UsernamePasswordAuthenticationToken auth =
						new UsernamePasswordAuthenticationToken(
								pid,			//계정
								null,		//로그인 정보 -비밀번호 토큰
								List.of()	//권한
								);
				
				
				// SecurityContext 에 인증정보 저장
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
			
		}
		
		//다음 필터로 요청 전달
		filterChain.doFilter(request, response);
	}
	
	
}
