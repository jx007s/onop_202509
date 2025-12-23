package coll_p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;



class MyCom1 implements Comparator{
	
	@Override
	public int compare(Object me, Object you) {

		//System.out.println(me+" : "+you);
		return 1;
	}
}

public class ComparatorMain {

	public static void main(String[] args) {

		int [] data = { 67,78,34,12,45,56,67,34,78,12};
		
		ArrayList arr = new ArrayList();
		HashSet hs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		TreeSet ts1 = new TreeSet();
		TreeSet ts2 = new TreeSet(new MyCom1());
		TreeSet ts3 = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				int me = (int)o1;
				int you = (int)o2;
				
				int res = you - me;
				if(res==0) {
					res = 1;
				}
				return res;
			}
			
		});
		
		for (int d: data) {
			arr.add(d);
			hs.add(d);
			lhs.add(d);
			ts1.add(d);
			ts2.add(d);
			ts3.add(d);
			System.out.println("---------------");
		}
		
		System.out.println("arr "+arr);
		System.out.println("hs "+hs);
		System.out.println("lhs "+lhs);
		System.out.println("ts1 "+ts1);
		System.out.println("ts2 "+ts2);
		System.out.println("ts3 "+ts3);
	}

}
