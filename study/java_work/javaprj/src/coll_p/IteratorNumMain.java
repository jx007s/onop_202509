package coll_p;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorNumMain {

	public static void main(String[] args) {
		ArrayList ori = new ArrayList();
		ori.add(23);
		ori.add(45);
		ori.add(46);
		ori.add(50);
		ori.add(10);
		ori.add(25);
		ori.add(32);
		ori.add(8);
		ori.add(120);
		ori.add(11);
		ori.add(67);
		ori.add(89);
		ori.add(22);
		ori.add(43);
		ori.add(61);
		ori.add(29);
		//System.out.println(ori);
		ArrayList res2 = new ArrayList();
		ArrayList res3 = new ArrayList();
		ArrayList res5 = new ArrayList();
		Iterator it = ori.iterator();
		while(it.hasNext()) {
			int i = (int)it.next();
			System.out.println(i);
			if(i%2==0) {
				res2.add(i);
			}
			if(i%3==0) {
				res3.add(i);
			}
			if(i%5==0) {
				res5.add(i);
			}
		}
		System.out.println("2의 배수 "+res2);
		System.out.println("3의 배수 "+res3);
		System.out.println("5의 배수 "+res5);
	}

}
