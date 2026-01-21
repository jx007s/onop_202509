package aaa.mmm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class StudArrs {

	List<Stud> arr;
	
	public StudArrs() {
		arr = new ArrayList<>();
		arr.add(new Stud("aaa",97,98,92));
		arr.add(new Stud("bbb",76,68,62));
		arr.add(new Stud("ccc",77,88,52));
		
	}
}
