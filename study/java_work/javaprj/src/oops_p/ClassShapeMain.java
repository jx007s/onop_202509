package oops_p;

import java.util.Arrays;

class ClaShape{
	String kind;
	int area, border;
	int [] me;
	
	void init(int...line) {
		this.me = line;
		kind = new String[] {"","원","직사각형","직각삼각형"}[line.length];
		calc();
	}
	void calc() {
		int no = me.length;
		switch(no) {
		case 1:
			area=(int)(3.14*me[0] *me[0]);
			border=(int)(3.14*2 *me[0]);
		break;
		case 2:
			area=me[0] *me[1];
			border=(me[0] +me[1])*2;
		break;
		case 3:
			area=me[0] *me[1]/2;
			border=me[0] +me[1]+me[2];
		break;
		}
	}
	void ppp() {
		String ttt = kind+"\t"+Arrays.toString(me)+"\t";
		if(me.length<3) {
			ttt+="\t";
		}
		ttt+=area+"\t"+border;
		
		System.out.println(ttt);
	}
}

public class ClassShapeMain {

	public static void main(String[] args) {
		int [][] lines ={ 
				{5},
				   {5,6},
				   {5,6,8},
				   {10,4},
				   {8},
				   {10,6,13}
				  };
		
		ClaShape [] shapes = new ClaShape[lines.length];
		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = new ClaShape();
			shapes[i].init(lines[i]);
		}
		
		for (ClaShape sh : shapes) {
			sh.ppp();
		}
	}

}
