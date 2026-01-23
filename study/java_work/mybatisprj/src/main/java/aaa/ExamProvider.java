package aaa;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import lombok.Getter;


@Service
@Getter
public class ExamProvider implements ApplicationContextAware {

	ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		context = applicationContext;
	}

}
