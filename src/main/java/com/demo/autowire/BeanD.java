package com.demo.autowire;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class BeanD {
	public BeanD()
	{
		System.out.println("BeanD::BeanD");
	}
}
