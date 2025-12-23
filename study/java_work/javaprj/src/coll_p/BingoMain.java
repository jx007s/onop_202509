package coll_p;

import java.util.HashSet;
import java.util.Set;

public class BingoMain {

	public static void main(String[] args) {
		Set bingo = new HashSet();
		
		while(bingo.size()!=25) {
			bingo.add((int)(Math.random()*100+1));
		}

		int i = 0;
		for (Object obj : bingo) {
			System.out.print(obj+"\t");
			if(++i % 5 == 0) {
				System.out.println();
			}
		}
	}

}
