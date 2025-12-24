package coll_p;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {

		HashMap mm1 = new HashMap();
		LinkedHashMap mm2 = new LinkedHashMap();
		TreeMap mm3 = new TreeMap();  //key 정렬
		
		
		
		mm1.put(11,700);
		mm1.put(55,800);
		mm1.put(33,400);
		mm1.put(66,900);
		mm1.put(88,200);
		mm1.put(77,600);
		mm1.put(44,200);
		mm1.put(22,600);
		
		mm2.put(11,700);
		mm2.put(55,800);
		mm2.put(33,400);
		mm2.put(66,900);
		mm2.put(88,200);
		mm2.put(77,600);
		mm2.put(44,200);
		mm2.put(22,600);
		
		mm3.put(11,700);
		mm3.put(55,800);
		mm3.put(33,400);
		mm3.put(66,900);
		mm3.put(88,200);
		mm3.put(77,600);
		mm3.put(44,200);
		mm3.put(22,600);
		
		System.out.println("mm1 "+mm1);
		System.out.println("mm2 "+mm2);
		System.out.println("mm3 "+mm3);
		
		//mm2.getFirst();  LinkedHashSet 처럼 getFIrst() 없음
		
		Entry et = mm3.firstEntry();
		System.out.println("firstEntry() "+et);
		Object oo = mm3.firstKey();
		System.out.println("firstKey() "+oo);
		
		et = mm3.lastEntry();
		System.out.println("lastEntry() "+et);
		oo = mm3.lastKey();
		System.out.println("lastKey() "+oo);
		
		et = mm3.lowerEntry(35);				// key가 35 바로 아래
		System.out.println("lowerEntry(35) "+et);
		oo = mm3.lowerKey(35);
		System.out.println("lowerKey(35) "+oo);
		et = mm3.lowerEntry(33);				// key 33 미포함 바로 아래 
		System.out.println("lowerEntry(33) "+et);
		oo = mm3.lowerKey(33);
		System.out.println("lowerKey(33) "+oo);
		
		et = mm3.higherEntry(35);				// key가 35 바로 위
		System.out.println("higherEntry(35) "+et);
		oo = mm3.higherKey(35);
		System.out.println("higherKey(35) "+oo);
		et = mm3.higherEntry(33);				// key 33 미포함 바로 위 
		System.out.println("higherEntry(33) "+et);
		oo = mm3.higherKey(33);
		System.out.println("higherKey(33) "+oo);
		
		et = mm3.floorEntry(35);				// key가 35 바로 아래
		System.out.println("floorEntry(35) "+et);
		oo = mm3.floorKey(35);
		System.out.println("floorKey(35) "+oo);
		et = mm3.floorEntry(33);				// key 33 포함 바로 아래 
		System.out.println("floorEntry(33) "+et);
		oo = mm3.floorKey(33);
		System.out.println("floorKey(33) "+oo);
		
		et = mm3.ceilingEntry(35);				// key가 35 바로 위
		System.out.println("ceilingEntry(35) "+et);
		oo = mm3.ceilingKey(35);
		System.out.println("ceilingKey(35) "+oo);
		et = mm3.ceilingEntry(33);				// key 33 포함 바로 위 
		System.out.println("ceilingEntry(33) "+et);
		oo = mm3.ceilingKey(33);
		System.out.println("ceilingKey(33) "+oo);
		
		et = mm3.pollFirstEntry();
		System.out.println("pollFirstEntry() "+et);
		System.out.println("mm3 "+mm3);
		et = mm3.pollLastEntry();
		System.out.println("pollLastEntry() "+et);
		System.out.println("mm3 "+mm3);
		
		NavigableMap mm4 = mm3.descendingMap();
		System.out.println("descendingMap() "+mm4);
		NavigableSet ss = mm3.descendingKeySet();
		System.out.println("descendingKeySet() "+ss);
		
		SortedMap mm5 = mm3.headMap(55);
		System.out.println("headMap(55) "+mm5);
		mm5 = mm3.headMap(55, true);
		System.out.println("headMap(55, true) "+mm5);
		mm5 = mm3.headMap(55, false);
		System.out.println("headMap(55, false) "+mm5);
		
		mm5 = mm3.tailMap(55);
		System.out.println("tailMap(55) "+mm5);
		mm5 = mm3.tailMap(55, true);
		System.out.println("tailMap(55, true) "+mm5);
		mm5 = mm3.tailMap(55, false);
		System.out.println("tailMap(55, false) "+mm5);
		
		mm5 = mm3.subMap(33,66);
		System.out.println("subMap(33,66) "+mm5);
		mm5 = mm3.subMap(33,false,66, false);
		System.out.println("(33,false,66, false) "+mm5);
		mm5 = mm3.subMap(33,true,66, false);
		System.out.println("(33,true,66, false) "+mm5);
		mm5 = mm3.subMap(33,false,66, true);
		System.out.println("(33,false,66, true) "+mm5);
		mm5 = mm3.subMap(33,true,66, true);
		System.out.println("(33,true,66, true) "+mm5);
	}

}
