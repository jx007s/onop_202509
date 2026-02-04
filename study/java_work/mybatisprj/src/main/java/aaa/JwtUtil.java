package aaa;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
	//256bit 이상 필요
	private final String SECRET_KEY = "assdfghjklpoiuytrewqzxcv-1029384756fgoqerijmwgeqrpg";
	
	//JWT 생성
	public String createToken(String pid) {
		String res;
		
		res = Jwts.builder()
				.setSubject(pid)
				//토큰 발급시간
				.setIssuedAt(new Date())
				//토큰 만료시간
				.setExpiration(
					new Date(System.currentTimeMillis()+1000*60*60)
				)
				//서명 알고리즘
				.signWith(
					Keys.hmacShaKeyFor(SECRET_KEY.getBytes()),
					//SignatureAlgorithm.HS256
					Jwts.SIG.HS256
				)
				//문자열 생성
				.compact();
		return res;
	}
	
	
	// JWT-> pid 추출
	public String getPid(String token) {
		String res = null;
		
		res = Jwts.parser()
	            .verifyWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()))
	            .build()
	            .parseSignedClaims(token)
	            .getPayload()
	            .getSubject();
		
		
		return res;
	}
	
	//JWT 유효성 검사
	public boolean validate(String token) {
		try {
			getPid(token);
			//파싱 성공시 유효
			return true;
			
		} catch (Exception e) {
			// 파싱 실패 :: 만료, 위조, 형식에러
			return false;
		}
	}
}
