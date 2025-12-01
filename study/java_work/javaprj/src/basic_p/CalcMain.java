package basic_p;

public class CalcMain {

	public static void main(String[] args) {
		String aa = "장동건";
		int i = 10;
		boolean bo = true;
		char ch = 'h';
		
		//System.out.println(aa-i);
		//System.out.println(i-bo);
		System.out.println(i-ch);
		System.out.println(i*2);
		//System.out.println(i**2)
		
		aa = "차은우";
		String bb = "차금우";
		System.out.println(aa==bb);
		System.out.println(aa!=bb);
		//System.out.println(aa===bb);
//		System.out.println(aa>=bb);
//		System.out.println(aa<=bb);
		
		boolean bo1 = true, bo2 = true;
		System.out.println(bo1==bo2);
		System.out.println(bo1!=bo2);
//		System.out.println(bo1>=bo2);
//		System.out.println(aa==bo2);
//		System.out.println(aa==i);
		
		System.out.println(bo1 ^ bo2);
		

	}

}
