package anno_p.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;


// bean 등록 - bean 이름은 클래스명 : 첫글자가 대문자인 경우 첫글자를 소문자로 변경
@Component
public class Camera {
	String name="인스타360";
	int pixel=1357;

	Camera() {
		System.out.println("카메라 생성자");
	}

	

	public void setName(String name) {
		this.name = name;
	}



	public void setPixel(int pixel) {
		this.pixel = pixel;
	}



	@Override
	public String toString() {
		return "Camera [name=" + name + ", pixel=" + pixel + "]";
	}
	
	
}

// bean 이름 설정 - bbtt
@Component("bbtt")
class Battery{
	String name="리튬이온";
	boolean remoeable=true;
	
	
	Battery() {
		System.out.println("Battery 생성자");
	}
	
	


	public void setName(String name) {
		this.name = name;
	}




	public void setRemoeable(boolean remoeable) {
		this.remoeable = remoeable;
	}




	@Override
	public String toString() {
		return "Battery [name=" + name + ", remoeable=" + remoeable + "]";
	}
	
	
}

@Component
class HandPhone {
	String name="어른폰";
	int price=88;
	
	
	
	HandPhone() {
		System.out.println("HandPhone 생성자");
	}
	
	@Resource
	Camera fc;
	
	Camera bc;
	
	Battery bat;
	
	
	
	public void setName(String name) {
		this.name = name;
	}



	public void setPrice(int price) {
		this.price = price;
	}


	
	public void setBat(Battery bat) {
		this.bat = bat;
	}



	@Override
	public String toString() {
		return "HandPhone [name=" + name + ", price=" + price + ", fc=" + fc + ", bc=" + bc + ", bat=" + bat + "]";
	}
}