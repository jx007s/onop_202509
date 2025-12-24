package coll_p;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		//map1.add(100);
		//map1.add("아기상어",100);
		map1.put("고래", "포유류");
		map1.put("상어", "어류");		// 추가 - 키가 없을 경우 추가
		map1.put("오타니", "이도류");
		map1.put("상어", "뚜루루뚜루");	// 대입 - 같은 키가 존재할 경우 대입
		map1.put("사자", "포유류");
		map1.put(100, 123.456);
		
		
		System.out.println(map1);
		
		System.out.println(map1.get("상어"));
		Object oo = map1.remove("오타니");
		System.out.println(oo);
		System.out.println(map1);
		System.out.println(map1.size());
		System.out.println(map1.containsKey(100));
		System.out.println(map1.containsKey(200));
		System.out.println(map1.containsValue("포유류"));
		
		HashMap map2 = new HashMap();
		map2.put("라면","분식");
		map2.put("자장면","중식");
		map2.put("냉면","한식");
		map2.put("개기","일식");
		
		map1.putAll(map2);
		System.out.println(map1);
		
		
		HashMap map3 = map1;
		HashMap map4 = new HashMap(map1);
		HashMap map5 = (HashMap)map1.clone();
		
		map1.put("아메리카노",2800);
		System.out.println("---------------");
		System.out.println(map1);
		System.out.println(map3);
		System.out.println(map4);
		System.out.println(map5);
		
		
		/*
		for (Object obj : map1) {
			
		} */
		
		Set ss = map1.entrySet();
		// ss = [Map.Entry , Map.Entry, Map.Entry, ... ]
		/*
		 개기=일식
		 100=123.456
		 자장면=중식
		 아메리카노=2800
		 ...
		 */
		
		System.out.println(ss);
		
		for (Object obj : ss) {
			//System.out.println(obj);
			Map.Entry me = (Map.Entry)obj;
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
		System.out.println("-------------------");
		
		ss = map1.keySet();
		
		for (Object obj : ss) {
			
			System.out.println(obj+" : "+ map1.get(obj));
		}
		
		System.out.println("-------------------");
		
		Collection vv = map1.values();
		
		for (Object obj : vv) {
			
			System.out.println(obj);
		}
		
		System.out.println("-------------------");
		
		Iterator it = map1.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey()+":"+me.getValue());
			if(me.getKey().equals("자장면")) {
				it.remove();
			}
			if(me.getValue().equals("포유류")) {
				it.remove();
			}
		}
		
		System.out.println(map1);
		System.out.println(map1.isEmpty());
		map1.clear();
		System.out.println(map1);
		System.out.println(map1.isEmpty());
		
	}

}

/*
MapNumMain
2,3,5,7 배수의 갯수를 구하세요
22,4,56,7,8,90,12,3,45,6,22,31,45,63,86,57

다음 숫자들의 각 약수들의 갯수를 구하세요 단 0,1 제외
 * */


