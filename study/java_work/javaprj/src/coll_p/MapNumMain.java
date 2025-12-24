package coll_p;

import java.util.HashMap;
import java.util.TreeSet;

public class MapNumMain {

	public static void main(String[] args) {
		int [] ori = {22,4,56,7,8,90,12,3,45,6,22,31,45,63,86,57};
		int [] div = {2,3,5,7};
		
		HashMap res1 = new HashMap();
		for (int i : div) {
			res1.put(i, 0);
		}

		for (int no : ori) {
			for (int i : div) {
				if(no%i==0) {
					int cnt = (int)res1.get(i)+1;
					res1.put(i, cnt);
				}
			}
		}
		
		for (Object obj : res1.entrySet()) {
			System.out.println(obj);
		}
		
		System.out.println("----------------------------");
		HashMap res2 = new HashMap();
		for (int no : ori) {
			for (int i = 2; i <no; i++) {
				if(no%i==0) {
					
					int cnt = 1;
					
					if(res2.containsKey(i)) {
						cnt += (int)res2.get(i);
					}
					
					res2.put(i,cnt);
					//System.out.print(i+",");
				}
			}
			//System.out.println(no);
		}
		
		TreeSet ts = new TreeSet(res2.keySet());
		for (Object kk : ts) {
			System.out.println(kk+":"+res2.get(kk));
		}
	}

}
