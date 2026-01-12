package di_p;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Student{
	
	String name;
	int [] jum;
	int rank;
	
	void calcRank(List<Student> studs) {
		rank = 1;
		for (Student st : studs) {
			if(st.getAvg()>getAvg()) {
				rank++;
			}
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setJum(int[] jum) {
		this.jum = jum;
	}
	
	public int getTot() {
		
		return IntStream.of(jum).sum();
	}
	
	public int getAvg() {
		
		return (int)IntStream.of(jum).average().orElse(0);
	}
	@Override
	public String toString() {
		return name + "\t" + Arrays.toString(jum) + "\t" + getTot() + "\t"
				+ getAvg() + "\t"+rank;
	}
}


public class StudentData {
	List<Student> studs;

	public void setStuds(List<Student> studs) {
		this.studs = studs;
	}

	void ppp() {
		studs.forEach(ss->ss.calcRank(studs));
		studs.forEach(ss->System.out.println(ss));
	}
	

}
