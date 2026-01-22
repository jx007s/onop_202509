package aaa;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import aaa.di.EventINterCeptor;
import jakarta.annotation.Resource;

@Configuration
public class CorsConfig implements WebMvcConfigurer{
	@Resource
	EventINterCeptor eventIc;
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
		registry.addMapping("/rest/**")  //엔드포인트
		.allowedOrigins("http://192.168.0.78:7777") //허용 Origin
		.allowedMethods("GET","POST","PUT","DELETE")
		.allowCredentials(true);	//인증 정보 전송 허용
	}
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("addInterceptors 실행");
		
		 registry.addInterceptor(eventIc)
		 .addPathPatterns("/inter/event/**")
		 .excludePathPatterns("/inter/event/efg");
	}
}
