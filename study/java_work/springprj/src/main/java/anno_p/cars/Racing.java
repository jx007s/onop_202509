package anno_p.cars;

import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
import lombok.Data;
import lombok.ToString;


@Data
//@ToString
@Component("F1")
public class Racing {
	
	@Resource
	Wheel korWH;
	
	@Resource
	Booster bst;
}

@Component
class Limousine{
	@Resource
	Wheel kh;
	
	@Resource
	Partition pt;
	
	@Resource
	Trunk trunk;

	@Override
	public String toString() {
		return "리무진 [kh=" + kh + ", pt=" + pt + ", trunk=" + trunk + "]";
	}

	
	
}

@Component
class Truck{
	@Resource(name = "kh")
	Wheel wh;
	
	@Resource
	Trunk tr;

	@Override
	public String toString() {
		return "트럭 [wh=" + wh + ", tr=" + tr + "]";
	}
	
	
}


interface Wheel{
	
}

@Component
class KorWH implements Wheel{
	String name = "한국타이어";

	@Override
	public String toString() {
		return "Wheel [name=" + name + "]";
	}
}

@Component
class Kh implements Wheel{
	String name = "금호타이어";

	@Override
	public String toString() {
		return "Wheel [name=" + name + "]";
	}
}


@Component
class Partition{
	String meter = "유리";

	@Override
	public String toString() {
		return "Partition [meter=" + meter + "]";
	}
	
}

@Component
class Booster{
	String name="아스라다";

	@Override
	public String toString() {
		return "Booster [name=" + name + "]";
	}
	
}

@Component
class Trunk{
	int size = 1000;

	@Override
	public String toString() {
		return "Trunk [size=" + size + "]";
	}
	
}

@Component("tr")
class Boot extends Trunk{
	int size = 2000;

	@Override
	public String toString() {
		return "Boot [size=" + size + "]";
	}
	
}




