package pac_1;

class CapAAA{
	int abc;
	private int efg;
	private boolean hij;
	public int getEfg() {
		return efg;
	}
	public void setEfg(int efg) {
		this.efg = efg;
	}
	public boolean isHij() {
		return hij;
	}
	public void setHij(boolean hij) {
		this.hij = hij;
	}
	
//	public int getEfg() {
//		return efg;
//	}
//	
//	public void setEfg(int efg) {
//		this.efg = efg;
//	}
	
	
	
}

public class CapsuleMain {

	public static void main(String[] args) {
		CapAAA ca = new CapAAA();
		System.out.println(ca.abc);
//		System.out.println(ca.efg);
//		System.out.println(ca.hij);
		ca.setEfg(123);
		System.out.println(ca.getEfg());
		ca.setHij(true);
		System.out.println(ca.isHij());
	}

}




///// 외부에서 패키지를 생성하고  사용하세요

/// 외국(대만제) 핸드폰 부품
 /// - 카메라, 마이크, 배터리 
/// 국내(삼성) 핸드폰 생성 
/// 만드는 회사 -삼성
/// 핸드폰 - 갤럭시
/// 사진찍기, 전화하기, 터지기




