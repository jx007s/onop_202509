package lambda_p;

import java.util.Arrays;

public class ReduceMain {

	public static void main(String[] args) {
		int [] arr = {22,55,33,88,77,44};
		int rr = Arrays.stream(arr).sum();
		System.out.println("sum : "+rr);
		
		// 수식을 원하는 대로 처리
		// 복잡한 통계수식(사용자 통계수식) 이 필요할 때 사용
		rr = Arrays.stream(arr).reduce((a,b)-> a+b).getAsInt();
		System.out.println("sum : "+rr);
		
		// 수식을 원하는 대로 처리
		rr = Arrays.stream(arr).reduce((a,b)-> {
			int res = (a-b)*2;
			System.out.println(a+","+b+":"+res);
			return res;
		}).getAsInt();
		System.out.println("reduce : "+rr);
		
		arr = new int[]{137};
		rr = Arrays.stream(arr).findFirst().orElse(0);
		System.out.println("orElse "+rr);
		
//		rr = Arrays.stream(arr).reduce((a, b)->a).getAsInt();
//		System.out.println("reduce 초기값 "+rr);
		
		rr = Arrays.stream(arr).sum();
		System.out.println("sum "+rr);
		
		// 초기값 : 연산 전에 주는 값  ==> 2468 +  arr의 원소들
		rr = Arrays.stream(arr).reduce(2468,(a,b)->a+b);
		System.out.println("reduce 초기값 "+rr);
		
		
		arr = new int[]{13,66,45,2,78,9,12,19,88,34};
		rr = Arrays.stream(arr).reduce(0,(a,b)-> {
				int res = b%2==0? a+b : a;
				System.out.println(b+":"+res);
				return res;
			});
		System.out.println("짝수들의 합 "+rr);
	}

}

/*
   13, 66,45,2,78,9,12,19,88,34
   
   reduce를 이용한 짝수들의 합을 구하세요
   단 filter 사용금지
 * 
 * 
 * */

