package springCore.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		System.out.println("postProcessAfterInitialization()");
		Customer cust = (Customer) bean;
		cust.setCmobile("91-9988776655");
		return cust;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		System.out.println("postProcessBeforeInitialization()");
		Customer cust = (Customer) bean;
		cust.setCemail("durga@durgasoft.com");
		return cust;
	}
}
