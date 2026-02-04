package aaa;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	private final JwtUtil jwtUtil;
	
	
	public SecurityConfig(JwtUtil jwtUtil) {

		this.jwtUtil = jwtUtil;
	}


	@Bean
	public CorsFilter corsFilter() {
		
		
		//CORS 정책
		CorsConfiguration config = new CorsConfiguration();
		
		// 헤더 쿠키 등 인증정보 전송 허용
		config.setAllowCredentials(true);
		
		// 허용할 프론트앤드
		config.addAllowedOrigin("http://192.168.0.78:3000");
		
		//모든 헤더 허용 - "Content-Type"  등등
		config.addAllowedHeader("*");
		
		//모든 메소드 허용 - GET, POST, PUT, DELETE 등
		config.addAllowedMethod("*");
		
		//URL 패턴별 cors 정책 관리
		UrlBasedCorsConfigurationSource source = 
				new UrlBasedCorsConfigurationSource();
		
		// 경로에 정책허용
		source.registerCorsConfiguration("/**", config);
		
		
		return new CorsFilter(source);
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) {
		
		try {
			//CORS 활성화
			//  CorsFilter 설정 사용
			http.cors(cors->{})
			
			//CSRF 비활성  :: 세션/쿠키 기반을 쓰지 않겠다
			.csrf(csrf->csrf.disable())
			
			//세션관리 STATELESS
			.sessionManagement(session->
				session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
			
			.authorizeHttpRequests(auth->
					//  /login 은 API 인증없이 사용
				auth.requestMatchers("/login").permitAll()
					// 나머지는 JWT 인증 필요
					.anyRequest().authenticated())
			
			.addFilterBefore(new JwtFilter(jwtUtil),
					UsernamePasswordAuthenticationFilter.class);
			
			return http.build();
		} catch (Exception e) {
			return null;
		}

	}
	
	
}
