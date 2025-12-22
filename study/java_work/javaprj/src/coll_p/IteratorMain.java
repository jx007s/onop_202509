package coll_p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(22);
		arr.add(55);
		arr.add("아기상어");
		arr.add(123.456);
		arr.add(true);
		arr.add(22);
		arr.add(66);
		
		System.out.println("arr : "+arr);
		
		for (Object obj : arr) {
			if(obj.equals("아기상어")) {
				System.out.println(">>>>삭제할꺼야");
				//arr.remove(obj);  에러발생
			}
			System.out.println(obj);
		}
		System.out.println("Iterator-----------------------");
		Iterator it = arr.iterator();
		System.out.println(it.hasNext());
		Object oo = it.next();
		System.out.println(oo);
		System.out.println("arr : "+arr);
		while(it.hasNext()) {
			oo = it.next();
			if(oo.equals("아기상어")) {
				System.out.println(">>>>삭제할꺼야");
				it.remove(); // arr 에서 "아기상어" 삭제
			}
			System.out.println(oo);
		}
		System.out.println("arr : "+arr);
		
		System.out.println("ListIterator-----------------------");
		
		ListIterator lit = arr.listIterator();
		while(lit.hasPrevious()) {
			oo = lit.previous();
			System.out.println(oo);
		}
		System.out.println("-----------------------");
		
		while(lit.hasNext()) {
			oo = lit.next();
			System.out.println(oo);
		}
		System.out.println("-----------------------");
		while(lit.hasPrevious()) {
			oo = lit.previous();
			System.out.println(oo);
		}
	}

}

/*
IteratorNumMain
23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29  
2의 배수, 3의 배수, 5의 배수로 나누어 ArrayList 로 정리하세요
 단 for문 사용하지 않고 Iterator로 처리
*/




