package com.demo.autowire;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanC implements BeanNameAware, AccessibleBeanName {

	private String name;
	
	public String getBeanName() {
		return this.name;
	}

	public void setBeanName(String name) {
		System.out.println("BeanC::setBeanName : "+name);
		this.name = name;
		
	}

	

}
