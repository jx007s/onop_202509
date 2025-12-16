package oops_p;

import java.util.Arrays;

/*
커피 전문점을 구현하세요
       
         하삼동, 상남동
         지역별로 커피전문점이 존재
 
         하삼동 - 창원,진주,김해
         상남동 - 창원,부산,통영
 
                       하삼동 상남동
        아메리카노:        2000    2100
        아시아노:          2300    2500
        아프리카노:        2700    2200
        
        각 지점이 커피를 주문받으세요(각 지점에서만 주문가능)
 
        각 지점별 커피 판매내역과
        총판 커피 판매 내역을 출력하세요
 
 */
class NestedCoffeeData{
	String name;
	int price, cnt, sum;
	NestedCoffeeData(String name, int price) {
		this.name = name;
		this.price = price;
	}
	NestedCoffeeData(String name) {
		this.name = name;
	}
	
	int getToT(){
		return price*cnt;
	}
	
	protected NestedCoffeeData clone() {
		
		return new NestedCoffeeData(name,price);
	}
	
	@Override
	public String toString() {
		return name + "\t" + price + "\t" + cnt +"\t" + getToT();
	}
	
	String ppp() {
		return name + "\t" +"\t" + cnt +"\t" + sum;
	}
}

class NestedCoffee{
	
	String name;
	
	NestedCoffeeData [] data;
	NestedCoffeeData tot = new NestedCoffeeData("총판 합계");
	
	
	
	NestedCoffee(String name, NestedCoffeeData... data) {
		
		this.name = name;
		this.data = data;
	}

	class Branch{
		String name;
		NestedCoffeeData [] data;
		NestedCoffeeData tot = new NestedCoffeeData("합계");

		Branch(String name) {
			this.name = name;
			
			// 커피 데이터 배열 deep Copy
			data = NestedCoffee.this.data.clone();
			
			// 각 커피 데이터 deep Copy
			for (int i = 0; i < data.length; i++) {
				data[i] = NestedCoffee.this.data[i].clone();
			}
		}
		
		void order(String name) {
			
			int i =-1;
			//주문메뉴 번호 확인
			for (int j = 0; j < data.length; j++) {
				if(data[j].name.equals(name)) {
					i = j;
					break;
				}
			}
			data[i].cnt++;
			tot.cnt++;
			tot.sum+=data[i].price;
			
			NestedCoffee.this.data[i].cnt++;
			NestedCoffee.this.tot.cnt++;
			NestedCoffee.this.tot.sum+=data[i].price;
			System.out.println(NestedCoffee.this.name+" "+this.name+" "+name+"("+data[i].price+") 주문");
		}

		@Override
		public String toString() {
			String ttt = "["+NestedCoffee.this.name+" " + name + "]";
			
			for (NestedCoffeeData nd : data) {
				ttt+="\n"+nd;
			}
			ttt +="\n--------------------------------------\n";
			ttt +=tot.ppp();
			return ttt;
		}	
	}
	
	
	@Override
	public String toString() {
		String ttt = name + ">>>>>>>>>>>>>>>>>";
		
		for (NestedCoffeeData nd : data) {
			ttt+="\n"+nd;
		}
		ttt +="\n--------------------------------------\n";
		ttt +=tot.ppp();
		return ttt;
	}
}


public class NestedCoffeeMain {

	public static void main(String[] args) {
		NestedCoffee shop1 = new NestedCoffee("하삼동", 
				new NestedCoffeeData("아메리카노",2000),
				new NestedCoffeeData("아시아노",2300),
				new NestedCoffeeData("아프리카노",2700)
		);
		NestedCoffee shop2 = new NestedCoffee("상남동", 
				new NestedCoffeeData("아메리카노",2100),
				new NestedCoffeeData("아시아노",2500),
				new NestedCoffeeData("아프리카노",2200)
		);
		
		NestedCoffee.Branch [] branchs = {
				shop1.new Branch("창원"),
				shop1.new Branch("진주"),
				shop1.new Branch("김해"),
				shop2.new Branch("창원"),
				shop2.new Branch("부산"),
				shop2.new Branch("통영")
		};
		branchs[0].order("아메리카노");
		branchs[4].order("아메리카노");
		branchs[1].order("아시아노");
		branchs[3].order("아메리카노");
		branchs[0].order("아프리카노");
		branchs[2].order("아시아노");
		branchs[0].order("아프리카노");
		branchs[1].order("아메리카노");
		branchs[0].order("아시아노");
		branchs[3].order("아프리카노");
		
		for (NestedCoffee.Branch branch : branchs) {
			System.out.println(branch);
		}
		System.out.println(shop1);
		System.out.println(shop2);
	}

}

