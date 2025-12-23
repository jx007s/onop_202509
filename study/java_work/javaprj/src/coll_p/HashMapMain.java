package coll_p;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		//map1.add(100);
		//map1.add("아기상어",100);
		map1.put("고래", "포유류");
		map1.put("상어", "어류");
		map1.put("오타니", "이도류");
		map1.put("상어", "뚜루루뚜루");
		map1.put("사자", "포유류");
		map1.put(100, 123.456);
		
		
		System.out.println(map1);
	}

}
