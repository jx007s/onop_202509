package oops_p;

class BaseTeam{
	
	String name;
	String [] title = "삼진,안타,사사구".split(",");
	int [] res = new int[title.length];
	int win;
	
	BaseTeam(String name) {
		this.name = name;
	}
	int getJum() {
		return res[1]+res[2];
	}
	
	void calc(BaseTeam you) {
		if(getJum() > you.getJum()) {
			win++;
		}
	}

	@Override
	public String toString() {
		String ttt = name+" "+win+" >>>>>> \n";
		
		for (int i = 0; i < res.length; i++) {
			ttt += title[i]+"\t"+res[i]+"\n"; 
		}
		return ttt;
	}

	class Player{
		String name;
		
		int [] res = new int[title.length];
		
		Player(String name) {
			this.name = name;
		}

		void go(int i) {
			System.out.println(BaseTeam.this.name+" "+name+" "+title[i]);
			res[i]++;
			BaseTeam.this.res[i]++;
		}

		@Override
		public String toString() {
			String ttt = "["+BaseTeam.this.name+" "+name+"]\n";
			
			for (int i = 0; i < res.length; i++) {
				ttt += title[i]+"\t"+res[i]+"\n"; 
			}
			return ttt;
		}
		
	}
}

public class NestedBaseBallMain {

	public static void main(String[] args) {
		BaseTeam t1 = new BaseTeam("다이노스");
		BaseTeam t2 = new BaseTeam("자이언츠"); 
		
		BaseTeam.Player [] pps = {
				t1.new Player("권희동"),
				t1.new Player("박건우"),
				t1.new Player("천재환"),
				t1.new Player("안중열"),
				t2.new Player("황성빈"),
				t2.new Player("레이예스"),
				t2.new Player("전민재"),
				t2.new Player("이호준")
		};
		
		pps[0].go(1);
		pps[2].go(0);
		pps[3].go(2);
		pps[5].go(2);
		pps[6].go(1);
		pps[7].go(0);
		pps[1].go(1);
		pps[3].go(0);
		pps[4].go(2);
		pps[6].go(1);
		
		t1.calc(t2);
		t2.calc(t1);
		
		for (BaseTeam.Player player : pps) {
			System.out.println(player);
		}
		System.out.println(t1);
		System.out.println(t2);

	}

}

/*
커피 전문점을 구현하세요
       
         하삼동, 상남동
         지역별로 커피전문점이 존재
 
         별다방 - 창원,진주,김해
         커피콩 - 창원,부산,통영
 
                       하삼동 상남동
        아메리카노:        2000    2100
        아시아노:          2300    2500
        아프리카노:        2700    2200
        
        각 지점이 커피를 주문받으세요(각 지점에서만 주문가능)
 
        각 지점별 커피 판매내역과
        총판 커피 판매 내역을 출력하세요
 
 */






