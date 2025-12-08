package korea_p;
///// 외부에서 패키지를 생성하고  사용하세요

import taiwan_p.Battery;
import taiwan_p.Camera;
import taiwan_p.Mic;

/// 외국(대만제) 핸드폰 부품
/// - 카메라, 마이크, 배터리 
/// 국내(삼성) 핸드폰 생성 
/// 만드는 회사 -삼성
/// 핸드폰 - 갤럭시
/// 사진찍기, 전화하기, 터지기
class HandPhone{
	Camera cam;
	Mic mic;
	Battery bat;
	
	String name;

	HandPhone(String name) {
		this.name = name;
		cam = new Camera("전방카메라","정물");
		mic = new Mic("ev", "스피치");
		bat = new Battery("리튬이온", 8);
	}
	
	void photo() {
		System.out.println(name+" "+cam.ttt()+" 사진 찍어요");
	}
	void call() {
		System.out.println(name+" "+mic.ttt()+" 전화해요");
	}
	void bomb() {
		System.out.println(name+" "+bat.ttt()+" 터져요");
	}
	
}

class Samsung{
	
}

public class PhoneMain {

	public static void main(String[] args) {
		HandPhone hp = new HandPhone("은하수");
		hp.photo();
		hp.call();
		hp.bomb();

	}

}

/*

oops_p.CapShapeMain
도형 클래스를 구현하세요

생성시에만 입력가능

직사각형 -> 가로, 세로
원 -> 반지름


출력만 가능 

도형 정보 : 도형종류(직사각형, 원), 넓이, 둘레
 * */
