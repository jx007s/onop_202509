package coll_p;

import java.util.ArrayList;
import java.util.TreeSet;

public class ComShapeMain {
	enum ComShapeName{
		원, 직사각형, 직각삼각형
	}
	
	class ComShape implements Comparable{
		
		ComShapeName name;
		int area, border;
		ArrayList line = new ArrayList();
		
		ComShape(int r) {
			name = ComShapeName.원;
			area = (int)(Math.pow(r, 2)*Math.PI);
			border = (int)(r*2*Math.PI);
			line.add(r);
		}
		ComShape(int w, int h) {
			name = ComShapeName.직사각형;
			area = w * h;
			border = (w + h)*2;
			line.add(w);
			line.add(h);
		}
		ComShape(int w, int h, int a) {
			name = ComShapeName.직각삼각형;
			area = w * h / 2;
			border = w + h + a;
			line.add(w);
			line.add(h);
			line.add(a);
		}
		
		

		@Override
		public String toString() {
			return name + "\t" + area + "\t" + border+ "\t" + line;
		}
		@Override
		public int compareTo(Object o) {
			ComShape you = (ComShape)o;
			int res = name.ordinal()-you.name.ordinal();
			if(res==0) {
				res = area-you.area;
			}
			if(res==0) {
				res = you.border-border;
			}
			return res;
		}
		
	}
	
	public ComShapeMain() {
		TreeSet ts = new TreeSet();
		ts.add(new ComShape(5));
		ts.add(new ComShape(5,6));
		ts.add(new ComShape(5,6,8));
		ts.add(new ComShape(10,10));
		ts.add(new ComShape(8));
		ts.add(new ComShape(7,8));
		ts.add(new ComShape(10,15,22));
		ts.add(new ComShape(9));
		ts.add(new ComShape(4));
		ts.add(new ComShape(2,3));
		ts.add(new ComShape(4,6));
		ts.add(new ComShape(5,2,6));
		ts.add(new ComShape(15,6,17));
		ts.add(new ComShape(5));
		
		for (Object obj : ts) {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		new ComShapeMain();
	}

}

