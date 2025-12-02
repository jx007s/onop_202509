package array_p;

import java.util.Arrays;

public class MulArrayMain {

	public static void main(String[] args) {
		
		String [] arr2 = {"서태웅","강백호","채치수","송태섭"};
		
		String [][] arr3 = {
				{"이치고","아이젠","루키아","켐파치"},
				{"루피","샹크스"}
		};
		
		String [][] arr1 = {
				{"0_0","0_1","0_2"},
				new String [5],
				arr2,
				//arr3,
				//"나루토"
				arr3[1]
		};
		System.out.println("arr2 :"+arr2+","+Arrays.toString(arr2));
		System.out.println("arr3 :"+arr3+","+Arrays.toString(arr3[1]));
		System.out.println("arr3[1] :"+arr3[1]);
		System.out.println("arr1 :"+arr1);
		
		System.out.println("arr1[0] :"+arr1[0]+","+Arrays.toString(arr1[0]));
		System.out.println("arr1[1] :"+arr1[1]+","+Arrays.toString(arr1[1]));
		System.out.println("arr1[2] :"+arr1[2]+","+Arrays.toString(arr1[2]));
		System.out.println("arr1[3] :"+arr1[3]+","+Arrays.toString(arr1[3]));
		
		System.out.println("arr1[0][2] :"+arr1[0][2]);
		System.out.println("arr1[1][3] :"+arr1[1][3]);
		
		System.out.println(arr1[2]==arr2);
		System.out.println(arr1[3]==arr3[1]);
		
		arr2[1] = "정대만";
		arr1[3][1] = "조로";
		
		System.out.println("arr2 :"+arr2+","+Arrays.toString(arr2));
		System.out.println("arr3 :"+arr3+","+Arrays.toString(arr3[1]));
		
		System.out.println("arr1[0] :"+arr1[0]+","+Arrays.toString(arr1[0]));
		System.out.println("arr1[1] :"+arr1[1]+","+Arrays.toString(arr1[1]));
		System.out.println("arr1[2] :"+arr1[2]+","+Arrays.toString(arr1[2]));
		System.out.println("arr1[3] :"+arr1[3]+","+Arrays.toString(arr1[3]));
		

	}

}

