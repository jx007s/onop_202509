package aop_p.webToon;



import org.springframework.stereotype.Component;

@Component
public class ShapeDataRes {

	int cnt=0;
	ShapeData res;
	public ShapeDataRes() {
		
		res = new ShapeData("합계",0,0);
	}
	
	public void add(ShapeData sd) {
		cnt++;
		res.area+=sd.area;
		res.border+=sd.border;
	}
	
	public String toString() {
		String ttt = res.toString()+"\n";
		ttt+=new ShapeData("평균", res.area/cnt, res.border/cnt).toString();
		return ttt;
	}
}
