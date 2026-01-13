package anno_p.phone;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.Nullable;

public class BeanInit {

	@Bean
	Camera cam1() {  //메소드 이름이 bean 이름
		System.out.println("cam1() 실행");
		
		Camera res = new Camera();
		res.name = "코닥";
		res.pixel=1000;
		return res;
		
	}
	
	@Bean
	Camera cam2() {  //메소드 이름이 bean 이름
		System.out.println("cam2() 실행");
		
		Camera res = new Camera();
		res.name = "삼성";
		res.pixel=2000;
		return res;
		
	}
	
	@Bean(name="dr1")	//bean 이름 지정
	Drone drewfewfwef(@Qualifier("cam1") Camera cam1, @Nullable Battery bbb) {
				// 매개변수로 bean 자동 결합 -- 같은 타입의 bean  이 여러개일 경우
				//	@Qualifier("bean이름") 으로 명시적 설정
		
				// @Nullable -- bean 이 없으면 null  허용
		Drone res = new Drone();
		res.name="군사용";
		res.cam = cam1;
		res.bat = bbb;
		return res;
	}
	
	@Bean
	String aaa(Camera... arr) {
		System.out.println("aaa 실행 : "+Arrays.toString( arr));
		
		return "아기상어";
	}
	
}

