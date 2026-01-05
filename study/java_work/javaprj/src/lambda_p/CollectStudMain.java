package lambda_p;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class CollectStud{
	int ban, age, height;
	String name;
	CollectStud(int ban, String name, int age, int height) {
		super();
		this.ban = ban;
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public int getBan() {
		return ban;
	}

	public int getAge() {
		return age;
	}



	@Override
	public String toString() {
		return "[" + ban + "," + name + "," + age + "," + height + "]";
	}
	
}

public class CollectStudMain {

	public static void main(String[] args) {
		List<CollectStud> studs = List.of( 
		new CollectStud(1,"장동건", 47,180),
		new CollectStud(3,"현빈",  29,182),
		new CollectStud(3,"정우성", 37,188),
		new CollectStud(1,"원빈",  45,170)
		);
		
		//System.out.println(studs);
		Map<Integer, Set<CollectStud>> map = studs.stream()
				.collect(Collectors.groupingBy(
						CollectStud::getBan,
						Collectors.toCollection(
							()->new TreeSet(Comparator.comparingInt(CollectStud::getAge).reversed())
						)));
		
		System.out.println(map);
	}

}
