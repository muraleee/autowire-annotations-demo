package com.demo.autowire;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("uniqueBean")
@Lazy
public class BeanB implements BeanNameAware, AccessibleBeanName {

	private  String name;
	
	public String getBeanName() {
		return this.name;
	}

	public void setBeanName(String name) {
		System.out.println("BeanB::setBeanName : " + name);
		this.name = name;
		
	}


	
	

}
