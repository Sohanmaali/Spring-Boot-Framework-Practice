package springCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmpConfig {

	@Bean
	public Employee getEmployee() {
		
		return new Employee();
	}
}
