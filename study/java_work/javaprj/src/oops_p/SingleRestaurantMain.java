package oops_p;

/// 음식점 자리 4인석 - 2개 , 2인석 -3개
/// 일행의 인원수 보다 작은 자리는 일행이 앉을 수 없다
/// 빈자리에만 앉을 수 있다.

class SRSeat{
	final int cnt;
	String name = null;
	
	SRSeat(int cnt) {
		this.cnt = cnt;
	}
}

class SingleRestaurant{
	private static SingleRestaurant me=null;
	
	SRSeat [] sss = {
		new SRSeat(2),
		new SRSeat(2),
		new SRSeat(2),
		new SRSeat(4),
		new SRSeat(4),

	};
	
	private SingleRestaurant() {
		System.out.println("식당 오픈");
	}
	
	public static SingleRestaurant getInstance() {
		if(me==null) {
			me = new SingleRestaurant();
		}
		return me;
	}
	
	int getSeat(SRCustomer st) {
		int res = -1;  //자리 없음
		
		for (int i = 0; i < sss.length; i++) {
			SRSeat ss = sss[i];
			//빈자리이면서 자리 인원수가 작은 경우
			if(ss.name==null && st.cnt <=ss.cnt) {
				res = i;
				ss.name=st.name;
				break;
			}
		}
		
		return res;
	}
}

class SRCustomer{
	
	SingleRestaurant srt = SingleRestaurant.getInstance();
	
	SRCustomer(String name, int cnt) {
		this.name = name;
		this.cnt = cnt;
	}
	String name;
	int cnt;
	int pos = -1;
	
	void sitDown() {
		pos = srt.getSeat(this);
		if(pos>=0) {
			System.out.println(name+" "+pos+"자리 앉아요");
		}else {
			System.out.println(name+" "+"자리 없어요");
		}
	}
	
	void standUp() {
		System.out.println(name+" "+pos+"자리 일어났어요");
		srt.sss[pos].name=null;
		pos = -1;
		
	}
}

public class SingleRestaurantMain {

	public static void main(String[] args) {
		SRCustomer [] scs = {
			new SRCustomer("한가인", 2),
			new SRCustomer("두가인", 3),
			new SRCustomer("삼가인", 4),
			new SRCustomer("사가인", 5),
			new SRCustomer("오가인", 4),
			new SRCustomer("육가인", 1)
		};
		
		scs[0].sitDown();
		scs[1].sitDown();
		scs[2].sitDown();
		scs[3].sitDown();
		scs[4].sitDown();
		scs[5].sitDown();
		scs[1].standUp();
		scs[4].sitDown();
		scs[2].standUp();
		scs[3].sitDown();
	}

}
