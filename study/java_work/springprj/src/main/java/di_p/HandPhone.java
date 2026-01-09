package di_p;

class Camera{
	String name;
	int pixel;

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

class Battery{
	String name;
	boolean remoeable;
	
	
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


public class HandPhone {
	String name;
	int price;
	
	
	
	HandPhone() {
		System.out.println("HandPhone 생성자");
	}
	
	Camera fc, bc;
	Battery bat;
	
	
	
	public void setName(String name) {
		this.name = name;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public void setFc(Camera fc) {
		this.fc = fc;
	}



	public void setBc(Camera bc) {
		this.bc = bc;
	}



	public void setBat(Battery bat) {
		this.bat = bat;
	}



	@Override
	public String toString() {
		return "HandPhone [name=" + name + ", price=" + price + ", fc=" + fc + ", bc=" + bc + ", bat=" + bat + "]";
	}
	
	
	
}
