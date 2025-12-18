package basic_p;

/*
EnumSawonMain
직급별 상여율
사장(100), 부장(170), 과장(150), 대리(200), 사원(120)

이름		직급	기본급     
장동건	사원	300
장서건	과장	300
장남건	사장	300
장중건	대리	300
북두신건	부장	300
이효리	과장	400
삼효리	대리	500
사효리	사원	200
오효리	부장	500

출력
직급 이름 기본급 월급

직급순서대로 출력하세요

 * */

enum ESGrade{
	사장(1), 부장(1.70), 과장(1.50), 대리(2.00), 사원(1.20);
	
	double rate;

	private ESGrade(double rate) {
		this.rate = rate;
	}	
}

class ESawon{
	String name;
	ESGrade grade;
	int basic, money;
	
	ESawon(String name, String grade, int basic) {
		
		this.name = name;
		this.grade = ESGrade.valueOf(grade);
		this.basic = basic;
		
		money = (int)(basic*this.grade.rate);
	}
	@Override
	public String toString() {
		return grade + "\t" + name + "\t" + basic + "\t" + money;
	}
	
	
	
}

public class EnumSawonMain {

	public static void main(String[] args) {
		ESawon [] arr = {
			new ESawon("장동건",	"사원",	300),
			new ESawon("장서건",	"과장",	300),
			new ESawon("장남건",	"사장",	300),
			new ESawon("장중건",	"대리",	300),
			new ESawon("북두신건","부장",	300),
			new ESawon("이효리",	"과장",	400),
			new ESawon("삼효리",	"대리",	500),
			new ESawon("사효리",	"사원",	200),
			new ESawon("오효리",	"부장",	500)
		};
		
		for (ESGrade esg : ESGrade.values()) {
			System.out.println(esg+">>>>>>");
			for (ESawon es : arr) {
				if(esg==es.grade) {
					System.out.println(es);
				}
				
			}
		}
		

	}

}
