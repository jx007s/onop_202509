package aop_p.webToon;

import java.util.Arrays;

import lombok.Data;

@Data
public class AopStud {
	String pname, title;
	int [] jum;
	int tot, avg;
	
	AopStud(String title, String pname, int... jum) {
		this.title = title;
		this.pname = pname;
		this.jum = jum;
		calc();
	}
	
	void calc() {
		tot = Arrays.stream(jum).sum();
		avg = tot/jum.length;
	}
	
	
	
}
