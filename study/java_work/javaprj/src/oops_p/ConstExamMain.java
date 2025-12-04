package oops_p;

import java.util.Arrays;

class ConstExam{
	String kind, pname;
	int [] jum;
	int tot, avg;
	
	ConstExam(String pname, int kor, int eng, int mat) {
		this("일반", pname, kor, eng,mat);
		avg = tot/jum.length;
	}
	
	ConstExam(String pname, int kor, int eng, int mat, int art) {
		this("예능", pname, kor, eng,mat, art);
		double [] rate = {0.05, 0.1, 0.15, 0.7};
		avg = 0;
		for (int i = 0; i < rate.length; i++) {
			avg += jum[i]*rate[i];
		}
	}
	
	ConstExam(String kind, String pname, int... jum) {
		
		this.kind = kind;
		this.pname = pname;
		this.jum = jum;
		totCalc();
	}
	void totCalc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
	}
	void ppp() {
		String ttt = kind+"\t"+pname+"\t"+Arrays.toString(jum)+"\t";
		if(kind.equals("일반")) {
			ttt+= "\t";
		}
		ttt+= tot+"\t"+avg;
		System.out.println(ttt);
	}
	
}

public class ConstExamMain {

	public static void main(String[] args) {
		ConstExam [] stud = {
			new ConstExam("일반","이누야샤",89,87,83),
			new ConstExam("가영",79,77,73),
			new ConstExam("미륵",39,57,73,92),
			new ConstExam("산고",99,77,53,32),
		};
		
		for (ConstExam st : stud) {
			st.ppp();
		}

	}

}


