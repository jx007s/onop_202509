package aaa.mmm;

import lombok.Data;

@Data
public class Stud {
	String pname;
	int kor,eng,mat;
	
	public int getTot() {
		return kor+eng+mat;
	}
	
	public int getAvg() {
		return getTot()/3;
	}
}
