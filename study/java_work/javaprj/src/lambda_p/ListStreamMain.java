package lambda_p;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListStreamMain {
	
	static int cnt = 0, tot = 0;

	public static void main(String[] args) throws IOException {
		List<String> arr = new ArrayList<String>();
		arr.add("바쿠야");
		arr.add("사도");
		arr.add("켄파치");
		arr.add("이치고");
		arr.add("키스케");

		System.out.println("List : "+arr);
		
		Stream<String> str = arr.stream();
		System.out.println(str);
		str.forEach(tt-> System.out.println(tt));
		str.close();
		
		
		String [] arr2 = "루피,조로,나미,상디,샹크스,로빈".split(",");
		
		System.out.println("배열 : "+arr2);
		//arr2.stream();
		Stream<String> str2 = Arrays.stream(arr2);
		str2.forEach(tt-> System.out.println(tt));
		str2.close();
		
		System.out.println("숫자범위 : range(1,5)");
		IntStream istr = IntStream.range(1, 5);
		istr.forEach(a-> System.out.println(a));
		istr.close();
		
		System.out.println("숫자범위 : rangeClosed(1,5)");
		istr = IntStream.rangeClosed(1, 5);
		istr.forEach(a-> System.out.println(a));
		istr.close();
		
		System.out.println("파일 : Files.lines()");
		Stream<String> str3 = Files.lines(new File("fff/exam.txt").toPath());
		
		str3.forEach(tt-> System.out.println(cnt++ +" : "+ tt));
		str3.close();
		
		
		/*
		숫자범위를 이용하여 1-> 100 의 합을 구하세요 
		 * */
		
		istr = IntStream.rangeClosed(1, 100);
		istr.forEach(a-> tot += a);
		istr.close();
		System.out.println("1-> 100 : "+tot);
	}

}
