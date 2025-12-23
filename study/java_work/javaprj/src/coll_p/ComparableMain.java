package coll_p;

import java.util.TreeSet;

class ComData2 implements Comparable{
	String name;
	int age;
	boolean marriage;
	ComData2(String name, int age, boolean marriage) {
		this.name = name;
		this.age = age;
		this.marriage = marriage;
	}
	@Override
	public String toString() {
		return age + "\t" + marriage + "\t" + name;
	}
	@Override
	public int compareTo(Object o) {
		ComData2 you = (ComData2)o;
		int res = age-you.age;
		if(res==0) {
			if(marriage == you.marriage) {
				res=0;
			}else if(marriage) {
				res = -1;
			}else {
				res = 1;
			}
		}
		if(res==0) {
			res = name.compareTo(you.name);
		}
		
		return res;
	}
	
}

public class ComparableMain {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new ComData2("이문세", 64, true));
		ts.add(new ComData2("변진섭", 58, true));
		ts.add(new ComData2("김건모", 57, false));
		ts.add(new ComData2("김광석", 57, true));
		ts.add(new ComData2("신승훈", 58, true));
		//ts.add("조용필");
		
		for (Object obj : ts) {
			System.out.println(obj);
		}

	}

}

/*
ComShapeMain
도형을 생성하고 도형의 정보대로 정렬하여 출력하세요


도형 정보 : 이름, 넓이, 둘레

정렬순서 : 이름 - 원>직사각형>직각삼각형
         넓이(오름차순)
         둘레(내림차순)

        이름 , 넓이, 둘레 모두 같을 경우 생략 
 */



