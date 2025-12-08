package taiwan_p;

public class Camera {

	String name, type;

	public Camera(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String ttt() {
		return "[카메라 : "+type+","+name+"]";
	}
	
}
