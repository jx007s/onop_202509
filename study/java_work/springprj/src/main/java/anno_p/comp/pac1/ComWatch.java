package anno_p.comp.pac1;

import org.springframework.stereotype.Component;

import anno_p.comp.Camera;
import jakarta.annotation.Resource;

@Component
public class ComWatch {

	String name="가민";
	
	@Resource
	Camera cam;

	@Override
	public String toString() {
		return "ComWatch [name=" + name + ", cam=" + cam + "]";
	}
	
	
}
