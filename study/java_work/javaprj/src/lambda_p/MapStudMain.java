package lambda_p;

import java.util.Arrays;

class MapStud implements Comparable<MapStud>{
	String name;
	int avg;
	int tot = 0;
	
	MapStud(String ttt) {
		tot = 0;
		String [] arr = ttt.split(",");
		name = arr[0];
		Arrays.asList(arr).subList(1,arr.length).stream()
		.mapToInt(Integer::parseInt)
		.forEach(s->tot+=s);
		avg = tot/3;
		//System.out.println(avg);
	}
	
	@Override
	public String toString() {
		return name + "\t" + tot + "\t" + avg;
	}

	@Override
	public int compareTo(MapStud o) {
		// TODO Auto-generated method stub
		return o.avg - avg;
	}
	
	 
}

public class MapStudMain {

	public static void main(String[] args) {
		Arrays.asList(
				"장동건,77,78,75",
				"장서건,67,68,65",
				"강민,97,98,95",
				"갓동규,57,58,55",
				"강동우,87,88,85",
				"장남건,97,68,35",
				"갓짝퉁,47,78,85"
		).stream()
		.map(ss-> new MapStud(ss))
		.sorted()
		.filter(ss->ss.avg>=70)
		.forEach(System.out::println);

	}

}
