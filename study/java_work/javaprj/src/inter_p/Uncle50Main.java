package inter_p;

interface Teacher{
	String kind = "강사";
	void lecture();
	void answer();
}

interface Daddy{
	String kind = "아빠";
	void play();
	void answer();
}

interface Husband{
	String kind = "남편";
	void missionComplete(String job);
}

interface Uncle50 extends Teacher, Daddy, Husband{
	
}

class Uncle50Impl implements Uncle50{
	String name;

	Uncle50Impl(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println(name+" 노라줘");
	}

	@Override
	public void lecture() {
		System.out.println(name+" 강의고고");
		
	}

	@Override
	public void answer() {
		System.out.println(name+" 대답 고고");
		
	}

	@Override
	public void missionComplete(String job) {
		System.out.println(name+" " +job+" 완료");
		
	}
	
	
}




public class Uncle50Main {

	public static void main(String[] args) {
		Uncle50Impl u5 = new Uncle50Impl("아저씨");
		Daddy dd;
		Teacher tt;
		Husband hh;
		
		dd = u5;
		System.out.println(dd.kind);
		dd.answer();
		dd.play();
		
		tt = u5;
		System.out.println(tt.kind);
		tt.lecture();
		tt.answer();
		
		hh = u5;
		System.out.println(hh.kind);
		hh.missionComplete("장보기");
	}

}

// RestaurantMain
////식당을 구현해주세요
//카운터 - 계산(몇번테이블에 얼마를), 인사
//홀 - 음식나르기(몇번테이블에 뭐를), 인사
//주방 - 설겆이(그릇몇개를)
////-> 구현객체 : 알바생





