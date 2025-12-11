package lang_p;

public class StringMain {

	public static void main(String[] args) {
		String tt1 = "아기상어";
		String tt2 = "아기상어";
		String tt3 = new String("아기상어");
		char [] arr = {'아','기','상','어'};
		String tt4 = new String(arr);
		
		System.out.println("tt1 : "+tt1);
		System.out.println("tt2 : "+tt2);
		System.out.println("tt3 : "+tt3);
		System.out.println("tt4 : "+tt4);
		
		System.out.println("toString() >>>> ");

		System.out.println("tt1 : "+tt1.toString());
		System.out.println("tt2 : "+tt2.toString());
		System.out.println("tt3 : "+tt3.toString());
		System.out.println("tt4 : "+tt4.toString());
		System.out.println("아기상어 : "+"아기상어".toString());
		
		System.out.println(" == ");
		System.out.println("tt1 == tt2 "+(tt1 == tt2));
		System.out.println("tt1 == tt3 "+(tt1 == tt3));
		System.out.println("tt1 == tt4 "+(tt1 == tt4));
		
		System.out.println("tt1 == \"아기상어\" "+(tt1 == "아기상어"));
		System.out.println("tt2 == \"아기상어\" "+(tt2 == "아기상어"));
		System.out.println("tt3 == \"아기상어\" "+(tt3 == "아기상어"));
		System.out.println("tt4 == \"아기상어\" "+(tt4 == "아기상어"));
		
		System.out.println(" equals() ");
		System.out.println("tt1.equals(tt2) "+tt1.equals(tt2));
		System.out.println("tt1.equals(tt3) "+tt1.equals(tt3));
		System.out.println("tt1.equals(tt4) "+tt1.equals(tt4));
		
		System.out.println("아기상어.equals(tt1) "+"아기상어".equals(tt1));
		System.out.println("아기상어.equals(tt2) "+"아기상어".equals(tt2));
		System.out.println("아기상어.equals(tt3) "+"아기상어".equals(tt3));
		System.out.println("아기상어.equals(tt4) "+"아기상어".equals(tt4));


	}

}
