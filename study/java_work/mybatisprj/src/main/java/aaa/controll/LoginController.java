package aaa.controll;

import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aaa.JwtUtil;
import aaa.model.LoginDTO;

@RestController
public class LoginController {
	
	private final JwtUtil jwtUtil;
	
	public LoginController(JwtUtil jwtUtil) {
		this.jwtUtil = jwtUtil;
	}



	@PostMapping("/login")
	Map<String, String> login(@RequestBody LoginDTO dto){
		System.out.println("백엔드로그인진입 : "+dto);
		
		if(dto.getUsername().equals("aaa") &&
				dto.getPassword().equals("1111")) {
			String token = jwtUtil.createToken(dto.getUsername());
			
			return Map.of("token",token);
		}
		
		throw new RuntimeException("인증되지 않음");
	}
	
	@RequestMapping("/hello")
	String hello(Authentication authentication) {
		System.out.println("hello 진입 "+authentication.getName());
		return "Hello "+authentication.getName();
	}
	
	
}
