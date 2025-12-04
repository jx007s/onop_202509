package oops_p;
//사원 명단을 출력하세요
//멤버는 클래스로 정의하며
//클래스 요소는 부서마다 다름
//총무부 - 사원명, 사원번호, 연봉
//웹부 - 사원명, 사원번호,연봉, 특기
//영업부 - 사원명, 사원번호, 실적건수
//같은이름의 메소드로 출력하세요(오버로딩)

class OverSawon{
	String kind, pname, sabun, spec;
	int pay;
	short cnt;
	
	void init(String pname, String sabun, int pay) {
		kind = "총무부";
		this.pname = pname;
		this.sabun = sabun;
		this.pay = pay;
	}
	
	void init(String pname, String sabun, int pay, String spec) {
		kind = "웹부";
		this.pname = pname;
		this.sabun = sabun;
		this.pay = pay;
		this.spec = spec;
	}
	
	void init(String pname, String sabun, short cnt) {
		kind = "영업부";
		this.pname = pname;
		this.sabun = sabun;
		this.cnt = cnt;
	}
	
	void ppp() {
		System.out.println(kind+"\t"+pname+"\t"+sabun+"\t"+spec+"\t"+pay+"\t"+cnt);
	}
}

class OverSawonCorp{
	OverSawon [] mem = {};
	
	void join(String pname, String sabun, int pay) {
		OverSawon res = new OverSawon();
		res.init(pname, sabun, pay);
		memAdd(res);
	}
	
	void join(String pname, String sabun, int pay, String spec) {
		OverSawon res = new OverSawon();
		res.init(pname, sabun, pay,spec);
		memAdd(res);
	}
	
	void join(String pname, String sabun, short cnt) {
		OverSawon res = new OverSawon();
		res.init(pname, sabun, cnt);
		memAdd(res);
	}
	
	void memAdd(OverSawon nMem) {
		OverSawon [] buf = new OverSawon[mem.length+1];
		for (int i = 0; i < mem.length; i++) {
			buf[i] = mem[i];
		}
		buf[mem.length] = nMem;
		mem = buf;
	}
	
	void ppp() {
		for (OverSawon os : mem) {
			os.ppp();
		}
	}
}

public class OverSawonMain {

	
	public static void main(String[] args) {
		
		OverSawonCorp cp = new OverSawonCorp();
		cp.join("이누야샤","18000114",7000);
		cp.join("미륵","18300214",7500,"풍혈");
		cp.join("가영","20020603",6500);
		cp.join("산고","18200814",7300,"무기");
		cp.join("싯포","18211114",(short)5);
		
		cp.ppp();

	}

}
