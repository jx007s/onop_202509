package control_p;

import java.util.Scanner;

public class WhileCoffeeMain {

	public static void main(String[] args) {
		Scanner qwe = new Scanner(System.in);
		
		
		AAA:while(true) {
			System.out.print("메뉴 (1. 아메리카노, 2. 아프리카노, 3. 아시아노, 0.종료) :");
			
			int no = qwe.nextInt();
			String menuTitle="";
			int price = 0;
			
			switch(no) {
				case 0:
					System.out.println("주문 종료");
					break AAA;
				case 1:
					menuTitle = "아메리카노";
					price = 2500;
					break;
				case 2:
					menuTitle = "아프리카노";
					price = 2700;
					break;
				case 3:
					menuTitle = "아시아노";
					price = 3000;
					break;
			}
			
			System.out.print("수량 : ");
			int cnt = qwe.nextInt();
			
			System.out.println(menuTitle+" : "+cnt+" => "+price*cnt);
			
		}
		
		
		qwe.close();

	}

}
