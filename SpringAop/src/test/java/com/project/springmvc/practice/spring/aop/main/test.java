package com.project.springmvc.practice.spring.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.springmvc.practice.spring.aop.SpringAop.Customer;

public class test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Config.xml");
		Customer cust=(Customer) ctx.getBean("customer");
		System.out.println(cust.getValue());
		//cust.displayView();

	}

}
