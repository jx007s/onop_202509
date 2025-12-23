package coll_p;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class ComData{
	String name;
	int age;
	
	ComData(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "ComData [name=" + name + ", age=" + age + "]";
	}	
}

class ComDataCom implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		
		
		ComData me = (ComData)o1;
		ComData you = (ComData)o2;
		
		int res = me.age - you.age;
		
		if(res==0) {
			res = me.name.compareTo(you.name);
		}
		return res;
	}
}

public class ComparatorMain2 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		TreeSet ts = new TreeSet(new ComDataCom());
		
		hs.add(new ComData("나훈아", 68));
		hs.add(new ComData("김연자", 58));
		
		
		ts.add(new ComData("김연자", 58));
		ts.add(new ComData("이미자", 78));
		ts.add(new ComData("송대관", 68));
		ts.add(new ComData("설운도", 65));
		ts.add(new ComData("태진아", 62));
		ts.add(new ComData("나훈아", 68));
		ts.add(new ComData(  "남진", 68));
		
		
		System.out.println("hs "+hs);
		//System.out.println("ts "+ts);
		
		for (Object obj : ts) {
			System.out.println(obj);
		}
	}

}

/*
ComSawonMain
직급, 이름순으로 정렬해 주세요 

직급 : 사장 > 부장 > 과장 > 대리 > 사원

이름 : 오름차순


사원_정우성,
과장_현빈,
부장_원빈,
과장_장동건,
사원_장서건,
대리_정남성,
대리_정좌성,
부장_이효리,
사원_삼효리,
과장_한가인,
대리_두가인"
 * */




