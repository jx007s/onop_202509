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


//    {78,11,45,67,9,62,13,26,38,17,61,94,5}
//숫자 중 솟수와 솟수가 아닌 것을 구분지어 배열로 출력하세요
//각 구분의 합계, 평균을 구분 출력시 하단에 출력하세요

/*
* 솟수 : 11,67,13,17,61,5
* 합계, 평균
* 
* 제외 :78,45,9,62,26,38
* 합계, 평균
*  
*/

