package aop_p.webToon;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;


@Component
public class AopExamRes {

	private TreeMap<String, Integer> semiCnt, finalCnt;
	private Map<Integer,String> kkMap; 
	
	
	public AopExamRes() {
		kkMap=Map.of(
				0,"0_60",
				1,"0_60",
				2,"0_60",
				3,"60_80",
				4,"80_100",
				5,"80_100"
				);
		
		semiCnt=new TreeMap<>(Map.of(
				"0_60",0,
				"60_80",0,
				"80_100",0
				)) ;
		
		finalCnt=new TreeMap<>(Map.of(
				"0_60",0,
				"60_80",0,
				"80_100",0
				)) ;
	}
	
	public void semiAdd(Object oo) {
		AopStud st = (AopStud)oo;
		String kk = kkMap.get(st.getAvg()/20);
		int cnt = semiCnt.get(kk);
		semiCnt.put(kk, cnt+1);
	}
	
	public void finalAdd(Object oo) {
		AopStud st = (AopStud)oo;
		String kk = kkMap.get(st.getAvg()/20);
		int cnt = finalCnt.get(kk);
		finalCnt.put(kk, cnt+1);
	}
	String ttt="";
	@Override
	public String toString() {
		ttt="[중간고사]\n";
		semiCnt.entrySet().stream().forEach(ee-> {ttt+=ee.getKey()+":"+ee.getValue()+"\n";});
		ttt+="[기말고사]\n";
		finalCnt.entrySet().stream().forEach(ee-> {ttt+=ee.getKey()+":"+ee.getValue()+"\n";});
		return ttt;
	}
	
}
