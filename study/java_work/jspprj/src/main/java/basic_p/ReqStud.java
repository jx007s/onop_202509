package basic_p;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import jakarta.servlet.http.HttpServletRequest;

public class ReqStud {

	private String pname;
	
	//List<Integer> jum;
	private Map<String,Integer> jum;
	private int tot, avg;
	
	public String getPname() {
		return pname;
	}

	public int getTot() {
		return tot;
	}
	public int getAvg() {
		return avg;
	}
	
	
	public Map<String, Integer> getJum() {
		return jum;
	}

	public ReqStud(HttpServletRequest req) {

		this.pname = req.getParameter("pname");
		
		//List<Integer> jum 인 경우
//		this.jum = Arrays.stream("kor,emg,mat".split(","))
//						.map(tt->req.getParameter(tt))
//						.map(Integer::parseInt)
//						.toList();
		
		jum = Arrays.stream("kor,eng,mat".split(","))
				.collect(Collectors.toMap(
						k->k, 
						k-> Integer.parseInt(req.getParameter(k)),
						(a, b)->a,
						LinkedHashMap::new));
		
		calc();
		//System.out.println(jum);
	}
	
	private void calc() {
		tot = jum.values().stream().mapToInt(Integer::intValue).sum();
		avg = tot/jum.size();
	}
	
	
	
}
