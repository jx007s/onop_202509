package lang_p;

class ObjectShape{
	String name;
	int area, border;
	private final double PI = 3.141592;
	
	
	
	ObjectShape(String name) {
		this.name = name;
		this.area = 0;
		this.border = 0;
	}
	ObjectShape(int r) {
		name = "원";
		area = (int)(r*r*PI);
		border = (int)(r*2*PI);
	}
	ObjectShape(int w , int h) {
		name = "직사각형";
		area = w*h;
		border = (w+h)*2;
	}
	ObjectShape(int w , int h, int a) {
		name = "직각삼각형";
		area = w*h/2;
		border = w+h+a;
	}
	@Override
	public String toString() {
		return name + "\t" + area + "\t" + border;
	}
	
	@Override
	public boolean equals(Object obj) {
		return name.equals(((ObjectShape)obj).name);
	}
	void sum(ObjectShape [] shapes ) {
		//System.out.println(name);
		for (ObjectShape sh : shapes) {
			if(equals(sh)) {
				//System.out.println(sh);
				area += sh.area;
				border += sh.border;
			}
		}
	}
}

public class ObjectShapeMain {

	public static void main(String[] args) {
		ObjectShape [] shapes = {
			new ObjectShape(5),
			new ObjectShape(5,6),
			new ObjectShape(5,6,8),
			new ObjectShape(7),
			new ObjectShape(8),
			new ObjectShape(10,10),
			new ObjectShape(15,10,23),
			new ObjectShape(10),
			new ObjectShape(20,10)
		};
		
		for (ObjectShape sh : shapes) {
			System.out.println(sh);
		}
		
		System.out.println("합계 >>>>>");
		ObjectShape [] res = {
			new ObjectShape("원"),
			new ObjectShape("직사각형"),
			new ObjectShape("직각삼각형")
		};
		
		for (ObjectShape sh : res) {
			sh.sum(shapes);
		}
		
		for (ObjectShape sh : res) {
			System.out.println(sh);
		}
		

	}

}
