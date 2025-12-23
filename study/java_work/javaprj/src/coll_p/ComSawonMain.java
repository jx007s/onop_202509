package coll_p;

import java.util.Comparator;
import java.util.TreeSet;

public class ComSawonMain {
	
	enum Grade{
		사장 , 부장 , 과장 , 대리 , 사원
	}
	
	class ComSawon{
		Grade grade;
		String name;
		ComSawon(String ttt) {
			String [] arr = ttt.split("_");
			
			this.grade = Grade.valueOf(arr[0]);
			this.name = arr[1];
		}
		@Override
		public String toString() {
			return "[" + grade + ", " + name + "]";
		}
	}
	
	public ComSawonMain() {
		TreeSet ts = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				ComSawon me = (ComSawon)o1;
				ComSawon you = (ComSawon)o2;
				
				int res = me.grade.ordinal()-you.grade.ordinal();
				if(res==0) {
					res = me.name.compareTo(you.name);
				}
				return res;
			}
			
		});
		
		ts.add(new ComSawon("사원_정우성"));
		ts.add(new ComSawon("과장_현빈"));;
		ts.add(new ComSawon("부장_원빈"));;
		ts.add(new ComSawon("과장_장동건"));
		ts.add(new ComSawon("사원_장서건"));
		ts.add(new ComSawon("대리_정남성"));
		ts.add(new ComSawon("대리_정좌성"));
		ts.add(new ComSawon("부장_이효리"));
		ts.add(new ComSawon("사원_삼효리"));
		ts.add(new ComSawon("과장_한가인"));
		ts.add(new ComSawon("대리_두가인"));
		
		for (Object obj : ts) {
			System.out.println(obj);
		};
	}

	public static void main(String[] args) {
		new ComSawonMain();
	}

}
