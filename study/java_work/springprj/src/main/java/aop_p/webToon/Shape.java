package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class Shape {

	public ShapeData circle(int r) {
		return new ShapeData("원",
				(int)(Math.PI*r*r), 
				(int)(Math.PI*r*2));
	}
	
	public ShapeData rectangle(int w, int h) {
		return new ShapeData("직사각형",w*h, (w+h)*2);
	}
	
	public ShapeData triangle(int w, int h, int a) {
		return new ShapeData("직각삼각형",w*h/2, w+h+a);
	}
	
}
