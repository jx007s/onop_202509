package oops_p;
/*

///////// 
ConstShapeMain

도형 클래스를 구현하세요
인수의 갯수로 도형을 구분할 것
도형 : 사각형, 원, 직각삼각형
출력 : 도형(원, 사각형)의 넓이, 둘레


-----------------------------------------

사각형의 넓이 : 30, 둘레 : 22
원의 넓이 : ? , 둘레 : ?
직각삼각형의 넓이 : ?, 둘레: ?

* */
class ConstShape{
	String name;
	int area, border;
	
	ConstShape(int r) {
		this("원",(int)(3.14*r*r),(int)(3.14*2*r));
	}
	ConstShape(int w, int h) {
		this("직사각형", w*h, (w+h)*2);
	}
	ConstShape(int w, int h, int a) {
		this("직각삼각형", w*h/2, w+h+a);
	}
	
	ConstShape(String name, int area, int border) {
		this.name = name;
		this.area = area;
		this.border = border;
	}
	
	void ppp() {
		System.out.println(name+"\t"+area+"\t"+border);
	}
	
}

public class ConstShapeMain {

	public static void main(String[] args) {
		ConstShape [] shapes = {
				new ConstShape(4),
				new ConstShape(5,6),
				new ConstShape(5,6,9),
				new ConstShape(10),
				new ConstShape(10,10),
				new ConstShape(15,5,17)
		};
		
		for (ConstShape sh : shapes) {
			sh.ppp();
		}

	}

}
