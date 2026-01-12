package di_p;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayData {
	int [] pp1;
	List pp2;
	Set pp3;
	Map pp4;
	
	Camera [] pp5;
	List<Camera> pp6;
	
	
	
	public void setPp1(int[] pp1) {
		this.pp1 = pp1;
	}



	public void setPp2(List pp2) {
		this.pp2 = pp2;
	}



	public void setPp3(Set pp3) {
		this.pp3 = pp3;
	}



	public void setPp4(Map pp4) {
		this.pp4 = pp4;
	}



	public void setPp5(Camera[] pp5) {
		this.pp5 = pp5;
	}



	public void setPp6(List<Camera> pp6) {
		this.pp6 = pp6;
	}



	@Override
	public String toString() {
		return "ArrayData [pp1=" + Arrays.toString(pp1) + ", pp2=" + pp2 + ", pp3=" + pp3 + ", pp4=" + pp4 + ", pp5="
				+ Arrays.toString(pp5) + ", pp6=" + pp6 + "]";
	}
	
	

}
