package anno_p.conffiigg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


class Stud{
	
	String name;
	int [] jum;
	int rank;
	
	void calcRank(List<Stud> studs) {
		rank = 1;
		for (Stud st : studs) {
			if(st.getAvg()>getAvg()) {
				rank++;
			}
		}
	}

	
	public Stud(String name, int... jum) {
		this.name = name;
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

@ComponentScan(basePackages = {"anno_p.conffiigg"})
public class ConfigStud {

	@Bean
	Stud st1() {
		return new Stud("창원", 87,88,89);
	}
	@Bean
	Stud st2() {
		return new Stud("창투", 67,68,69);
	}
	@Bean
	Stud st3() {
		return new Stud("창삼", 57,58,59);
	}
	@Bean
	Stud st5() {
		return new Stud("창사", 97,98,99);
	}
	@Bean
	Stud st4() {
		return new Stud("창오", 77,78,79);
	}
	
	
	
}
