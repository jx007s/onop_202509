package anno_p.phone;


import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
class Wheel{
	String name;
	int size;
}

@Data
@AllArgsConstructor
//@NoArgsConstructor
class CarParts{
	
	String kind, name;
	int size;
}


@Data
class BeanCar{
	String name;	
	Wheel wh;
	
	List<CarParts> parts;
}


public class BeanCarInit {
	
	@Bean
	Wheel wh() {
		Wheel res = new Wheel();
		res.name="한국타이어";
		res.size =23;
		return res;
	}
	
	@Bean
	Wheel wh2() {
		Wheel res = new Wheel();
		res.name="미쉐린";
		res.size =22;
		return res;
	}
	
	@Bean
	CarParts booster() {
		
		return new CarParts("부스터","SUGO SV-2V", 6);
	}
	
	@Bean
	CarParts trunk() {
		
		return new CarParts("짐칸","수조", 10);
	}
	
	@Bean
	CarParts partition() {
		
		return new CarParts("방음벽","유리", 5);
	}

	@Bean
	BeanCar F1(@Qualifier("wh") Wheel wh,
			@Qualifier("booster") CarParts cp
			) { 
		
		BeanCar res = new BeanCar();
		res.name="F1";
		res.wh=wh;
		res.parts = List.of(cp);
		return res;
		
	}
	
	@Bean
	BeanCar limu(@Qualifier("wh2") Wheel wh,
			@Qualifier("partition") CarParts cp1,
			@Qualifier("trunk") CarParts cp2) { 
		
		BeanCar res = new BeanCar();
		res.name="리무진";
		res.wh=wh;
		res.parts = List.of(cp1,cp2);
		return res;
		
	}
	
	@Bean
	BeanCar truck(@Qualifier("wh") Wheel wh,
			@Qualifier("trunk") CarParts cp) { 
		
		BeanCar res = new BeanCar();
		res.name="트럭";
		res.wh=wh;
		res.parts = List.of(cp);
		return res;
		
	}
	
}

