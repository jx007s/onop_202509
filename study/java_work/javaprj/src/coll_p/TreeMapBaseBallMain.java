package coll_p;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapBaseBallMain {

	public static void main(String[] args) {
		String [] hit =("h1,h3,h5,a2,a3,a4,h7,h8,a7,a9,"+
						"h2,a2,a3,k3,a4,a7,h5,a8,h3,"+
						"h3,a2,a4,h5,a7,h5").split(",");

		TreeMap<Character, TreeMap<Character, Integer>> res = new TreeMap();
		for (String hh : hit) {
			System.out.println(hh);
			
			char team = hh.charAt(0);
			char num = hh.charAt(1);
			
			TreeMap<Character, Integer> myTeam;
			if(res.containsKey(team)) {
				myTeam = res.get(team);
			}else {
				myTeam = new TreeMap();
			}
			
			res.put(team, myTeam);
			
			int cnt = 1;
			if(myTeam.containsKey(num)) {
				cnt+= myTeam.get(num);
			}
			
			myTeam.put(num, cnt);
		}
		
		//System.out.println(res);
		for (Map.Entry<Character, TreeMap<Character, Integer>> team : res.entrySet()) {
			
			//Map.Entry<Character, TreeMap<Character, Integer>> team = (Map.Entry)oo;
			System.out.println(team.getKey()+">>>");
			
			//for (Object ooo : ((TreeMap)team.getValue()).entrySet()) {
			for (Map.Entry<Character, Integer> player : team.getValue().entrySet()) {
				//Map.Entry<Character, Integer> player = (Map.Entry)ooo;
				System.out.println(player.getKey()+" : "+"⭐".repeat(player.getValue()) );
			}
		}
	}

}

// WordCntMain

