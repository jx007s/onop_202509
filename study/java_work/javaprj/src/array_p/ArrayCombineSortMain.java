package array_p;

import java.util.Arrays;

public class ArrayCombineSortMain {

	public static void main(String[] args) {
		/*
		두개의 숫자 조합을 합쳐 오름차순으로 정렬하세요

		*/
		int [] arr1 = {34,7,100,9,67,10,86};
		int [] arr2 = {13,56,49,67,82,23,45,8,17};
		
		int [] arr3 = new int[arr1.length+arr2.length];
		
		int no = 0;
		for (int e : arr1) {
			System.out.println(e);
			arr3[no] = e;
			no++;
		}
		System.out.println("arr3 :"+Arrays.toString(arr3));
		for (int e : arr2) {
			System.out.println(e);
			arr3[no] = e;
			no++;
		}
		System.out.println("arr3 :"+Arrays.toString(arr3));
		
		for (int me = 0; me < arr3.length; me++) {
			
			System.out.println("me : "+arr3[me]);
			for (int you = me+1; you < arr3.length; you++) {
				if(arr3[me]>arr3[you]) {
					int buf = arr3[me];
					arr3[me]= arr3[you];
					arr3[you] = buf;
				}
				System.out.print(arr3[you]+",");
			}
			
			System.out.println();
		}
		System.out.println("arr3 :"+Arrays.toString(arr3));
		
		
	}

}
