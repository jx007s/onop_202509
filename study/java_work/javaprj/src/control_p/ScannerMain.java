package control_p;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int no = sc.nextInt();
		//System.out.println(no+100);
		
//		String str = sc.next();  // 엔터와 띄어쓰기로 버퍼구분
//		System.out.println("str1:"+str);
//		str = sc.next();
//		System.out.println("str2:"+str);
//		str = sc.next();
//		System.out.println("str3:"+str);
//		str = sc.next();
//		System.out.println("str4:"+str);
		
		
//		String str = sc.nextLine();// 엔터로 버퍼구분
//		System.out.println("str1:"+str);
		
		
//		byte bb = sc.nextByte();
//		System.out.println("bb:"+bb);
//		short sh = sc.nextShort();
//		System.out.println("sh:"+sh);
//		long lo = sc.nextLong();
//		System.out.println("lo:"+lo);
//		float ff = sc.nextFloat();
//		System.out.println("ff:"+ff);
//		double dd = sc.nextDouble();
//		System.out.println("dd:"+dd);
//		boolean bo = sc.nextBoolean();
//		System.out.println("bo:"+bo);
		
		
		
		String str = sc.nextLine();
		System.out.println("str1:"+str);
		
//		int no = sc.nextInt();
//		System.out.println(no+100);
		
		str = sc.nextLine();
		System.out.println("str2:"+str);
		
		int no = sc.nextInt();
		System.out.println(no+100);
		System.out.println("종료");
	}

}
