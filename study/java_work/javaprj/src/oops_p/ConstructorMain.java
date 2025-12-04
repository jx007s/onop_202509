package oops_p;

class ConstCla{
	String aa = "아기상어";
	int bb = 10;
	
	void ppp() {
		//ConstCla();
		System.out.println("ConstCla : "+aa+" , "+bb);
	}
	
	ConstCla(){
		//ConstCla("장수풍뎅이",1111) ;
		//this("장수풍뎅이",1111) ;   // 생성자 위임
		//aa = "엄마상어";
		//System.out.println("기본 생성자");
		this("장수풍뎅이",1111) ;   // 생성자 위임 -- 위임 전 실행코드 불가
		System.out.println("기본 생성자");
	}
	
	ConstCla(String aa){
		this.aa = aa;
		System.out.println("사용자 정의 생성자 1 :"+aa);
	}

	ConstCla(String aa, int bb) {
		
		this.aa = aa;
		this.bb = bb;
		System.out.println("사용자 정의 생성자 2 :"+aa+" , "+bb);
	}
	
	
}

public class ConstructorMain {

	public static void main(String[] args) {
		ConstCla cc1 = new ConstCla();
		cc1.ppp();
		ConstCla cc2 = new ConstCla("셋쇼마루");
		cc2.ppp();
		//cc1.ConstCla();  최초 생성시에만 생성자 호출
		//cc1.new ConstCla();
		ConstCla cc3 = new ConstCla("금강",30);
		cc3.ppp();

	}

}
