package dynamic_p;

import java.util.Arrays;

class OverStud{
	String kind, pname;
	int tot, avg;
	
	OverStud(String kind, String pname) {
		this.kind = kind;
		this.pname = pname;
	}
	
	void calc() {}
	
	void ppp() {
		calc();
		System.out.println(kind+"\t"+pname+"\t"+tot+"\t"+avg);
	}
}

class OverGen extends OverStud{
	int [] jum;

	OverGen(String pname, int kor, int eng, int mat) {
		super("일반", pname);
		this.jum = new int[] {kor, eng, mat};
	}
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
}

class OverArt extends OverStud{
	
	String [] tot;
	OverArt(String pname, String...spec) {
		super("예능", pname);
		this.tot = spec;
	}
	
	@Override
	void ppp() {
		System.out.println(kind+"\t"+pname+"\t"+Arrays.toString(tot));
	}
}



public class OverExamMain {

	public static void main(String[] args) {
		OverStud [] studs = {
			new OverGen("근육몬", 81, 62, 92),
			new OverGen("꼬마돌", 71, 52, 62),
			new OverArt("고라파덕", "소묘","수채화","목채화","금채화"),
			new OverArt("야도란", "베이스","드럼","기타","피아노")
		};
		
		for (OverStud st : studs) {
			st.ppp();
		}

	}

}


/*

자동차 성능 테스트 하세요

부모 : 자동차

자식 
스포츠카  : 속도 50 , 연비 20, 디자인 30
트럭 :    연비 60 , 적재종류 : 개당 10점
승합차 :   속도 15 , 연비 35, 탑승인원 50

으로 성능점수를 계산토록 할 것
*/
