package lambda_p;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FilterMain {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("상어");
		arr1.add("굴");
		arr1.add("고래상어");
		arr1.add("고래");
		arr1.add("오징어");
		arr1.add("문어");
		arr1.add("고래");
		arr1.add("고래상어");
		arr1.add("오징어");
		arr1.add("거북이");
		arr1.add("문어");

		System.out.println("distinct() -------");
		Stream<String> str = arr1.stream();
		str = str.distinct();	//중복제거
		str.forEach(tt-> System.out.println(tt));
		str.close();
		System.out.println("filter() -------");
		str = arr1.stream().filter(tt-> tt.length()>=3);
		str.forEach(tt-> System.out.println(tt));
		str.close();
		
		System.out.println("distinct()+filter() -------");
		arr1.stream()
			.distinct()
			.filter(tt-> tt.length()>=3)
			.forEach(tt-> System.out.println(tt));
	}

}
