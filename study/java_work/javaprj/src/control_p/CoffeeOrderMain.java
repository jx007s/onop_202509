package control_p;
/*
CoffeeOrderMain
커피를 종류대로 주문받아 처리하세요


커피종류, 잔수
아메리카노 : 2000
아시아노   : 3000
아프리카노 : 4000

ex) 

커피종류 : 아프리카노 
잔수 : 3
아프리카노 3잔 : 12000원
 * */
public class CoffeeOrderMain {

	public static void main(String[] args) {
		String kind = "아프리카노";
		int price;
		int cnt = 3;
		
		switch(kind) {
		case "아메리카노":
			price=2000;
			break;
		case "아시아노":
			price=3000;
			break;
		case "아프리카노":
			price=4000;
			break;
		default:
			price=0;
			
		}
		
		int tot = price * cnt;
		System.out.println("금액:"+tot);

	}

}
