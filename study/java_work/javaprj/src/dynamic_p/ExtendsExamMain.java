package dynamic_p;

class ExStud{
	String kind, pname;
	int tot, avg;
	
	
	void ppp() {
		System.out.println(kind+"\t"+pname+"\t"+tot+"\t"+avg);
	}
}

class ExGen extends ExStud{
	ExGen(String pname, int kor, int eng, int mat) {
		this.kind = "일반";
		this.pname = pname;
		tot = kor + eng + mat;
		avg = tot / 3;
	}
}

class ExArt extends ExStud{
	ExArt(String pname, int kor, int eng, int art) {
		this.kind = "예능";
		this.pname = pname;
		tot = kor + eng + art;
		avg = (int)(kor*0.1 + eng*0.2 + art*0.7);
	}
}

class ExShape{
	String pname;
	int area, border;
	void ppp() {
		System.out.println(pname+"\t"+area+"\t"+border);
	}
}
class ExRec extends ExShape{
	ExRec(int w, int h) {
		this.pname = "직사각형";
		area = w* h;
		border = (w + h)*2;
	}
}

class ExTri extends ExShape{
	ExTri(int w, int h, int a) {
		this.pname = "직각삼각형";
		area = w* h / 2;
		border = w + h + a;
	}
}

class ExCircle extends ExShape{
	ExCircle(int r) {
		final double PI = 3.141592;
		this.pname = "원";
		area = (int)(r*r*PI);
		border = (int)(r*2*PI);
	}
}

public class ExtendsExamMain {

	public static void main(String[] args) {
//		new ExGen("이상해씨", 35, 61, 93).ppp();
//		new ExArt("파이리", 35, 61, 93).ppp();
//		new ExGen("꼬부기", 95, 61, 33).ppp();
//		new ExArt("캐터피", 95, 61, 33).ppp();
//		new ExGen("구구", 65, 61, 63).ppp();
//		new ExArt("피카츄", 75, 71, 73).ppp();
//		new ExGen("식스테일", 75, 81, 93).ppp();
//		new ExArt("푸린", 75, 81, 93).ppp();
		
		ExStud [] studs = {
			new ExGen("이상해씨", 35, 61, 93),
			new ExArt("파이리", 35, 61, 93),
			new ExGen("꼬부기", 95, 61, 33),
			new ExArt("캐터피", 95, 61, 33),
			new ExGen("구구", 65, 61, 63),
			new ExArt("피카츄", 75, 71, 73),
			new ExGen("식스테일", 75, 81, 93),
			new ExArt("푸린", 75, 81, 93)
		};
		
		for (ExStud st : studs) {
			st.ppp();
		}
		
		new ExRec(5,6).ppp();
		new ExTri(5,6, 10).ppp();
		new ExCircle(5).ppp();
		new ExRec(10,10).ppp();
		new ExTri(15,13,24).ppp();
		new ExCircle(7).ppp();

	}

}


/*

 도형 클래스를 구현하세요
  부모 : 도형 -- 이름, 넓이, 둘레
   
   자식 :    넓이                  둘레
    직사각형  가로 * 세로        (가로 + 세로) * 2
    원 반지름 * 반지름 * 원주율 2 * 반지름 * 원주율
    직각삼각형 가로 * 세로 /2     가로 + 세로 + 빗변
 * */
