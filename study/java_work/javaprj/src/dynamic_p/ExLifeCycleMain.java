package dynamic_p;
/*
클래스 영역
    >static 영역
      1   부모 static 변수 공간할당 (초기값:0, null)(static 변수는 하이딩이 발생되지 않는다)
      2   부모 static 메소드
      3   부모 static 변수 값 대입
      4   자식 static 변수 공간할당 (초기값:0, null)(static 변수는 하이딩이 발생되지 않는다)
      5   자식 static 메소드      (여기서 오버라이딩이 발생)
      6   자식 static 변수 값 대입
    >method 영역
      9. 부모 인스턴스 메소드 
     10. 자식 인스턴스 메소드 (여기서 오버라이딩이 발생)

Heap 영역
      7. 부모 인스턴스 변수 메모리 공간 확보 (힙)
      8. 자식 인스턴스 변수 메모리 공간 확보 (힙)

----------------------------------------------------------------------------------

     11. 부모 인스턴스 변수 값 할당
         -이때 메소드를 호출 할 경우 오버라이딩의 유무에 따라 메소드를 실행하게 된다.
         - 만일 실행되는 메소드가 오버라이딩 된 자식 클래스의 것인 경우
         - 실행되는 메소드에서 자식 멤버 변수를 호출 할 경우 자식 멤버변수인 경우 값을 할당 받지 않았기에
             메모리 초기값이 들어오게 된다. 숫자 : 0.  문자열 : null

     12. 부모 생성자 
     13. 자식 인스턴스 변수 값 할당 
     14. 자식 생성자
 
*/

class ExLifePar{
	String a = setA();
	String b;
	static String sa = setSA();
	
	
	String setA() {
		System.out.println("부모 인스턴스 setA 실행");
		return "부모인스턴스A";
	}
	
	static String setSA() {
		System.out.println("부모 스태틱 setSA 실행");
		return "부모스태틱SA";
	}
	
	ExLifePar(String b) {
		this.b = b;
		System.out.println("부모생성자 : "+b);
	}
}


class ExLifeChild extends ExLifePar{
	String ca = setCA();
	String cd;
	static String csa = setCSA();
	
	ExLifeChild(String cd){
		super("자식생성시b");//부모생성자가 사용자 정의일 경우 반드시 기재 - 가장 우선순위
		this.cd = cd;
		System.out.println("자식 사용자 정의 생성자");
	}
	
	ExLifeChild(){
		this("기본cd");  //super를 포함한 생성자에 위임하므로 부모 생성자기재 안함
		//super("자식생성시b");  부모생성자가 가장우위에 있어야 함
		System.out.println("자식기본생성자");
	}
	
	String setCA() {
		System.out.println("자식 인스턴스 setCA 실행");
		return "자식인스턴스CA";
	}
	
	static String setCSA() {
		System.out.println("자식 스태틱 setCSA 실행");
		return "자식스태틱CSA";
	}
	
}

public class ExLifeCycleMain {

	public static void main(String[] args) {
		ExLifeChild cc1 = new ExLifeChild("cc1_cd");

	}

}
