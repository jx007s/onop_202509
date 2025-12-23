package coll_p;

import java.util.TreeSet;

public class TreeCardMain {

	public static void main(String[] args) {
		TreeSet cards = new TreeSet();
		
		while(cards.size()!=10) {
			cards.add((int)(Math.random()*50+1));
		}
		int criminal = 20;
		
		//System.out.println(cards);
		TreeSet low = (TreeSet)cards.headSet(criminal);
		TreeSet high = (TreeSet)cards.tailSet(criminal);
		
		System.out.println("범인 : "+criminal);
		System.out.println("높은카드 : "+high);
		System.out.println("낮은카드 : "+low.descendingSet());

	}

}
