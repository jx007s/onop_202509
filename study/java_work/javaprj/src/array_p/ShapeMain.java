package array_p;

import java.util.Arrays;

public class ShapeMain {

	public static void main(String[] args) {
		int [][] lines ={ 
				{5},
				   {5,6},
				   {5,6,8},
				   {10,4},
				   {8},
				   {10,6,13}
				  };
		
		String [] kind = new String [lines.length];
		
		int [][] res = new int[lines.length][2];
		
		String [] title = {"","원","직사각형","직각삼각형"};
		for (int i = 0; i < res.length; i++) {
			int [] me = lines[i];
			int [] meRes = res[i];
			int no = me.length;
			kind[i] = title[no];
			switch(no) {
				case 1:
					meRes[0]=(int)(3.14*me[0] *me[0]);
					meRes[1]=(int)(3.14*2 *me[0]);
				break;
				case 2:
					meRes[0]=me[0] *me[1];
					meRes[1]=(me[0] +me[1])*2;
				break;
				case 3:
					meRes[0]=me[0] *me[1]/2;
					meRes[1]=me[0] +me[1]+me[2];
				break;
			}
		}
		
		for (int i = 0; i < kind.length; i++) {
			String ttt = kind[i]+"\t"+Arrays.toString(lines[i])+"\t";
			if(lines[i].length<3) {
				ttt+="\t";
			}
			ttt+=Arrays.toString(res[i]);
			
			System.out.println(ttt);
		}

	}

}
