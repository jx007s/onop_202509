package taiwan_p;

public class Battery {

	String name;
	int cell;

	public Battery(String name, int cell) {
		this.name = name;
		this.cell = cell;
	}
	
	public String ttt() {
		return "[배터리 : "+name+","+cell+"]";
	}
	
}
