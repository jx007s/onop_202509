package anno_p.conffiigg;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class StudentData {

	@Autowired
	List<Stud> studs;

	public void ppp() {
		
		studs.forEach(ss->{
			ss.calcRank(studs);
			System.out.println(ss);
		});
	}
}
