package inter_p;


//RestaurantMain
////식당을 구현해주세요
//카운터 - 계산(몇번테이블에 얼마를), 인사
//홀 - 음식나르기(몇번테이블에 뭐를), 인사
//주방 - 설거지(그릇몇개를)
////-> 구현객체 : 알바생

interface Counter{
	void cash(int table, int money);
	void hello();
}

interface Hall{
	void serving(int table, String menu);
	void hello();
}

interface Kitchen{
	void wash(int dish);
}

interface Restaurant extends Counter, Hall,Kitchen{}

class AlbaData{
		
	AlbaData(String name) {

		this.name = name;
	}

	String name;
	
	String [] title = {"인사","계산","서빙","설거지"};
	int [] res = new int[title.length];
	
	void ppp() {
		System.out.println(name+">>>>>");
		for (int i = 0; i < res.length; i++) {
			System.out.println(title[i]+" : "+res[i]);
		}
	}
}

class Alba implements Restaurant{
	
	AlbaData myData;
	AlbaData totData;

	Alba(String name, AlbaData totData ) {
		myData = new AlbaData(name);
		this.totData = totData;
	}
	
	@Override
	public void hello() {
		myData.res[0]++;
		totData.res[0]++;
		System.out.println(myData.name+" 인사 해요");
	}
	
	@Override
	public void cash(int table, int money) {
		myData.res[1]++;
		totData.res[1]++;
		System.out.println(myData.name+" 테이블 : "+table+" "+money+" 계산해요");
	}

	@Override
	public void serving(int table, String menu) {
		myData.res[2]++;
		totData.res[2]++;
		System.out.println(myData.name+" 테이블 : "+table+" "+menu+" 서빙해요");
	}

	@Override
	public void wash(int dish) {
		myData.res[3]++;
		totData.res[3]++;
		System.out.println(myData.name+" 그릇 "+dish+" 설거지 해요");
	}
	
	
	
}

public class RestaurantMain {

	public static void main(String[] args) {
		
		AlbaData totData = new AlbaData("김밥천국");
		
		Alba [] albas = {
			new Alba("장동민",totData),
			new Alba("로브슨",totData),
			new Alba("윤성훈",totData),
			new Alba("최현수",totData)
		};

		Counter cc;
		Hall hh;
		Kitchen kk;
		cc = albas[0];
		cc.hello();
		hh = albas[1];
		hh.hello();
		hh.serving(2, "김치찌개");
		kk = albas[2];
		kk.wash(5);
		cc.cash(2, 7000);
		hh = albas[3];
		hh.serving(3, "부대찌개");
		
		for (Alba alba : albas) {
			alba.myData.ppp();
		}
		System.out.println("===============");
		totData.ppp();
	}

}

/*
스타크래프트를 구현하세요

scv -4기를 이용하여 작업
커맨드센터 : 미네랄 400
팩토리 : 미네랄 200, 가스 100
스타포트 : 미네랄 150, 가스 100

scv 1회 획득량  미네랄 : 8, 가스 : 8


커맨드 센터 --2 짓기
스타포트-1 짓기 1  수리
팩토리-2 짓기
미네랄-500
탱크-2대 수리
탱크 타기 -3
저그 공격 : 5마리


각 작업간 log 기록을 남기고
각 scv 의 작업결과와
전체 상황 log를 기록하세요
*/
