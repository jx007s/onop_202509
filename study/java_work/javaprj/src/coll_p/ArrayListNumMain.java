package coll_p;

import java.util.ArrayList;

public class ArrayListNumMain {

	public static void main(String[] args) {
		int [] ori = {23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29 };
		ArrayList arr2 = new ArrayList();
		ArrayList arr3 = new ArrayList();
		ArrayList arr5 = new ArrayList();
		
		for (int i : ori) {
			if(i%2==0) {
				arr2.add(i);
			}
			if(i%3==0) {
				arr3.add(i);
			}
			if(i%5==0) {
				arr5.add(i);
			}
		}
		
		System.out.println("2 : "+arr2);
		System.out.println("3 : "+arr3);
		System.out.println("5 : "+arr5);
	}

}
