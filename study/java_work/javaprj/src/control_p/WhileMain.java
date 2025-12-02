package control_p;

import java.util.Scanner;

public class WhileMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tot = 0;
		
		
		while(true) {
		
			System.out.print("숫자입력(0 입력시 종료) :");
			
			int no = sc.nextInt();
			
			if(no==0) {
				break;
			}
			
			tot += no;
		}
		
		System.out.println("종료 : "+tot);
		
		sc.close();

	}

}


/*
WhileCoffeeMain
커피숍을 구현해 주세요

아메리카노 : 2500
아프리카노 : 2700
아시아노 : 3000


1. 아메리카노, 2. 아프리카노, 3. 아시아노
ex)
메뉴 : 2
수량 : 3
아프리카노 : 3 => 8100 

메뉴 : 0
 ==> 주문 종료
  종료시 금액합계 출력

* */
