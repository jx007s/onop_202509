package coll_p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		int [] ori = {33,66,44,77,11,33,55,88,99,44,66,77,22,11,44};
		ArrayList arr = new ArrayList();				//중복 O, 입력순서
		HashSet hs = new HashSet();					//중복 X, 순서 X
		LinkedHashSet lhs = new LinkedHashSet();		//중복 X, 입력순서
		TreeSet ts = new TreeSet();					//중복 X, 오름차순정렬
		
		for (int i :ori) {
			arr.add(i);
			hs.add(i);
			lhs.add(i);
			ts.add(i);
		}
		
		arr.add("아기상어");
		hs.add("아기상어");
		lhs.add("아기상어");
	//	ts.add("아기상어");		모든 원소가 비교가능해야 한다.
		
		System.out.println("arr:"+arr);
		System.out.println("hs:"+hs);
		System.out.println("lhs:"+lhs);
		System.out.println("ts:"+ts);
		//lhs.get(0)
		System.out.println("[LinkedHashSet]");
		System.out.println("getFirst() "+lhs.getFirst());	//jdk21 이상만
		System.out.println("getLast() "+lhs.getLast());		//jdk21 이상만
		
		System.out.println("[TreeSet]");
		System.out.println("first() "+ts.first());			//맨앞
		System.out.println("last() "+ts.last());				//맨뒤
		System.out.println("lower(35) "+ts.lower(35)); 		//35 보다 앞의 객체
		System.out.println("lower(33) "+ts.lower(33)); 		//같은 값은 포함하지 않음
		System.out.println("higher(35) "+ts.higher(35)); 	//35 보다 뒤의 객체
		System.out.println("higher(33) "+ts.higher(33)); 	//같은 값은 포함하지 않음
		System.out.println("floor(35) "+ts.floor(35)); 		//35 보다 앞의 객체
		System.out.println("floor(33) "+ts.floor(33)); 		//같은 값 포함
		System.out.println("ceiling(35) "+ts.ceiling(35)); 	//35 보다 뒤의 객체
		System.out.println("ceiling(33) "+ts.ceiling(33)); 	//같은 값 포함
		System.out.println("ts:"+ts);
		Object rr = ts.pollFirst();				//맨앞 객체를 리턴 : TreeSet에서 삭제
		System.out.println("pollFirst() "+rr);
		System.out.println("ts:"+ts);
		rr = ts.pollLast();						//맨뒤 객체를 리턴 : TreeSet에서 삭제
		System.out.println("pollFirst() "+rr);
		System.out.println("ts:"+ts);
		
		TreeSet tsH1 = (TreeSet)ts.headSet(44);
		System.out.println("headSet(44) "+tsH1);	// 검색객체 앞 요소 SortedSet 리턴
												// 자신 포함 X
		TreeSet tsH2 = (TreeSet)ts.headSet(44, true); 	// 자신 포함
		System.out.println("headSet(44, true) "+tsH2);
		tsH2 = (TreeSet)ts.headSet(44, false); 	// 자신 포함 X
		System.out.println("headSet(44, false) "+tsH2);
		
		TreeSet tsT1 = (TreeSet)ts.tailSet(33);
		System.out.println("tailSet(33) "+tsT1);	// 검색객체 뒷 요소 SortedSet 리턴
												// 자신 포함 O
		TreeSet tsT2 = (TreeSet)ts.tailSet(33, true); 	// 자신 포함
		System.out.println("tailSet(33, true) "+tsT2);
		
		tsT2 = (TreeSet)ts.tailSet(33, false); 	// 자신 포함 X
		System.out.println("tailSet(33, false) "+tsT2);
		
		tsT2 = (TreeSet)ts.subSet(44, 77); 	// 44->66
		System.out.println("subSet(44, 77) "+tsT2);
		tsT2 = (TreeSet)ts.subSet(44, false, 77, false);//55->66 	
		System.out.println("44, false, 77, false "+tsT2);
		tsT2 = (TreeSet)ts.subSet(44, true,77, false);//44->66
		System.out.println("44, true, 77, false "+tsT2);
		tsT2 = (TreeSet)ts.subSet(44, false, 77, true);//55->77 	
		System.out.println("44, false, 66, true "+tsT2);
		tsT2 = (TreeSet)ts.subSet(44, true, 77, true);//44->77
		System.out.println("44, true, 66, true "+tsT2);
		
		TreeSet tsDESC = (TreeSet)ts.descendingSet();  //역정렬 NavigableSet 리턴
		System.out.println("descendingSet() "+tsDESC);
		
		System.out.println("Iterator -----------");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("descendingIterator -----------");
		Iterator itDESC = ts.descendingIterator();
		while(itDESC.hasNext()) {
			System.out.println(itDESC.next());
		}

	}
}

// TreeCardMain
//카드게임을 구현하세요 카드번호는 1---> 50번까지이다

//카드는 랜덤으로 10개를 받는다
 //같은 카드는 받을수 없으며, 카드는 정렬되어야 한다.
// 범인 카드는 임의로 작성한다.
 //범인 카드를 기준으로 높은 카드와 낮은 카드로 정렬되 있어야 하며
 //범인 카드를 기준으로 가까운 순서대로 출력되어야 한다.
 
//ex) 19,16, 23,11, 45,13

        // 범인카드 ---> 17 
        //높은 카드 19-23-45
        // 낮은 카드 16-13-11





