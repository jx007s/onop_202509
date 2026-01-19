package aqws;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamController {

	@RequestMapping("/")
	Object home() {
		return List.of(
				new Stud("원빈",77,78,72),
				new Stud("투빈",67,68,62),
				new Stud("현빈",97,98,92),
				new Stud("텅빈",57,58,52),
				new Stud("터빈",87,88,82)
				);
	}
}
