package lambda_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectMain {

	public static void main(String[] args) {
		int [] arr1 = {33,44,11,77,22,33,55,11,88,22};
		
		//java 16 이전
		List<Integer> list1 = Arrays.stream(arr1)
								.boxed() //   XXXStream -> Stream<XXX>  변환
										//   기본형(전용) stream -> 객체Stream으로 변환
								.collect(Collectors.toList());
		
		System.out.println("collect : "+list1);
		
		//java 16 이후
		list1 = Arrays.stream(arr1)
				.boxed()
				.toList();

		System.out.println("toList : "+list1);
		
		
		// HashSet
		Set<Integer> set1 = Arrays.stream(arr1)
				.boxed()
				.collect(Collectors.toSet());

		System.out.println("Collectors.toSet : "+set1);

		//LinkedHashSet
		set1 = Arrays.stream(arr1)
				.boxed()
				//.collect(Collectors.toCollection(()-> new LinkedHashSet<Integer>())); 
				//  아래와 같음
				.collect(Collectors.toCollection(LinkedHashSet<Integer>::new));

		System.out.println("toCollection(LinkedHashSet) : "+set1);
		
		
		//TreeSet - 오름차순
		set1 = Arrays.stream(arr1)
				.boxed()
				.collect(Collectors.toCollection(TreeSet::new));

		System.out.println("toCollection(TreeSet) : "+set1);
				
		//TreeSet - 내림차순
		set1 = Arrays.stream(arr1)
						.boxed()
						.collect(Collectors.toCollection(()->new TreeSet(Comparator.reverseOrder())));

		System.out.println("tTreeSet(Comparator.reverseOrder()) : "+set1);
		
		
		
		// Map - 짝수 홀수
		Map<String, List<Integer>> map = Arrays.stream(arr1)
				.boxed()
				.collect(Collectors.groupingBy(a-> a%2==0 ?"짝수" :"홀수"));

		System.out.println("groupingBy : "+map);
		
		
		// Map - 짝수set, 홀수set
		Map<String, Set<Integer>> map2 = Arrays.stream(arr1)
						.boxed()
						.collect(Collectors.groupingBy(
								a-> a%2==0 ?"짝수" :"홀수" ,
								Collectors.toSet()	
						));

				System.out.println("groupingBy(Collectors.toSet()) : "+map2);
	}

}


/*
CollectStudMain
반별로 구분하세요
-- 학생정렬 기준: 나이
반  이름   나이  키
1,"장동건", 47,180
3,"현빈",  29,182
3,"정우성", 37,188
1,"원빈",  45,170

*/


