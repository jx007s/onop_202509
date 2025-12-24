package coll_p;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class TreeStud implements Comparable{
	final int ban;
	final String kind, name;
	final int jum;
	
	TreeStud(int ban, String kind, String name, int jum) {
		this.ban = ban;
		this.kind = kind;
		this.name = name;
		this.jum = jum;
	}

	@Override
	public String toString() {
		return ban + "\t" + kind + "\t" + name + "\t" + jum;
	}

	@Override
	public int compareTo(Object o) {
		TreeStud you = (TreeStud)o;
		int res = you.jum - jum;
		
		if(res==0) {
			res = name.compareTo(you.name);
		}
		return res;
	}
}

class MyMapCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String me = (String)o1;
		String you = (String)o2;
		return you.compareTo(me);
	}
	
}


public class TreeMapStudMain {

	public static void main(String[] args) {
		TreeStud [] ori = {
			new TreeStud(2,"예체능","원빈",77),
			new TreeStud(1,"일반","투빈",47),
			new TreeStud(4,"예체능","현빈",67),
			new TreeStud(4,"예체능","김우빈",97),
			new TreeStud(1,"일반","장희빈",27),
			new TreeStud(2,"예체능","골빈",47),
			new TreeStud(1,"일반","텅빈",87),
			new TreeStud(4,"일반","커피빈",27),
			new TreeStud(4,"일반","하얼빈",97),
			new TreeStud(2,"예체능","미스터빈",37),
			new TreeStud(1,"예체능","숙빈",77),
			new TreeStud(2,"일반","젤리빈",57),
			new TreeStud(4,"일반","속빈",97),
			new TreeStud(2,"예체능","빈빈",47),
			new TreeStud(1,"예체능","휘빈",27),
			new TreeStud(2,"일반","내빈",87),
			new TreeStud(4,"일반","허빈",47)
		};
		
		MyMapCom mmc = new MyMapCom();
		
		TreeMap res = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				int me = (int)o1;
				int you = (int)o2;
				return you-me;
			}
		});
		
		for (TreeStud st : ori) {
			TreeMap ban;
			if(res.containsKey(st.ban)) {
				ban = (TreeMap)res.get(st.ban);
			}else {
				ban = new TreeMap(mmc);
			}
			res.put(st.ban, ban);
			
			TreeSet kind;
			if(ban.containsKey(st.kind)) {
				kind = (TreeSet)ban.get(st.kind);
			}else {
				kind = new TreeSet();
			}
			ban.put(st.kind, kind);
			
			kind.add(st);
		}
		
		//System.out.println(res);
		for (Object obj1 : res.entrySet()) {
			Map.Entry banSet = (Map.Entry)obj1;
			System.out.println("["+banSet.getKey()+"]");
			
			for (Object obj2 : ((TreeMap)banSet.getValue()).entrySet()) {
				Map.Entry kindSet = (Map.Entry)obj2;
				System.out.println(kindSet.getKey()+">>>");
				
				for (Object st : (TreeSet)kindSet.getValue()) {
					System.out.println(st);
				}
			}
		}
		

	}

}

/*
TreeMapShapeMain
도형이름별로 카테고리화 하고 정렬하여 출력하세요
도형 정보 : 이름, 넓이, 둘레

정렬순서 : 이름 - 직각삼각형>원>직사각형
         넓이(오름차순)
         둘레(내림차순)

        이름 , 넓이, 둘레 모두 같을 경우 생략 
 */





