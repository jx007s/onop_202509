package aqws;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Stud {
	String name;
	int kor, eng, mat;
	
	public int getTot() {
		return kor+eng+mat;
	}
	
	
	
	public int getAvg() {
		return getTot()/3;
	}
}
