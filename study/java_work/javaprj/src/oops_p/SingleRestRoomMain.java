package oops_p;


class SingleRestRoom{
	
	private static SingleRestRoom rr = null;
	
	String name = null;
	
	private SingleRestRoom() {
		System.out.println("화장실 생성");
	}
	
	static SingleRestRoom getInstance() {
		
		if(rr==null) {
			rr = new SingleRestRoom();
		}
		
		return rr;
	}
}

class SingleCustomer{
	String name, pos=null;
	SingleRestRoom srr = SingleRestRoom.getInstance();
	
	SingleCustomer(String name) {
		this.name = name;
	}
	
	void goRR() {
		System.out.println(name+" 화장실 가고 싶어요");
		
		if(srr.name==null) {
			srr.name = name;
			System.out.println(name+" 화장실 입장");
			pos = "화장실";
		}else {
			System.out.println(name+" 화장실 불가("+srr.name+" 있어요"+")");
		}
	}
	
	void outRR() {
		System.out.println(name+" 화장실 나왔어요");
		srr.name = null;
		pos = null;
	}
	
}




public class SingleRestRoomMain {

	public static void main(String[] args) {
		SingleCustomer [] scs = {
			new SingleCustomer("이광재"),
			new SingleCustomer("이우성"),
			new SingleCustomer("강동우"),
			new SingleCustomer("강민")
		};
		
		scs[0].goRR();
		scs[2].goRR();
		scs[0].outRR();
		scs[3].goRR();
		scs[2].goRR();
		scs[1].goRR();
		scs[3].outRR();
		scs[2].goRR();
	}

}
// SingleRestaurantMain
////음식점 자리를 구현하세요
/// 음식점 자리 4인석 - 2개 , 2인석 -3개
/// 일행의 인원수 보다 작은 자리는 일행이 앉을 수 없다
/// 빈자리에만 앉을 수 있다.





