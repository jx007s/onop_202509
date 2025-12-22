package coll_p;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue qq = new LinkedList();
		
		st.add(11);
		st.add(22);
		st.add(33);
		
		qq.add(11);
		qq.add(22);
		qq.add(33);
		
		System.out.println("st : "+st);
		System.out.println("qq : "+qq);
		
		st.push(44);
		st.push(55);
		st.push(66);
		
		qq.offer(44);
		qq.offer(55);
		qq.offer(66);
		
		System.out.println("st : "+st);
		System.out.println("qq : "+qq);
		
		System.out.println(st.get(0));
		
		Object rr = st.pop();
		System.out.println(rr);
		System.out.println("st : "+st);
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("qq-------------------");
		rr = qq.poll();
		System.out.println(rr);
		System.out.println("qq : "+qq);
		while(!qq.isEmpty()) {
			System.out.println(qq.poll());
		}
	}

}
