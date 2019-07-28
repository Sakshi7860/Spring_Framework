package com.project.springmvc.practice.spring.aop.SpringAop;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	int id;
	public void displayView()
	{
		System.out.println("Customer class");
//		int c=10/0;
//		System.out.println(c);
	}
	public int getValue()
	{
		System.out.println("GetValue");
		return 10;
	}

}
