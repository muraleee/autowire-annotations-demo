package com.demo.autowire;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanA
{
	
	
	private AccessibleBeanName uniqueBean;


	public AccessibleBeanName getUniqueBean() {
		return uniqueBean;
	}

	@Resource
	public void setUniqueBean(AccessibleBeanName bean) {
		
		this.uniqueBean = bean;
	}
	
	
	

}
