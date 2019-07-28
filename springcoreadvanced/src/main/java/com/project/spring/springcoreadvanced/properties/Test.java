package com.project.spring.springcoreadvanced.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/project/spring/springcoreadvanced/properties/Config.xml");
		WebApplication webApp=(WebApplication)context.getBean("web");
		System.out.println(webApp);

	}
}

