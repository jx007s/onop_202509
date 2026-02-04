package aaa.test;

import org.springframework.stereotype.Service;

@Service
public class Calcul {

	public int add(int aa, int bb) {
		
		System.out.println("add 실행"+aa+","+bb);
		return aa + bb;
	}
}
