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

class Alba implements Restaurant{
	String name;
	int [] res = new int[4];

	Alba(String name) {
		this.name = name;
	}
	
	@Override
	public void hello() {
		res[0]++;
		System.out.println(name+" 인사 해요");
	}
	
	@Override
	public void cash(int table, int money) {
		res[1]++;
		System.out.println(name+" 테이블 : "+table+" "+money+" 계산해요");
	}

	@Override
	public void serving(int table, String menu) {
		res[2]++;
		System.out.println(name+" 테이블 : "+table+" "+menu+" 서빙해요");
	}

	@Override
	public void wash(int dish) {
		System.out.println(name+" 그릇 "+dish+" 설거지 해요");
	}
	
	
	
}

public class RestaurantMain {

	public static void main(String[] args) {
		Alba [] albas = {
			new Alba("장동민"),
			new Alba("로브슨"),
			new Alba("윤성훈"),
			new Alba("최현수")
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
	}

}
