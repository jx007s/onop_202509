package array_p;

import java.util.Arrays;

public class ArrayEvenMain {

	public static void main(String[] args) {
		int [] ori = {67,89,23,46,12,57,83,52,91,73};
		
		/*
		int cnt = 0;
		for (int i = 0; i < ori.length; i++) {
			cnt+=1-ori[i]%2;
		}
		int [] even = new int[cnt];
		int no=0;
		for (int i = 0; i < ori.length; i++) {
			if(ori[i]%2==0) {
				even[no] = ori[i];
				no++;
			}
		}*/
		
		int [] even = {};
		
		for (int i = 0; i < ori.length; i++) {
			if(ori[i]%2==0) {
				int [] buf = new int[even.length+1];
				for (int j = 0; j < even.length; j++) {
					buf[j] = even[j];
				}
				buf[even.length] = ori[i];
				even=buf;
				
			}
		}
		
		System.out.println(Arrays.toString(even));
		
		
		/*
		ArrayCombineSortMain

		두개의 숫자 조합을 합쳐 오름차순으로 정렬하세요
		
		 34,7,100,9,67,10,86
		 
		 13,56,49,67,82,23,45,8,17
		 
		 * */
		
		
		
	}

}
