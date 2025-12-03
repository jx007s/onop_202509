package oops_p;

import java.util.Arrays;

class ClaStud{
	String name, kind;
	int [] jum;
	int tot;
	double avg;
	double [] rate = {0.05,0.1,0.15,0.7};
	
	void init(String name, int...jum) {
		this.name = name;
		this.jum = jum;
		kind = new String[]{"일반","예능"}[jum.length-3];
		if(kind=="일반") {
			calc();
		}else {
			artCalc();
		}
		
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
	void artCalc() {
		tot = 0;
		avg = 0;
		
		for (int i = 0; i < jum.length; i++) {
			tot += jum[i];
			avg += jum[i]*rate[i];
		}
	}
	
	void ppp() {
		String ttt = kind+"\t"+name+"\t";
		ttt += Arrays.toString(jum)+"\t";
		if(kind=="일반") {
			ttt += "\t";
		}
		ttt += tot+"\t"+avg;
		
		System.out.println(ttt);
	}
	
}
//class AAA{  같은 패키지에서 같은 이름으로 클래스 정의 불가
//	
//}
public class ClassExamMain {

	public static void main(String[] args) {
//		ClaStud st1 = new ClaStud();
//		ClaStud st2 = new ClaStud();
//		st1.init("손오공", 97,69,31);
//		st2.init("크리링", 97,79,51,33);
//		st1.ppp();
//		st2.ppp();
		
		ClaStud [] stArr = new ClaStud[6];
		//stArr[0] = new ClaStud();
		for (int i = 0; i < stArr.length; i++) {
			stArr[i] = new ClaStud();
		}
				
		//System.out.println(stArr+" , "+stArr.length+" , "+Arrays.toString(stArr));
		stArr[0].init("손오공",  97,69,31);
		stArr[1].init("베지터",  97,99,91);
		stArr[2].init("크리링",  97,79,51,34);
		stArr[3].init("피콜로",  37,59,71,92);
		stArr[4].init("천진반",  67,69,61);
		stArr[5].init("무천도사", 87,89,81);
		
		for (ClaStud st : stArr) {
			st.ppp();
		}
	}

}
