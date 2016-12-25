package com.demo.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

		BeanA beanA = ctx.getBean("beanA", BeanA.class);

		BeanA beanA1 = ctx.getBean("beanA", BeanA.class);
		
		BeanC beanC = ctx.getBean("beanC", 		BeanC.class);

		BeanC beanC1 = ctx.getBean("beanC", 		BeanC.class);


		BeanB beanB = ctx.getBean("uniqueBean", 		BeanB.class);

		BeanB beanB1 = ctx.getBean("uniqueBean", 		BeanB.class);

		
		System.out.println(beanA == beanA1 ? "Same Instance" : "Different Instance");
		System.out.println(beanB == beanB1 ? "Same Instance" : "Different Instance");
		System.out.println(beanC == beanC1 ? "Same Instance" : "Different Instance");
		System.out.println(beanA.getUniqueBean().getBeanName());
		//System.out.println(beanA.getUniqueBean().getBeanName());
	}

}
