package coll_p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


class TreeMapShape implements Comparable{
	final String name;
	final int area, border;
	final int [] line;
	
	TreeMapShape(int r) {
		name = "원";
		area = (int)(Math.PI*r*r);
		border = (int)(Math.PI*r*2);
		line = new int[] {r};
	}
	
	TreeMapShape(int w, int h) {
		name = "직사각형";
		area =  w* h;
		border = (w+h)*2;
		line = new int[] {w,h};
	}
	TreeMapShape(int w, int h, int a) {
		name = "직각삼각형";
		area =  w* h/ 2;
		border = w+h+a;
		line = new int[] {w,h,a};
	}

	@Override
	public String toString() {
		return name + "\t" + area + "\t" + border + "\t"
				+ Arrays.toString(line);
	}

	@Override
	public int compareTo(Object o) {
		TreeMapShape you = (TreeMapShape)o;
		int res = area-you.area;
		if(res==0) {
			res = you.border - border;
		}
		return res;
	}
	
}

class TreeMapShCom implements Comparator {
	ArrayList arr;
	
	public TreeMapShCom() {
		arr = new ArrayList();
		arr.add("직각삼각형");
		arr.add("원");
		arr.add("직사각형");
	}

	@Override
	public int compare(Object o1, Object o2) {
		
		return arr.indexOf(o1)-arr.indexOf(o2);
	}
}

public class TreeMapShapeMain {

	public static void main(String[] args) {
		
		TreeMapShape [] ori = {
			new TreeMapShape(5),
			new TreeMapShape(5,6),
			new TreeMapShape(5,6,8),
			new TreeMapShape(10,10),
			new TreeMapShape(8),
			new TreeMapShape(7,8),
			new TreeMapShape(10,15,22),
			new TreeMapShape(9),
			new TreeMapShape(4),
			new TreeMapShape(2,3),					
			new TreeMapShape(4,6),					
			new TreeMapShape(5,2,6),				
			new TreeMapShape(15,6,17),
			new TreeMapShape(5)
		};
		
		TreeMap res = new TreeMap(new TreeMapShCom());
		for (TreeMapShape sh : ori) {
			TreeSet shapes;
			if(res.containsKey(sh.name)) {
				shapes = (TreeSet)res.get(sh.name);
			}else {
				shapes = new TreeSet();
			}
			res.put(sh.name, shapes);
			shapes.add(sh);
		}
		
		for (Object obj : res.entrySet()) {
			Map.Entry me = (Map.Entry)obj;
			System.out.println(me.getKey()+"  >>> ");
			
			for (Object vv : (TreeSet)me.getValue()) {
				System.out.println(vv);
			}
		}
	}

}
