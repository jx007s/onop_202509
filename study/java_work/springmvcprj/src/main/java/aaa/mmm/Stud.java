package aaa.mmm;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Stud {
	String pname, id;
	int kor,eng,mat;
	
	
	
	public int getTot() {
		return kor+eng+mat;
	}
	
	public int getAvg() {
		return getTot()/3;
	}

	public Stud(String id, int kor, int eng, int mat) {
		
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
}
