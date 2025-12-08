package oops_p;

class CapShape{
	private String name;
	private int area, border;
	
	public CapShape(int w, int h) {
		name = "직사각형";
		area = w* h;
		border = (w + h) * 2;
	}
	
	public CapShape(int r) {
		name = "원";
		final double PI = 3.14;
		area = (int)(r*r*PI);
		border = (int)(r*3*PI);
	}
	
	public void ppp() {
		System.out.println(name+"\t"+area+"\t"+border);
	}
}


public class CapShapeMain {

	public static void main(String[] args) {
		CapShape [] shapes = {
				new CapShape(5),
				new CapShape(5,6),
				new CapShape(10),
				new CapShape(10,10),
		};

		for (CapShape cs : shapes) {
			//cs.name = "직각삼각형";
			cs.ppp();
		}
	}

}
