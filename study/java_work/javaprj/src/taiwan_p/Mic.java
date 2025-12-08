package taiwan_p;

public class Mic {

	String name, type;

	public Mic(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String ttt() {
		return "[마이크 : "+type+","+name+"]";
	}
	
}
