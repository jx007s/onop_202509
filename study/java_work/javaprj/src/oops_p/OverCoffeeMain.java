package oops_p;
//커피를 주문하세요
//
//아메리카노       : 주문(원두종류)  - 3000
//카페라떼         : 주문(원두종류, 우유량) - 3300
//카라멜마끼아또  : 주문(원두종류, 우유량, 카레멜 시럽) - 3500
//카페모카         : 주문(원두종류, 우유량, 휘핑있음없음) - 3500
//
//ex)  
//주문("콜롬비아")  -- 아메리카노
//주문("콜롬비아", 30)  -- 카페라떼
//주문("칠레")  -- 아메리카노
//주문("콜롬비아", 30,20)  -- 카라멜마끼아또  
//주문("콜롬비아", 30,true)  -- 카페모카
//        
//각 커피별 주문 수량과 총금액을 출력하세요

class OverCoffeeData{
	String title;
	int price, cnt;
	void init(String title,	int price) {
		this.title = title;
		this.price = price;
	}
	
	void ppp() {
		System.out.println(title+"\t"+price+"\t"+cnt+"\t"+price*cnt);
	}
}

class OverCoffeeShop{
	OverCoffeeData [] coffeeData = {
			makeData("아메리카노", 3000),
			makeData("카페라떼", 3300),
			makeData("카라멜마끼아또", 3500),
			makeData("카페모카", 3500)
	};
	
//	void init() {
//		coffeeData = new OverCoffeeData[4];
//		for (int i = 0; i < coffeeData.length; i++) {
//			coffeeData[i] = new OverCoffeeData();
//			
//		}
//		coffeeData[0].init("아메리카노", 3000);
//	}
	OverCoffeeData makeData(String title,	int price) {
		OverCoffeeData res = new OverCoffeeData();
		res.init(title,	price);
		return res;
	}
	
	
	void ppp() {
		for (OverCoffeeData overCoffeeData : coffeeData) {
			overCoffeeData.ppp();
		}
	}
	
	void order(String bean) {
		coffeeData[0].cnt++;
		System.out.println(bean+" 아메리카노 주문");
	}
	
	void order(String bean, int milk) {
		coffeeData[1].cnt++;
		System.out.println(bean+" 카페라떼 주문");
	}
	
	void order(String bean, int milk , int syrup) {
		coffeeData[2].cnt++;
		System.out.println(bean+" 카라멜마끼아또 주문");
	}
	
	void order(String bean, int milk , boolean whipping) {
		coffeeData[3].cnt++;
		System.out.println(bean+" 카페모카 주문");
	}
}

public class OverCoffeeMain {

	public static void main(String[] args) {
		OverCoffeeShop shop = new OverCoffeeShop();
		//shop.init();
		shop.order("콜롬비아");
		shop.order("콜롬비아", 30,20);  
		shop.order("콜롬비아", 30,true);
		shop.order("칠레");
		shop.order("콜롬비아", 30); 
		shop.ppp();
	}

}

//사원 명단을 출력하세요
//멤버는 클래스로 정의하며
//클래스 요소는 부서마다 다름
//총무부 - 사원명, 사원번호, 연봉
//웹부 - 사원명, 사원번호,연봉, 특기
//영업부 - 사원명, 사원번호, 실적건수
//같은이름의 메소드로 출력하세요(오버로딩)








