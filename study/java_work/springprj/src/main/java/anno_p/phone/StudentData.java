package anno_p.phone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;

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
	
	@Autowired
	List<Student> studs;

	void ppp() {
		
		studs.forEach(ss->{
			ss.calcRank(studs);
			System.out.println(ss);
		});
	}
	

}
