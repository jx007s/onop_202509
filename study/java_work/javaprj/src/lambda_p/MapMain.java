package lambda_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapMain {

	public static void main(String[] args) {
		
		System.out.println("map ------------------");
		Arrays.stream(new int[] {11,22,33,44,55,66,77,88})
		 .map(i->i*100)
		 .forEach(i->System.out.println(i));
		
		
		System.out.println("flatMap ------------------");
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("배구,농구");
		arr.add("축구,야구,탁구");
		arr.add("족구,피구");
		arr.add("맹구,아구");
		
		arr.stream()
			.flatMap(ss->Arrays.stream(ss.split(",")) )  
			  // , 기준으로 stream --> stream 요소들을 각각의 요소로 새로운 stream 생성 
			.forEach(i->System.out.println(i));
		
		System.out.println("flatMap +  IntStream.of------------------");
		int [] arr1 = {11,22,33};
		Arrays.stream(arr1)
				.flatMap(i-> IntStream.of(i, i*10,i*100)) 
			// IntStream.of(i, i*10,i*100) => [11,110, 1100], [22,220,2200],[33,330, 3300]  
			// 					   flatMap => [11,110, 1100, 22,220,2200,33,330, 3300]
				.forEach(i->System.out.println(i));
		
		System.out.println("flatMap +  IntStream.range------------------");
		int [] arr2 = {5,8,3};
		Arrays.stream(arr2)
				.flatMap(i-> IntStream.range(1, i)) 
				.forEach(System.out::println);
		
		System.out.println("mapToInt ------------------");
		List<String> arr3 = Arrays.asList("12,34,56".split(","));
		arr3.stream()
			.mapToInt(s->Integer.parseInt(s))	// String -> int 처리한 IntStream
			.forEach(s->System.out.println(s+1000));
		
		

		System.out.println("flatMap +  mapToInt------------------");
		List<String> arr4 = Arrays.asList("12,34,56" ,"100,200" , "135,246,369,468");
		arr4.stream()
		.flatMapToInt(ss->
			Arrays.stream(ss.split(","))			//Stream<String>
			.mapToInt(s->Integer.parseInt(s))	// mapToInt : IntStream
			)  
		.forEach(s->System.out.println(s+1000));
	}
}

/*
MapStudMain
장동건,77,78,75
장서건,67,68,65
강민,97,98,95
갓동규,57,58,55
강동우,87,88,85
장남건,97,68,35
갓짝퉁,47,78,85

평균이 70점이상인 학생들을 출력하세요
*/






