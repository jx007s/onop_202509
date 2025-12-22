package coll_p;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
	
	static void add_1(String name, List list) {
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			list.add("아기상어");
		}
		
		
		long time = System.currentTimeMillis()-start;
		
		System.out.println("순차 추가 "+name+" : "+time);
		
	}
	
	
	static void add_2(String name, List list) {
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 30000; i++) {
			list.add(100,"엄마상어");
		}
		
		long time = System.currentTimeMillis()-start;
		
		System.out.println("비순차 추가 "+name+" : "+time);
		
	}
	
	static void remove_1(String name, List list) {
		
		long start = System.currentTimeMillis();
		
		for (int i = list.size()-1; i > 100000; i--) {
			list.remove(i);
		}
		
		long time = System.currentTimeMillis()-start;
		
		System.out.println("순차 삭제 "+name+" : "+time);
		
	}
	
	static void remove_2(String name, List list) {
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 30000; i++) {
			list.remove(200);
		}
		
		long time = System.currentTimeMillis()-start;
		
		System.out.println("비순차 삭제 "+name+" : "+time);
		
	}
	
	

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		LinkedList link = new LinkedList();
		
		add_1("arr", arr);
		add_1("link", link);
		
		add_2("arr", arr);
		add_2("link", link);
		
		remove_2("arr", arr);
		remove_2("link", link);
		
		remove_1("arr", arr);
		remove_1("link", link);

	}

}
