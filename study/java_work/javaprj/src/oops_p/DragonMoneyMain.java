package oops_p;

class DragonMoney{
	String pname;
	int myMoney = 0;
	static int mom = 100;
	
	DragonMoney(String pname) {
		this.pname = pname;
	}
	
	void showMeTheMoney(int money) {
		myMoney += money;
		mom -= money;
		System.out.println(pname+":"+money+"("+myMoney +")");
		System.out.println("\t 잔액:"+mom);
	}
	
}

public class DragonMoneyMain {

	public static void main(String[] args) {
		DragonMoney son = new DragonMoney("아들");
		DragonMoney daughter = new DragonMoney("딸");
		
		son.showMeTheMoney(15);
		daughter.showMeTheMoney(7);
		daughter.showMeTheMoney(20);
		son.showMeTheMoney(9);

	}

}


/*

아빠가 돈을 벌어오게 해주세요

-- 아빠가 용돈을 받으려고 할때 : 이사람이!!! -> 실행불가

-- 자식이 돈을 벌어올려고 할때 : 건강하게만 자라다오 -> 실행불가

* */
