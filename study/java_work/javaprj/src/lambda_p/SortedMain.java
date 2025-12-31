package lambda_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class SortMem implements Comparable<SortMem>{
	String pname;
	int age;
		
	SortMem(String pname, int age) {

		this.pname = pname;
		this.age = age;
	}



	@Override
	public String toString() {
		return pname + "\t" + age;
	}



	@Override
	public int compareTo(SortMem o) {
		// TODO Auto-generated method stub
		return age - o.age;
	}	
}

class MySortMem implements Comparator<SortMem>{

	@Override
	public int compare(SortMem o1, SortMem o2) {
		// TODO Auto-generated method stub
		return o1.pname.compareTo(o2.pname);
	}
	
}

public class SortedMain {

	public static void main(String[] args) {
		int [] arr1 = {55,33,77,22,88,44,66};
		
		Arrays.stream(arr1)
				.sorted()
				.forEach(System.out::println);
		System.out.println("--------------------");
		
		List<SortMem> arr2 = Arrays.asList(
				new SortMem("주윤발", 67),
				new SortMem("장국영", 38),
				new SortMem("유덕화", 58),
				new SortMem("주성치", 48)
				);
		
		arr2.stream()
			.forEach(System.out::println);
		
		System.out.println("Comparable--------------------");
		
		arr2.stream()
		.sorted()
		.forEach(System.out::println);
	
		System.out.println("Comparable-R--------------------");
		
		arr2.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	
		System.out.println("Comparator--------------------");
		arr2.stream()
		.sorted(new MySortMem())
		.forEach(System.out::println);
	
		System.out.println("Comparator-R--------------------");
		
		arr2.stream()
		.sorted(new MySortMem().reversed())
		.forEach(System.out::println);

	}

}
